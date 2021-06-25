package lumix.utils;

import lumix.sit.BlockPos;
import lumix.sit.EntitySit;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class SittingHandler {
   @SubscribeEvent
   public void onPlayerInteract(PlayerInteractEvent event) {
      try {
         if (!event.world.isRemote && event.action == Action.RIGHT_CLICK_BLOCK) {
            World w = event.world;
            EntityPlayer e = event.entityPlayer;
            Block b = w.getBlock(event.x, event.y, event.z);
            BlockPos p = new BlockPos(event.x, event.y, event.z);
            if (!EntitySit.OCCUPIED.containsKey(p) && e.getHeldItem() == null) {
               if (b instanceof BlockSlab) {
                  if ((w.getBlockMetadata(p.x, p.y, p.z) & 8) != 0) {
                     return;
                  }
               } else {
                  if (!(b instanceof BlockStairs)) {
                     return;
                  }

                  if ((w.getBlockMetadata(p.x, p.y, p.z) & 4) != 0) {
                     return;
                  }
               }

               EntitySit sit = new EntitySit(w, p);
               w.spawnEntityInWorld(sit);
               e.mountEntity(sit);
            }
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   @SubscribeEvent
   public void onBreak(BreakEvent event) {
      BlockPos pos = new BlockPos(event.x, event.y, event.z);
      if (EntitySit.OCCUPIED.containsKey(pos)) {
         ((EntitySit)EntitySit.OCCUPIED.get(pos)).setDead();
         EntitySit.OCCUPIED.remove(pos);
      }

   }
}

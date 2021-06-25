package lumix.sit;

import java.util.HashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntitySit extends Entity {
   public static final HashMap OCCUPIED = new HashMap();

   public EntitySit(World world) {
      super(world);
      this.noClip = true;
      this.height = 1.0E-4F;
      this.width = 1.0E-4F;
   }

   public EntitySit(World world, BlockPos pos) {
      super(world);
      this.setPosition((double)pos.x + 0.5D, (double)pos.y + 0.25D, (double)pos.z + 0.5D);
      this.noClip = true;
      this.height = 1.0E-4F;
      this.width = 1.0E-4F;
      OCCUPIED.put(pos, this);
   }

   public void onUpdate() {
      if (this.worldObj.isRemote && Minecraft.getMinecraft().gameSettings.keyBindSneak.getIsKeyPressed()) {
         this.setDead();
         OCCUPIED.remove(new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ));
      }

   }

   protected void entityInit() {
   }

   protected void readEntityFromNBT(NBTTagCompound compound) {
   }

   protected void writeEntityToNBT(NBTTagCompound compound) {
   }
}

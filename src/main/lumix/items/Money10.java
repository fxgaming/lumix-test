package lumix.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class Money10 extends Item {
	private long TICK = Long.valueOf(0L);
	long inl = 0L;
	int i1;
	public Money10()
	{
		super();
		this.setTextureName("lumixkernel:Money10");
		this.setFull3D();
	}
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List r, boolean advanced)
	{
			r.add(EnumChatFormatting.AQUA + "10 LumixCoins.");
	}
	@SideOnly(Side.CLIENT)
	   public ItemStack onItemRightClick(ItemStack iS, World w, EntityPlayer p) 
	{
	      this.s(w, p);
	      return iS;
	}
	private void s(World w, Entity e) 
	{
	      for(int i = 1; i < 30; ++i) 
	      {
		         w.spawnParticle("nova", e.posX + Math.sin((double)i) * 0.3D, e.posY + 0.4D, e.posZ + Math.cos((double)i) * 0.3D, 0.0D, 0.0D, 0.0D);
	       }
	}
	public void onUpdate(ItemStack iS, World w, Entity e, int i1, boolean b1) 
	{
	++this.TICK;
	Long localtick = this.TICK;
	if (localtick % 2L == 0L) 
		{
		this.s(w, e);
		}
	}
}

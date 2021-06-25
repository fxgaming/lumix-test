package lumix.items;
import lumix.Kernel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
public class Pleer3 extends Item {
	public Pleer3()
	{
		super();
		this.setTextureName("lumixkernel:Pleer3");
		this.setFull3D();
	}
	public void onItemUse(ItemStack Stack, EntityPlayer player, World w)
	{
		player.worldObj.playSoundAtEntity(player, Kernel.MODID + ":akrluba", 1.0F, 1.0F);
	}
}

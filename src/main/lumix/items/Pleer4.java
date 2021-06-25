package lumix.items;
import lumix.Kernel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
public class Pleer4 extends Item {
	public Pleer4()
	{
		super();
		this.setTextureName("lumixkernel:Pleer4");
		this.setFull3D();
	}
	public void onItemRightClick(ItemStack Stack, EntityPlayer player, World w)
	{
		player.worldObj.playSoundAtEntity(player, Kernel.MODID + ":walkvera", 1.0F, 1.0F);
	}
}

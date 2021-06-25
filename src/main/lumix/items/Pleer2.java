package lumix.items;
import lumix.Kernel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
public class Pleer2 extends Item {
	public Pleer2()
	{
		super();
		this.setTextureName("lumixkernel:Pleer2");
		this.setFull3D();
	}
	public ItemStack onItemRightClick(ItemStack Stack, EntityPlayer player, World w)
	{
		player.worldObj.playSoundAtEntity(player, Kernel.MODID + ":2rb2tura", 1.0F, 1.0F);
		return Stack;
	}
}

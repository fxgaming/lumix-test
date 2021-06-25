package lumix.items;
import lumix.Kernel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
public class Pleer5 extends Item {
	public Pleer5()
	{
		super();
		this.setTextureName("lumixkernel:Pleer5");
		this.setFull3D();
	}
	public ItemStack onItemUse(ItemStack Stack, EntityPlayer player, World w)
	{
		player.worldObj.playSoundAtEntity(player, Kernel.MODID + ":fztrahtara", 1.0F, 1.0F);
		return Stack;
	}
}

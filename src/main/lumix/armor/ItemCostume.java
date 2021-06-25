package lumix.armor;

import lumix.armor.model.AMBase;
import lumix.armor.model.ModelCostume;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class ItemCostume extends Validation {

	public ItemCostume(int armorType) {
		super(armorType);
		this.setMaxStackSize(1);
	}

	@SideOnly(Side.CLIENT)
	AMBase acm0 = new ModelCostume(0);
	@SideOnly(Side.CLIENT)
	AMBase acm1 = new ModelCostume(1);
	@SideOnly(Side.CLIENT)
	AMBase acm2 = new ModelCostume(2);
	@SideOnly(Side.CLIENT)
	AMBase acm3 = new ModelCostume(3);

	@SideOnly(Side.CLIENT)
	@Override
	public AMBase getModel(EntityLivingBase entityPlayer, ItemStack stack, int slot) {
		switch (slot) {
		case 3:return acm0;
		case 2:return acm1;
		case 1:return acm2;
		case 0:return acm3;
		default:return null;
		}
	}

}

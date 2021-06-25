package lumix.armor;

import lumix.armor.model.AMBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class Validation extends Item {

	private final int armorType;

	public Validation(int armorType) {
		super();
		this.armorType = armorType;
	}

	@Override
	public boolean isValidArmor(ItemStack stack, int armorType, Entity entity) {
		return this.armorType == armorType;
	}

	@SideOnly(Side.CLIENT)
	public AMBase getModel(EntityLivingBase entityPlayer, ItemStack stack, int slot) {
		return null;
	}

}

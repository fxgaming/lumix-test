package lumix.blocks;

import lumix.Kernel;
import lumix.tileentity.TileEntityBanner1TAd16;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Banner1TAd16 extends Block implements ITileEntityProvider {
	
	public Banner1TAd16() {
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(0.25F);
		setStepSound(soundTypeMetal);
		setBlockTextureName("iron_block");
		setBlockName(Kernel.MODID + ".Banner1TAd16");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityBanner1TAd16();
	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}
}

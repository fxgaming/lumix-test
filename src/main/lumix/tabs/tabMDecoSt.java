package lumix.tabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class tabMDecoSt extends CreativeTabs {
public tabMDecoSt(String lable) {
super(lable); }
@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem(){
return Item.getItemFromBlock(Blocks.hay_block); }}

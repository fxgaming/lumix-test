package lumix.tabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class tabMArmor extends CreativeTabs {
public tabMArmor(String lable) {
super(lable); }
@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem(){
return Items.diamond_chestplate; }}

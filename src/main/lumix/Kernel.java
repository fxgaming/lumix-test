package lumix;

import org.lwjgl.LWJGLException;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import lumix.armor.*;
import lumix.blocks.*;
import lumix.renders.*;
import lumix.sit.*;
import lumix.tabs.*;
import lumix.tileentity.*;
import lumix.gui.*;
import lumix.items.*;
import lumix.cmd.*;
import lumix.utils.*;

@Mod (modid = Kernel.MODID, name = Kernel.MODNAME, version = Kernel.VERSION)
public class Kernel {
	public static final String MODID = "lumixkernel";
	public static final String MODNAME = "LumixWorld kernel";
	public static final String VERSION = "1.0.0";
	@Instance(Kernel.MODID) 
	public static Kernel instance;
	@SidedProxy(modId = Kernel.MODID, clientSide = "lumix.PCS", serverSide = "lumix.PSS")
	public static PSS proxy;
	public static CreativeTabs tabMDecoSt = new tabMDecoSt("tabMDecoSt");
	public static CreativeTabs tabMItems = new tabMItems("tabMItems");
	public static CreativeTabs tabMArmor = new tabMArmor("tabMArmor");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		MinecraftForge.EVENT_BUS.register(new SittingHandler());
		MinecraftForge.EVENT_BUS.register(new HudSurvivalCancelEvent());
		proxy.preInit();
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		EntityRegistry.registerModEntity(EntitySit.class, "entity_sit", 0, this.instance, 256, 20, false);
		proxy.init();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Item Costume1_0, Costume1_1, Costume1_2, Costume1_3;
	@EventHandler
	public void registerArmor(FMLPreInitializationEvent event) {
		Costume1_0 = new ItemCostume(0).setUnlocalizedName("costume1_0").setTextureName(Kernel.MODID + ":costume1_0").setCreativeTab(Kernel.tabMArmor);
		GameRegistry.registerItem(Costume1_0, "costume1_0");
		Costume1_1 = new ItemCostume(1).setUnlocalizedName("costume1_1").setTextureName(Kernel.MODID + ":costume1_1").setCreativeTab(Kernel.tabMArmor);
		GameRegistry.registerItem(Costume1_1, "costume1_1");
		Costume1_2 = new ItemCostume(2).setUnlocalizedName("costume1_2").setTextureName(Kernel.MODID + ":costume1_2").setCreativeTab(Kernel.tabMArmor);
		GameRegistry.registerItem(Costume1_2, "costume1_2");
		Costume1_3 = new ItemCostume(3).setUnlocalizedName("costume1_3").setTextureName(Kernel.MODID + ":costume1_3").setCreativeTab(Kernel.tabMArmor);
		GameRegistry.registerItem(Costume1_3, "costume1_3");
	}
	
	
	
	public static Block StickN, Banner1TAd16, BannerMEGA;
	public static Item Money10, Pleer1, Pleer2, Pleer3, Pleer4, Pleer5;
	@EventHandler
	public void registerItemBlock(FMLPreInitializationEvent event) 
	{
	Pleer1 = new Pleer1().setUnlocalizedName("Pleer1").setCreativeTab(Kernel.tabMItems);
	Pleer2 = new Pleer2().setUnlocalizedName("Pleer2").setCreativeTab(Kernel.tabMItems);
	Pleer3 = new Pleer3().setUnlocalizedName("Pleer3").setCreativeTab(Kernel.tabMItems);
	Pleer4 = new Pleer4().setUnlocalizedName("Pleer4").setCreativeTab(Kernel.tabMItems);
	Pleer5 = new Pleer5().setUnlocalizedName("Pleer5").setCreativeTab(Kernel.tabMItems);
	GameRegistry.registerItem(Pleer1, "Pleer1");
	GameRegistry.registerItem(Pleer2, "Pleer2");
	GameRegistry.registerItem(Pleer3, "Pleer3");
	GameRegistry.registerItem(Pleer4, "Pleer4");
	GameRegistry.registerItem(Pleer5, "Pleer5");
	StickN = new StickN().setCreativeTab(Kernel.tabMDecoSt);
	GameRegistry.registerBlock(StickN, "StickN");
	GameRegistry.registerTileEntity(TileEntityStickN.class, "TileEntityStickN");
	Banner1TAd16 = new Banner1TAd16().setCreativeTab(Kernel.tabMDecoSt);
	GameRegistry.registerBlock(Banner1TAd16, "Banner1TAd16");
	GameRegistry.registerTileEntity(TileEntityBanner1TAd16.class, "TileEntityBanner1TAd16");
	BannerMEGA = new BannerMEGA().setCreativeTab(Kernel.tabMDecoSt);
	GameRegistry.registerBlock(BannerMEGA, "BannerMEGA");
	GameRegistry.registerTileEntity(TileEntityBannerMEGA.class, "TileEntityBannerMEGA");
	Money10 = new Money10().setUnlocalizedName("Money10").setCreativeTab(Kernel.tabMDecoSt);
	GameRegistry.registerItem(Money10, "Money10");
	}
	
	public static Item Eating1, Eating2, Health1, Health2, Health3;
	@EventHandler
	public void registerHud(FMLPreInitializationEvent event) 
	{
		MinecraftForge.EVENT_BUS.register(new GuiOverlayMain());
		Eating1 = new Eating1().setUnlocalizedName("Eating1");
		GameRegistry.registerItem(Eating1, "Eating1");
		Eating2 = new Eating2().setUnlocalizedName("Eating2");
		GameRegistry.registerItem(Eating2, "Eating2");
		Health1 = new Health1().setUnlocalizedName("Health1");
		GameRegistry.registerItem(Health1, "Health1");
		Health2 = new Health2().setUnlocalizedName("Health2");
		GameRegistry.registerItem(Health2, "Health2");
		Health3 = new Health3().setUnlocalizedName("Health3");
		GameRegistry.registerItem(Health3, "Health3");
	}
	
    public void onGuiOpenEvent(GuiOpenEvent event, GuiScreen screen)
    {
        if (event.gui instanceof GuiMainMenu)
        {
            event.gui = new GuiMultiplayer(screen);
        }
    }
}

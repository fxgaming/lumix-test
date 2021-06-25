package lumix;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;
import lumix.tileentity.*;
import lumix.armor.*;
import lumix.blocks.*;
import lumix.items.*;
import lumix.models.*;
import lumix.renders.*;

public class PCS extends PSS {
	
	public void preInit() 
	{
		super.preInit();
	}
	public void init() 
	{
		super.init();
		MinecraftForge.EVENT_BUS.register(new EventHandler());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStickN.class, new RenderTileEntityStickN());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Kernel.StickN), new RenderItemStickN());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBanner1TAd16.class, new RenderTileEntityBanner1TAd16());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Kernel.Banner1TAd16), new RenderItemBanner1TAd16());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBannerMEGA.class, new RenderTileEntityBannerMEGA());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Kernel.BannerMEGA), new RenderItemBannerMEGA());
		MinecraftForgeClient.registerItemRenderer(Kernel.Money10, new RenderMoney10());
		MinecraftForgeClient.registerItemRenderer(Kernel.Pleer1, new RenderPleer1());
	}
}

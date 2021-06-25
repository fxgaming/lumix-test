package lumix.renders;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import lumix.models.*;
import lumix.Kernel;

public class RenderPleer4 implements IItemRenderer {
	public static final ModelPleer model = new ModelPleer();
	public static final ResourceLocation
	ww = new ResourceLocation("textures/blocks/wool_colored_white.png"),
	gw = new ResourceLocation("textures/blocks/wool_colored_silver.png"),
	bw = new ResourceLocation("textures/blocks/wool_colored_blue.png");
			

	@Override
	public boolean handleRenderType(ItemStack is, ItemRenderType type) {
		if (type == ItemRenderType.INVENTORY) return false;
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack is, ItemRendererHelper helper) {
		if (type == ItemRenderType.INVENTORY) return false;
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack is, Object... data) {
		GL11.glPushMatrix();
		GL11.glTranslatef(0.5F, 1.5F, 0.5F);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		Minecraft.getMinecraft().renderEngine.bindTexture(bw);
		model.r1();
		Minecraft.getMinecraft().renderEngine.bindTexture(ww);
		model.r2();
		Minecraft.getMinecraft().renderEngine.bindTexture(gw);
		model.r3();
		model.r4();
		model.r5();
		model.r6();
		GL11.glPopMatrix();
	}

}

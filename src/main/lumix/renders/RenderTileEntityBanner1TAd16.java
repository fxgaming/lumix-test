package lumix.renders;

import lumix.Kernel;
import lumix.models.ModelBanner1TAd16;
import lumix.models.ModelStickN;
import lumix.tileentity.TileEntityBanner1TAd16;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderTileEntityBanner1TAd16 extends TileEntitySpecialRenderer{
	public static final ModelBanner1TAd16 model = new ModelBanner1TAd16();
	public static final ResourceLocation texture = new ResourceLocation(Kernel.MODID, "textures/blocks/Banner1TAd16.png");

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		render((TileEntityBanner1TAd16)tile, x, y, z, f);
	}

	private void render(TileEntityBanner1TAd16 tile, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);
		GL11.glTranslatef(0.5F, 1.5F, 0.5F);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		bindTexture(texture);
		model.render();
		GL11.glPopMatrix();
	}
}

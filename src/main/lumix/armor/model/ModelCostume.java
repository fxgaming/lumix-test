package lumix.armor.model;

import lumix.Kernel;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class ModelCostume extends AMBase {

	public static final IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation(Kernel.MODID, "model/armor/costume1.obj"));
	public static final ResourceLocation
	bw = new ResourceLocation("textures/blocks/wool_colored_black.png"),
	rw = new ResourceLocation("textures/blocks/wool_colored_red.png"),
	gw = new ResourceLocation("textures/blocks/wool_colored_gray.png");
	private final int partType;

	/**armorType: 0 - head, 1 - body and arms, 2 - legs, 3 - feet.**/
	public ModelCostume(int armorType) {
		partType = armorType;
	}

	@Override
	public void pre() {
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		//Minecraft.getMinecraft().renderEngine.bindTexture(TextureMap.locationBlocksTexture);
	}

	@Override
	public void post() {
		GL11.glDisable(GL11.GL_BLEND);
	}

	@Override
	public void partHead() {}
	@Override
	public void partBody() {
		if (partType == 0) {
			GL11.glTranslatef(0F, -1.5F, 0F);
			Minecraft.getMinecraft().renderEngine.bindTexture(rw);
			model.renderPart("Shelm1");
			model.renderPart("Shelm2");
		}
		if (partType == 1) {
			GL11.glTranslatef(0F, -1.5F, 0F);
			Minecraft.getMinecraft().renderEngine.bindTexture(bw);
			model.renderPart("Hrud1");
			model.renderPart("Hrud2");
			model.renderPart("Hrud3");
			model.renderPart("Hrud4");
			model.renderPart("Hrud5");
			model.renderPart("Hrud6");
			model.renderPart("Hrud7");
			model.renderPart("Hrud8");
			model.renderPart("Hrud9");
			model.renderPart("Hrud10");
		}
	}
	@Override
	public void partRightArm() {
		if (partType == 1) {
			GL11.glTranslatef(0.3125F, -1.375F, 0F);
			Minecraft.getMinecraft().renderEngine.bindTexture(bw);
			model.renderPart("RH1");
			model.renderPart("RH2");
			model.renderPart("RH3");
			model.renderPart("RH4");
			model.renderPart("RH5T");
		}
	}
	@Override
	public void partLeftArm() {
		if (partType == 1) {
			GL11.glTranslatef(-0.3125F, -1.375F, 0F);
			Minecraft.getMinecraft().renderEngine.bindTexture(bw);
			model.renderPart("LH1");
			model.renderPart("LH2");
			model.renderPart("LH3");
			model.renderPart("LH4");
			model.renderPart("LH5T");
		}
	}
	@Override
	public void partRightLeg() {
		if (partType == 2) {
		GL11.glTranslatef(0.125F, -0.75F, 0F);
		Minecraft.getMinecraft().renderEngine.bindTexture(bw);
		model.renderPart("RL1");
		model.renderPart("RL2");
		model.renderPart("RL3");
		model.renderPart("RL4T");
		model.renderPart("RL5T");
		}
		if (partType == 3) {
		GL11.glTranslatef(0.125F, -0.75F, 0F);
		Minecraft.getMinecraft().renderEngine.bindTexture(bw);
		model.renderPart("RB1T");
		model.renderPart("RB2");
		}
	}
	@Override
	public void partLeftLeg() {
		if (partType == 2) {
		GL11.glTranslatef(-0.125F, -0.75F, 0F);
		Minecraft.getMinecraft().renderEngine.bindTexture(bw);
		model.renderPart("LL1");
		model.renderPart("LL2");
		model.renderPart("LL3");
		model.renderPart("LL4T");
		model.renderPart("LL5T");
		}
		if (partType == 3) {
		GL11.glTranslatef(-0.125F, -0.75F, 0F);
		Minecraft.getMinecraft().renderEngine.bindTexture(bw);
		model.renderPart("LB1T");
		model.renderPart("LB2");
		}
	}
}

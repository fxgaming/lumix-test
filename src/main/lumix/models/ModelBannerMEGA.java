package lumix.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBannerMEGA extends ModelBase {

	ModelRenderer Shape1;
    ModelRenderer Shape12;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;

	public ModelBannerMEGA() {
		textureWidth = 512;
	    textureHeight = 512;
	    
	      Shape1 = new ModelRenderer(this, 0, 0);
	      Shape1.addBox(0F, 0F, 0F, 8, 24, 8);
	      Shape1.setRotationPoint(-100F, 0F, 0F);
	      Shape1.setTextureSize(512, 512);
	      Shape1.mirror = true;
	      setRotation(Shape1, 0F, 0F, 0F);
	      Shape12 = new ModelRenderer(this, 0, -2);
	      Shape12.addBox(0F, 0F, 0F, 8, 24, 8);
	      Shape12.setRotationPoint(92F, 0F, 0F);
	      Shape12.setTextureSize(512, 512);
	      Shape12.mirror = true;
	      setRotation(Shape12, 0F, 0F, 0F);
	      Shape2 = new ModelRenderer(this, 0, 0);
	      Shape2.addBox(0F, 0F, 0F, 200, 2, 5);
	      Shape2.setRotationPoint(-100F, -2F, 0F);
	      Shape2.setTextureSize(512, 512);
	      Shape2.mirror = true;
	      setRotation(Shape2, 0F, 0F, 0F);
	      Shape3 = new ModelRenderer(this, 50, 57);
	      Shape3.addBox(0F, 0F, 0F, 200, 100, 1);
	      Shape3.setRotationPoint(-100F, -100F, 5F);
	      Shape3.setTextureSize(512, 512);
	      Shape3.mirror = true;
	      setRotation(Shape3, 0F, 0F, 0F);
	      Shape4 = new ModelRenderer(this, 0, 0);
	      Shape4.addBox(0F, 0F, 0F, 200, 4, 2);
	      Shape4.setRotationPoint(-100F, -4F, 6F);
	      Shape4.setTextureSize(512, 512);
	      Shape4.mirror = true;
	      setRotation(Shape4, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape1.render(f5);
	    Shape12.render(f5);
	    Shape2.render(f5);
	    Shape3.render(f5);
	    Shape4.render(f5);
	}

	public void render() {
		Shape1.render(0.0625F);
		Shape2.render(0.0625F);
		Shape2.render(0.0625F);
		Shape3.render(0.0625F);
	    Shape4.render(0.0625F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
}

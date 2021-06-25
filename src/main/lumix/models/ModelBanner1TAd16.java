package lumix.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBanner1TAd16 extends ModelBase {

    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer ADFACE;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape9;

	public ModelBanner1TAd16() {
		textureWidth = 64;
	    textureHeight = 32;
	    
	      Shape1 = new ModelRenderer(this, 0, 0);
	      Shape1.addBox(0F, 0F, 0F, 1, 8, 2);
	      Shape1.setRotationPoint(7F, 16F, -1F);
	      Shape1.setTextureSize(64, 32);
	      Shape1.mirror = true;
	      setRotation(Shape1, 0F, 0F, 0F);
	      Shape2 = new ModelRenderer(this, 0, 0);
	      Shape2.addBox(0F, 0F, 0F, 1, 8, 2);
	      Shape2.setRotationPoint(-8F, 16F, -1F);
	      Shape2.setTextureSize(64, 32);
	      Shape2.mirror = true;
	      setRotation(Shape2, 0F, 0F, 0F);
	      Shape3 = new ModelRenderer(this, 0, 0);
	      Shape3.addBox(0F, 0F, 0F, 16, 1, 2);
	      Shape3.setRotationPoint(-8F, 15F, -1F);
	      Shape3.setTextureSize(64, 32);
	      Shape3.mirror = true;
	      setRotation(Shape3, 0F, 0F, 0F);
	      ADFACE = new ModelRenderer(this, 0, 11);
	      ADFACE.addBox(0F, 0F, 0F, 16, 20, 1);
	      ADFACE.setRotationPoint(-8F, -5F, 0F);
	      ADFACE.setTextureSize(64, 32);
	      ADFACE.mirror = true;
	      setRotation(ADFACE, 0F, 0F, 0F);
	      Shape4 = new ModelRenderer(this, 0, 0);
	      Shape4.addBox(0F, 0F, 0F, 16, 1, 2);
	      Shape4.setRotationPoint(-8F, -6F, -1F);
	      Shape4.setTextureSize(64, 32);
	      Shape4.mirror = true;
	      setRotation(Shape4, 0F, 0F, 0F);
	      Shape5 = new ModelRenderer(this, 35, 0);
	      Shape5.addBox(0F, 0F, 0F, 1, 20, 1);
	      Shape5.setRotationPoint(-8F, -5F, -1F);
	      Shape5.setTextureSize(64, 32);
	      Shape5.mirror = true;
	      setRotation(Shape5, 0F, 0F, 0F);
	      Shape9 = new ModelRenderer(this, 35, 0);
	      Shape9.addBox(0F, 0F, 0F, 1, 20, 1);
	      Shape9.setRotationPoint(7F, -5F, -1F);
	      Shape9.setTextureSize(64, 32);
	      Shape9.mirror = true;
	      setRotation(Shape9, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Shape1.render(f5);
	    Shape2.render(f5);
	    Shape3.render(f5);
	    ADFACE.render(f5);
	    Shape4.render(f5);
	    Shape5.render(f5);
	    Shape9.render(f5);
	}

	public void render() {
		Shape1.render(0.0625F);
		Shape2.render(0.0625F);
		Shape3.render(0.0625F);
	    ADFACE.render(0.0625F);
	    Shape4.render(0.0625F);
	    Shape5.render(0.0625F);
	    Shape9.render(0.0625F);
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

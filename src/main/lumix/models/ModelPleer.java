package lumix.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPleer extends ModelBase {

	ModelRenderer box;
    ModelRenderer monitor;
    ModelRenderer b1;
    ModelRenderer b2;
    ModelRenderer b3;
    ModelRenderer b4;

	public ModelPleer() {
		textureWidth = 64;
	    textureHeight = 32;
	    
	    box = new ModelRenderer(this, 0, 0);
	      box.addBox(0F, 0F, 0F, 1, 8, 5);
	      box.setRotationPoint(0F, 0F, 0F);
	      box.setTextureSize(64, 32);
	      box.mirror = true;
	      setRotation(box, 0F, 0F, 0F);
	      monitor = new ModelRenderer(this, 0, 0);
	      monitor.addBox(0F, 0F, 0F, 1, 3, 3);
	      monitor.setRotationPoint(0.2F, 0.5F, 1F);
	      monitor.setTextureSize(64, 32);
	      monitor.mirror = true;
	      setRotation(monitor, 0F, 0F, 0F);
	      b1 = new ModelRenderer(this, 0, 0);
	      b1.addBox(0F, 0F, 0F, 1, 1, 1);
	      b1.setRotationPoint(0.3F, 5F, 3F);
	      b1.setTextureSize(64, 32);
	      b1.mirror = true;
	      setRotation(b1, 0F, 0F, 0F);
	      b2 = new ModelRenderer(this, 0, 0);
	      b2.addBox(0F, 0F, 0F, 1, 1, 1);
	      b2.setRotationPoint(0.3F, 4F, 2F);
	      b2.setTextureSize(64, 32);
	      b2.mirror = true;
	      setRotation(b2, 0F, 0F, 0F);
	      b3 = new ModelRenderer(this, 0, 0);
	      b3.addBox(0F, 0F, 0F, 1, 1, 1);
	      b3.setRotationPoint(0.3F, 5F, 1F);
	      b3.setTextureSize(64, 32);
	      b3.mirror = true;
	      setRotation(b3, 0F, 0F, 0F);
	      b4 = new ModelRenderer(this, 0, 0);
	      b4.addBox(0F, 0F, 0F, 1, 1, 1);
	      b4.setRotationPoint(0.3F, 6F, 2F);
	      b4.setTextureSize(64, 32);
	      b4.mirror = true;
	      setRotation(b4, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		box.render(f5);
	    monitor.render(f5);
	    b1.render(f5);
	    b2.render(f5);
	    b3.render(f5);
	    b4.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	public void r1() { box.render(0.1F); }
	public void r2() { monitor.render(0.1F); }
	public void r3() { b1.render(0.1F); }
	public void r4() { b2.render(0.1F); }
	public void r5() { b3.render(0.1F); }
	public void r6() { b4.render(0.1F); }

}

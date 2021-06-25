package lumix.gui;

import lumix.Kernel;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Post;

public class GuiOverlayMain {
	public static Minecraft mc = Minecraft.getMinecraft();
	public static final RenderItem itemRenderer = new RenderItem();
    protected float zLevel;
    private int PanelButton = 1;
	public static final ResourceLocation a = new ResourceLocation("lumixkernel:overlay/lumixpanel1.png");
	public static final ResourceLocation b = new ResourceLocation("lumixkernel:overlay/lumixpanel1.png");

	   @SubscribeEvent
	   public void renderSurvivalGui(Post e) {
	      if (e.type == ElementType.HOTBAR) {
	         GL11.glPushMatrix();
	         GL11.glPushMatrix();
	         if (PanelButton == 1){mc.renderEngine.bindTexture(a);}
	         this.draw(1, 1, 0, 0, 64, 64);
	         GL11.glPopMatrix();
	         	EntityPlayer Player = Minecraft.getMinecraft().thePlayer;
	       	  	int nowhel = (int)Player.getHealth();
	       	  	int maxhel = (int)Player.getMaxHealth();
	       	  	int countAV = Player.getTotalArmorValue();
	       	  	int xc=6,yc=12,xhp=6,yhp=28,xp=13,yp=4,xh=24,yh=12;
	       	  	
	       	  	mc.fontRenderer.drawStringWithShadow("LumixPanel", xp, yp, 851247);
	       	  	if (mc.thePlayer.isEating()){/* mc.fontRenderer.drawStringWithShadow("Кушаете", 1, 9, 851247);*/itemRenderer.renderItemAndEffectIntoGUI(this.mc.fontRenderer, this.mc.getTextureManager(), new ItemStack(Kernel.Eating1), xc, yc);}
	       	  	else if (!mc.thePlayer.isEating()){/*mc.fontRenderer.drawStringWithShadow("Не кушаете", 1, 9, 851247);*/itemRenderer.renderItemAndEffectIntoGUI(this.mc.fontRenderer, this.mc.getTextureManager(), new ItemStack(Kernel.Eating2), xc, yc);}
	       	  	mc.fontRenderer.drawStringWithShadow("HP: " + String.valueOf(nowhel) + "/" + String.valueOf(maxhel), xhp, yhp, 851247);
	       	  	if(nowhel > 10){itemRenderer.renderItemAndEffectIntoGUI(this.mc.fontRenderer, this.mc.getTextureManager(), new ItemStack(Kernel.Health1), xh, yh);}
	       	  	else if(nowhel > 5 && nowhel < 11 || nowhel == 10 && nowhel < 11){itemRenderer.renderItemAndEffectIntoGUI(this.mc.fontRenderer, this.mc.getTextureManager(), new ItemStack(Kernel.Health2), xh, yh);}
	       	 else if(nowhel < 6 || nowhel == 5 && nowhel < 6 || nowhel == 0){itemRenderer.renderItemAndEffectIntoGUI(this.mc.fontRenderer, this.mc.getTextureManager(), new ItemStack(Kernel.Health3), xh, yh);}
	         RenderHelper.enableStandardItemLighting();
	         GL11.glPopMatrix();
	      }
	   }
	    public void draw(int a, int b, int c, int d, int e, int f)
	    {
	        float f0 = 0.00390625F;
	        float f1 = 0.00390625F;
	        Tessellator tessellator = Tessellator.instance;
	        tessellator.startDrawingQuads();
	        tessellator.addVertexWithUV((double)(a + 0), (double)(b + f), (double)this.zLevel, (double)((float)(c + 0) * f0), (double)((float)(d + f) * f1));
	        tessellator.addVertexWithUV((double)(a + e), (double)(b + f), (double)this.zLevel, (double)((float)(c + e) * f0), (double)((float)(d + f) * f1));
	        tessellator.addVertexWithUV((double)(a + e), (double)(b + 0), (double)this.zLevel, (double)((float)(c + e) * f0), (double)((float)(d + 0) * f1));
	        tessellator.addVertexWithUV((double)(a + 0), (double)(b + 0), (double)this.zLevel, (double)((float)(c + 0) * f0), (double)((float)(d + 0) * f1));
	        tessellator.draw();
	    }
}

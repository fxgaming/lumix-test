package lumix;

import lumix.armor.Validation;
import lumix.armor.model.AMBase;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;

public class EventHandler {

	@SubscribeEvent
	public void onRenderArmomForPlayer(RenderPlayerEvent.SetArmorModel event) {
		if (event.stack == null || !(event.stack.getItem() instanceof Validation)) return;
		Validation ivcad = (Validation)event.stack.getItem();
		AMBase acm = ivcad.getModel(event.entityPlayer, event.stack, event.slot);
		if (acm != null) {
			acm.partHead.set(event.renderer.modelBipedMain.bipedHead);
			acm.partBody.set(event.renderer.modelBipedMain.bipedBody);
			acm.partRightArm.set(event.renderer.modelBipedMain.bipedRightArm);
			acm.partLeftArm.set(event.renderer.modelBipedMain.bipedLeftArm);
			acm.partRightLeg.set(event.renderer.modelBipedMain.bipedRightLeg);
			acm.partLeftLeg.set(event.renderer.modelBipedMain.bipedLeftLeg);
			acm.render(event.entityPlayer);
		}
	}

}

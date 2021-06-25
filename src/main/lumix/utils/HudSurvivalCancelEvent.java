package lumix.utils;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class HudSurvivalCancelEvent {

    @SubscribeEvent
    public void onOverlay(RenderGameOverlayEvent.Pre event) 
    {   
        if (event.type == ElementType.HEALTH || event.type == ElementType.FOOD || event.type == ElementType.FOOD) 
        {
        event.setCanceled(true);
        }
    }
}

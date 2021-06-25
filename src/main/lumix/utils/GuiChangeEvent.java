package lumix.utils;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiOpenEvent;

public class GuiChangeEvent {
    public static void onGuiOpenEvent(GuiOpenEvent event, GuiScreen screen)
    {
        if (event.gui  instanceof GuiMainMenu)
        {
            event.gui = new GuiMultiplayer(screen);
        }
    }
}

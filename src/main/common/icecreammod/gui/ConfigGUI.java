package icecreammod.gui;

import icecreammod.handlers.ConfigurationHandler;
import icecreammod.lib.ModInfo;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;

public class ConfigGUI extends GuiConfig {

	public ConfigGUI(GuiScreen parentScreen) {
		super(parentScreen, 
				new ConfigElement(ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				ModInfo.MOD_ID,
				false, //All require world restart
				false, //All require Minecraft restart
				"Test");
				//GuiConfig.getAbridgedConfigPath(ConfigurationHandler.config.toString())); //Title
	}



}

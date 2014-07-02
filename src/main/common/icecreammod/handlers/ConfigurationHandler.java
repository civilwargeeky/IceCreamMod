package icecreammod.handlers;

import icecreammod.lib.LogHelper;
import icecreammod.lib.ModInfo;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	
	public static Configuration config;

	public static void init(File file) {
		
		if (config==null) {
		config = new Configuration(file, true);
		}
	}
	
	public static void loadConfig() {
			
		
			String test = config.get(Configuration.CATEGORY_GENERAL,"Test String","Not a test", "Comment").getString();
			LogHelper.info("Test: "+test);

			
			if (config.hasChanged()) {
				config.save();
			}
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
		LogHelper.info(event.modID);
		if (event.modID.equals(ModInfo.MOD_ID)) {
			loadConfig();
		}
	}

}

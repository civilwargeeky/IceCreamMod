package icecreammod.init;

import icecreammod.IceCreamMod;
import icecreammod.lib.LogHelper;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

	public static void init(File file) {
		
		Configuration config = new Configuration(file);
		
		try {
			config.load();
			
			String test = config.get(Configuration.CATEGORY_GENERAL,"Test String","Not a test", "Comment").getString();
			LogHelper.info("Test: "+test);
			
		}
		catch (Exception e) {
			
		}
		finally {
			config.save();
		}
		
	}

}

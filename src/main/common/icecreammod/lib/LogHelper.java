package icecreammod.lib;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;

//This code is based on the LetsModReboot Mod by Pahimar
//Found here: https://github.com/pahimar/Equivalent-Exchange-3/blob/e77bb9ec48f70a85c542f17d5b4b95ebe7c5a319/src/main/java/com/pahimar/ee3/util/LogHelper.java
//This in accordance with section 5b of the GNU Lesser Public license (I hope)


public class LogHelper
{
    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(ModInfo.MOD_NAME, logLevel, String.valueOf(object));
    }

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }

    public static void debug(Object object)
    {
        log(Level.DEBUG, object);
    }

    public static void error(Object object)
    {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }

    public static void trace(Object object)
    {
        log(Level.TRACE, object);
    }

    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }
}


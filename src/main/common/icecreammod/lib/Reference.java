package icecreammod.lib;

public class Reference {

	public Reference() {
	}

	public static String[] typeNames = {"Vanilla", "Chocolate"}; //Maybe add in Strawberry if some mod is added with strawberries

	public static String sanitize(String string) { //Makes first letter lower case, then removes all spaces.
		return string.substring(0,1).toLowerCase() + string.replaceAll("\\s","").substring(1);
	}
}

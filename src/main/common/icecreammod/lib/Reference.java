package icecreammod.lib;

public class Reference {

	public Reference() {
	}

	public static String[] typeNames = {"Vanilla", "Chocolate", "Strawberry"};

	public static String sanitize(String string) { //Makes first letter lower case, then removes all spaces.
		return string.substring(0,1).toLowerCase() + string.substring(1).replaceAll("//s","");
	}
}

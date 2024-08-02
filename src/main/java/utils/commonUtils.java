package utils;

import java.util.Date;

public class commonUtils {
	
	public static final int Implicit_Wait_Time=50;
	public static final int Pageload_Wait_Time=50;
	public static final int Explicit_Wait_Time=50;

	public static String getEmailWithTimeStamp() {

		Date date = new Date();
		return "syedarif" + date.toString().replace(" ", "_").replace(":", "_") + "@gmail.com";
	}
}

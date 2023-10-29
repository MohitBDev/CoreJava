package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import CusExp.Exceptn;
import CusExp.LicRules;

public class ValRules {

	public static final int MIN, MAX;
	public static SimpleDateFormat sdf;

	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		MIN = 20;
		MAX = 80;

	}

	public static void valspeed(int s) throws Exceptn {

		if (s < MIN)
			throw new Exceptn("Increase Your Speed");
		if (s > MAX)
			throw new Exceptn("Lower Your  Speed");
		System.out.println("No Change");

	}

	public static void valLic(String d) throws ParseException, LicRules {
		if (sdf.parse(d).before(new Date()))
			throw new LicRules("Expired");
		System.out.println(" Valid !");

	}

}

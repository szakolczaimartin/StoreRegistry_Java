package java_files;

import java.util.GregorianCalendar;
import java.util.Hashtable;

public class Runner
{

	public static void main(String[] args)
	{

		Milk milk = new Milk((long) 45675, Capacity.LITER, new GregorianCalendar(2017, 04, 11), Drippig.FAT, 180,
				"MilkCompany");

		Milk milk1 = new Milk(12345, Capacity.LITER, new GregorianCalendar(2017, 04, 11), Drippig.FAT, 180,
				"MilkCompany");

		Milk milk2 = new Milk(78945, Capacity.LITER, new GregorianCalendar(2017, 04, 11), Drippig.FAT, 180,
				"MilkCompany");

		Hashtable<Long, Milk> milks = new Hashtable<>();
		milks.put(milk1.getbarCode(), milk1);

		// System.out.println(milk);

		System.out.println(milks.get(milk1.getbarCode()));

		Shop bolt = new Shop("Penny", "Miskolc", "En", milks);
		bolt.boughtMilk(milk1);
		bolt.ThereAreMilk();
	}

}

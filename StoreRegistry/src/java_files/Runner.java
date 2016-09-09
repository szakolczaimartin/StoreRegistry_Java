package java_files;

import java.util.GregorianCalendar;
import java.util.Hashtable;

public class Runner
{

	public static void main(String[] args)
	{
		/*
		 * Milk milk = new PermamentMilk((long) 45675, Capacity.LITER, new
		 * GregorianCalendar(2017, 04, 11), Drippig.FAT, 180, "MilkCompany");
		 * 
		 * Milk milk1 = new PermamentMilk(12345, Capacity.LITER, new
		 * GregorianCalendar(2017, 04, 11), Drippig.FAT, 180, "MilkCompany");
		 * 
		 * Milk milk2 = new SemiPermamentMilk(78945, Capacity.LITER, new
		 * GregorianCalendar(2017, 04, 11), Drippig.FAT, 180, "MilkCompany");
		 * 
		 * Hashtable<Long, Milk> milks = new Hashtable<>();
		 * milks.put(milk1.getbarCode(), milk1);
		 * 
		 * // System.out.println(milk);
		 * 
		 * System.out.println(milks.get(milk1.getbarCode()));
		 * 
		 * Shop bolt = new Shop("Penny", "Miskolc", "En", milks);
		 * bolt.boughtMilk(milk1); bolt.ThereAreMilk();
		 */

		Food milk = new SemiPermamentMilk(12345, "CC", new GregorianCalendar(2017, 04, 11), Capacity.LITER, Drippig.FAT,
				180);
		Food cheese = new Cheese(45678, "CC", new GregorianCalendar(2017, 04, 11));

		Hashtable<Long, Food> food = new Hashtable<>();
		food.put(milk.getBarCode(), milk);
		food.put(cheese.getBarCode(), cheese);

		Shop bolt = new Shop("CBA", "Miskolc", "Martin", food);

		System.out.println(milk.getClass().getName());

		bolt.ThereAreMilk();
	}

}

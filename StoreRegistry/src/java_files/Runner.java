package java_files;

import java.util.GregorianCalendar;

public class Runner
{

	public static void main(String[] args)
	{

		Milk milk = new Milk(Capacity.LITER, new GregorianCalendar(2017, 04, 11), Drippig.FAT, 180, "MilkCompany");

		System.out.println(milk);

	}

}

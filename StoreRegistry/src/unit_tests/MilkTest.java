package unit_tests;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.Test;

import java_files.Capacity;
import java_files.Drippig;
import java_files.Milk;
import java_files.PermamentMilk;

public class MilkTest
{

	@Test
	public void Depraved_InputNotDepraved_returnTrue()
	{
		Milk milk = new PermamentMilk(46878, Capacity.LITER, new GregorianCalendar(2017, 04, 11), Drippig.FAT, 180,
				"MilkCompany");
		Boolean result = milk.Depraved();
		assertEquals(true, result);
	}

	@Test
	public void Depraved_InputDepraved_returnFalse()
	{
		Milk milk = new PermamentMilk(45678, Capacity.LITER, new GregorianCalendar(2016, 04, 11), Drippig.FAT, 180,
				"MilkCompany");
		Boolean result = milk.Depraved();
		assertEquals(false, result);
	}

	@Test
	public void Depraved_InputThisDay_returnTrue()
	{
		Milk milk = new PermamentMilk(45678, Capacity.LITER, new GregorianCalendar(2016, 07, 06), Drippig.FAT, 180,
				"MilkCompany");
		Boolean result = milk.Depraved();
		assertEquals(true, result);
	}

}

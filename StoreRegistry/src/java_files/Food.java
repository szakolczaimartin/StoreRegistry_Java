package java_files;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Food
{
	private long barCode;
	private String company;
	private Calendar warrant;

	public Food(long barCode, String company, Calendar warrant)
	{
		super();
		this.barCode = barCode;
		this.company = company;
		this.warrant = warrant;
		Depraved();
	}

	public long getBarCode()
	{
		return barCode;
	}

	public String getCompany()
	{
		return company;
	}

	public Calendar getWarrant()
	{
		return warrant;
	}

	public boolean Depraved()
	{

		Calendar currentDate = new GregorianCalendar();
		int compareNumb = this.warrant.compareTo(currentDate);

		if (!(compareNumb == -1))
		{
			System.out.println(" The milk is good!");
			return true;
		} else
		{
			System.out.println(" The milk is depraved!");
			return false;
		}

	}

	@Override
	public String toString()
	{
		return " Warrant: " + warrant.get(Calendar.YEAR) + "-" + warrant.get(Calendar.MONTH) + "-"
				+ warrant.get(Calendar.DAY_OF_MONTH) + "\n Company: " + company + "\n Bar Code: " + barCode;
	}
}

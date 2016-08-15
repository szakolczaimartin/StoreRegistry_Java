package java_files;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Milk
{
	private Capacity capacity;
	private Calendar warrant;
	private Drippig drippig;
	private int price;
	private String company;
	private long barCode;

	public Milk(long barCode, Capacity capacity, Calendar warrant, Drippig drippig, int price, String company)
	{
		this.barCode = barCode;
		this.capacity = capacity;
		this.warrant = warrant;
		this.drippig = drippig;
		this.price = price;
		this.company = company;
		Depraved();

	}

	public Capacity getCapacity()
	{
		return capacity;
	}

	public long getbarCode()
	{
		return barCode;
	}

	public void setCapacity(Capacity capacity)
	{
		this.capacity = capacity;
	}

	public Calendar getWarrant()
	{
		return warrant;
	}

	public void setWarrant(Calendar warrant)
	{
		this.warrant = warrant;
	}

	public Drippig getDrippig()
	{
		return drippig;
	}

	public void setDrippig(Drippig drippig)
	{
		this.drippig = drippig;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company)
	{
		this.company = company;
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
		return " Capacity: " + capacity + " (" + capacity.ShowCapacity() + "ml)" + "\n Warrant: "
				+ warrant.get(Calendar.YEAR) + "-" + warrant.get(Calendar.MONTH) + "-"
				+ warrant.get(Calendar.DAY_OF_MONTH) + "\n Price: " + price + "Ft" + "\n Company: " + company
				+ "\n Drippig: " + drippig + " (" + drippig.ShowDrippig() + "%)" + "\n Bar Code: " + barCode;
	}
}

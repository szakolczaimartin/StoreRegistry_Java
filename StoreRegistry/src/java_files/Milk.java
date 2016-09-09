package java_files;

import java.util.Calendar;

public abstract class Milk extends Food
{

	private Capacity capacity;
	private Drippig drippig;
	private int price;

	public Milk(long barCode, String company, Calendar warrant, Capacity capacity, Drippig drippig, int price)
	{
		super(barCode, company, warrant);
		this.capacity = capacity;
		this.drippig = drippig;
		this.price = price;

	}

	public Capacity getCapacity()
	{
		return capacity;
	}

	public void setCapacity(Capacity capacity)
	{
		this.capacity = capacity;
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

	@Override
	public String toString()
	{
		return " Capacity: " + capacity + " (" + capacity.ShowCapacity() + "ml)" + "\n Warrant: "
				+ this.getWarrant().get(Calendar.YEAR) + "-" + this.getWarrant().get(Calendar.MONTH) + "-"
				+ this.getWarrant().get(Calendar.DAY_OF_MONTH) + "\n Price: " + price + "Ft" + "\n Company: "
				+ this.getCompany() + "\n Drippig: " + drippig + " (" + drippig.ShowDrippig() + "%)" + "\n Bar Code: "
				+ this.getBarCode();

	}
}

package java_files;

import java.util.Hashtable;

public class Shop
{

	private String name;
	private String address;
	private String owner;

	private Hashtable<Long, Milk> milkBar;

	public Shop(String name, String address, String owner, Hashtable<Long, Milk> milkbar)
	{
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.milkBar = milkbar;

	}

	public Shop(String name, String address, String owner)
	{
		this.name = name;
		this.address = address;
		this.owner = owner;

	}

	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public String getOwner()
	{
		return owner;
	}

	public boolean ThereAreMilk()
	{
		if (milkBar.isEmpty())
		{
			System.out.println("Nincs tej,");
			return false;

		}
		System.out.println("Van benne tej");
		return true;

	}

	public void boughtMilk(Milk milk)
	{
		milkBar.remove(milk.getbarCode());
		System.out.println("Succes buy");

	}

	public class ShopRegistry
	{
		private Milk milk;
		private int quantity;
		private int price;

		public ShopRegistry(Milk milk, int quantity, int price)
		{
			this.milk = milk;
			this.quantity = quantity;
			this.price = price;
		}

		public Milk getMilk()
		{
			return milk;
		}

		public void setMilk(Milk milk)
		{
			this.milk = milk;
		}

		public int getQuantity()
		{
			return quantity;
		}

		public void setQuantity(int quantity)
		{
			this.quantity = quantity;
		}

		public int getPrice()
		{
			return price;
		}

		public void setPrice(int price)
		{
			this.price = price;
		}

		public void sellQuantity(int db)
		{
			this.quantity = quantity - db;

		}

		public void addQuantity(int db)
		{
			this.quantity = quantity + db;

		}

	}

}

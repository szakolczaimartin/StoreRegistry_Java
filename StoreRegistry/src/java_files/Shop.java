package java_files;

import java.util.Enumeration;
import java.util.Hashtable;

public class Shop
{

	private String name;
	private String address;
	private String owner;

	private Hashtable foodBar;

	public Shop(String name, String address, String owner, Hashtable foodBar)
	{
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.foodBar = foodBar;

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

	public boolean ThereAreTypeOfProduct(Class c)
	{
		for (Enumeration e = foodBar.elements(); e.hasMoreElements();)
		{
			ShopRegistry b = (ShopRegistry) e.nextElement();
			if (c.isInstance(b.getFood()) && b.getQuantity() > 0)
				return true;
		}
		return false;

	}

	public boolean ThereAreMilk()
	{
		return ThereAreTypeOfProduct(Milk.class);
	}

	public boolean ThereAreCheese()
	{
		return ThereAreTypeOfProduct(Cheese.class);
	}

	public void fillingFood(long barCode, long quantity)
	{
		ShopRegistry shopRegitry = (ShopRegistry) foodBar.get(barCode);
		shopRegitry.addQuantity(quantity);

	}

	public void newProduct(Food food, long quantity, long price)
	{
		ShopRegistry shopRegistry = new ShopRegistry(food, quantity, price);
	}

	public void boughtFood(Food food)
	{
		foodBar.remove(food.getBarCode());
		System.out.println("Succes buy");

	}

	public class ShopRegistry
	{
		private Food food;
		private long quantity;
		private long price;

		public ShopRegistry(Food food, long quantity, long price)
		{
			this.food = food;
			this.quantity = quantity;
			this.price = price;
		}

		public Food getFood()
		{
			return food;
		}

		public void setFood(Food food)
		{
			this.food = food;
		}

		public long getQuantity()
		{
			return quantity;
		}

		public void setQuantity(long quantity)
		{
			this.quantity = quantity;
		}

		public long getPrice()
		{
			return price;
		}

		public void setPrice(long price)
		{
			this.price = price;
		}

		public void sellQuantity(long db)
		{
			this.quantity -= db;

		}

		public void addQuantity(long db)
		{
			this.quantity += db;

		}

	}

}

package java_files;

public enum Capacity
{
	LITER(1000), HALF_LITER(500), GLASS(200);

	int tonnage;

	Capacity(int tonnage)
	{
		this.tonnage = tonnage;
	}

	public int ShowCapacity()
	{
		return tonnage;
	}

}

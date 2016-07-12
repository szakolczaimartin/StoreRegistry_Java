package java_files;

public enum Drippig
{

	FAT(2.8), HALF_FAT(1.5);

	double fatValue;

	Drippig(double fatValue)
	{
		this.fatValue = fatValue;
	}

	public double ShowDrippig()
	{
		return fatValue;
	}

}

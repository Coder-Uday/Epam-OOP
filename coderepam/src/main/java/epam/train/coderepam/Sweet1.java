package epam.train.coderepam;

public class Sweet1 implements Sweet {
	static String name;
	static int cost;
	public void update(int c)
	{
		cost=c;
	}
	public Sweet1()
	{
		System.out.print("The price of this sweet is 100");
		setPrice(100);
	}
	public void setPrice(int c)
	{
		update(c);
	}
	public int getPrice()
	{
		return cost;
	}
}

package epam.train.coderepam;

public class Sweet2 implements Sweet{
	static String name;
	static int cost;
	public void update(int c)
	{
		cost=c;
	}
	public Sweet2()
	{
		System.out.print("The price of this sweet is 50");
		setPrice(50);
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

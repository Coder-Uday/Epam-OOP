package epam.train.coderepam;

public class Sweet3 implements Sweet{
	static String name;
	static int cost;
	public void update(int c)
	{
		cost=c;
	}
	public Sweet3()
	{
		System.out.print("Hurray!!...You have the best sweet with price : 200");
		setPrice(200);
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

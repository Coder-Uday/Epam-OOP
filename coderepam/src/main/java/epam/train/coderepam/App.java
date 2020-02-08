package epam.train.coderepam;

import java.util.*;

public class App {
	static int num=0;
	static String name="";
	public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("How Many Sweet Do You Want (in num) : ");
    	num=sc.nextInt();
    	int i;
    	int total=0;
    	for(i=0;i<num;i++)
    	{
    		System.out.print("What is the sweet You want? : ");
    		System.out.print("sweet1 : Kesari \nsweet2 : Arisa\nsweet3 : Chalividi\n");
    		name=sc.next();
    		Sweet sweet;
    		if(name.equals("sweet1"))
    		{
    			System.out.print("Let me know the Weight you require in Kg : ");
        		int kilo=sc.nextInt();
    			sweet=new Sweet1();
        		total+=sweet.getPrice()*kilo;
    		}
    		else if(name.equals("sweet2"))
    		{
    			System.out.print("Let me know the Weight you require in Kg : ");
        		int kilo=sc.nextInt();
    			sweet=new Sweet2();
        		total+=sweet.getPrice()*kilo;
    		}
    		else if(name.equals("sweet3"))
    		{
    			System.out.print("Let me know the Weight you require in Kg : ");
        		int kilo=sc.nextInt();
    			sweet=new Sweet3();
        		total+=sweet.getPrice()*kilo;
    		}
    		else
    		{
    			System.out.println("Identify a correct sweet");
    			i--;
    		}
    	}
    	System.out.println("Total Payable amount is : "+total);
    	sc.close();
    }
}

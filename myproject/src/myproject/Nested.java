package myproject;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++)// for rows
		{ 
			for(int j=1; j<=5; j++)//for columns
			{
				System.out.print("("+i+","+j+")");
			}
			System.out.println("");
		}
	}

}

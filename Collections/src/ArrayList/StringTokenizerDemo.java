package ArrayList;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data= ("name=Dilip;Surname=Sharma;address=mumbai;");
		StringTokenizer stk =new StringTokenizer(data,"=;");
		String s;
		System.out.println(stk.countTokens());
		while(stk.hasMoreTokens())
		{
			s=stk.nextToken();
			System.out.println(s);
		
		}
	}
}



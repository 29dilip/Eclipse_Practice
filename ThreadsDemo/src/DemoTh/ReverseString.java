package DemoTh;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Dilip";
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--) {
			rev +=input.charAt(i);
		}
		System.out.println("NOrmal String: "+input);
		System.out.println("Reverse String: "+rev);
		System.out.println(input.equals(rev));
		System.out.println(input.isBlank());
	}

}

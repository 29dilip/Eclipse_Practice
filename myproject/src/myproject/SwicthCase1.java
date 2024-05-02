package myproject;
import java.util.*;
public class SwicthCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter Any Website : ");
		String site= scan.next();
		String ext= site.substring(site.lastIndexOf(".")+1);
		switch(ext) {
		case "com":System.out.println("It is a commerical website");
		break;
		case "gov":System.out.println("It is a Government website");
		break;
		case "org":System.out.println("It is a Organisation website");
		break;
		default:System.out.println("It is  not a website");
		break;
		}
		
		
		
	}

}

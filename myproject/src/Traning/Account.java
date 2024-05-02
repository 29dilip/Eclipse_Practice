package myproject;

public class Account {

		 int acid;

		 String branch;

		 float bal;

		 //constructor

		 Account()

		 {

		 this("adarsh nagar",20000);

		 System.out.println("Zero -arg constructor");

		 acid=10;

		 branch="chennai";

		 bal=250;

		 }

		 Account(String br,float tbal)

		 {

		 System.out.println("param constructor");

		 branch=br;

		 bal=tbal;

		 System.out.println(acid+" "+branch+" "+bal);

		 }

		 void getDetails(int x,String y,float z)

		 {

		 acid=x;

		 branch=y;

		 bal=z;

		 }

		 void putDetails()

		 {

		 System.out.println(acid+" "+branch+" "+bal);

		 }

		}//class

		public class ConTest

		{

		 public static void main(String args[])

		{

		 Account a1=new Account();

		 a1.putDetails();

		 a1.getDetails(101,"ameer pet",7800);

		 a1.putDetails();

		 Account a2=new Account("s.r",750);

		 a2.putDetails();

		 a2.getDetails(13,"s.r",6789);

		 a2.putDetails();

		 }//main

		}//class
	



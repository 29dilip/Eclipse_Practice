package myproject;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[][]={ {6,8},

				   {5,8}

				   };

				     int b[][]={ {7,9},

				   {6,8}

				   };

				      int c[][]=new int[2][2];

				   System.out.println(" \n First Array values are ");

				   for(int i=0;i<a.length;++i)

				  {

				   System.out.println();

				   for(int j=0;j<a[i].length;++j)

				    System.out.print("\t"+a[i][j]);

				  }//for

				  System.out.println("\n Second Array values are ");

				   for(int i=0;i<b.length;++i)

				 {

				   System.out.println();

				   for(int j=0;j<b[i].length;++j)

				    System.out.print("\t"+b[i][j]);

				 }//for

				     for(int i=0;i<a.length;++i)

				   for(int j=0;j<b.length;++j)

				   c[i][j]=a[i][j]+b[i][j];

				System.out.println("\n Result Array values are ");

				   for(int i=0;i<c.length;++i)

				 {

				   System.out.println();

				   for(int j=0;j<c[i].length;++j)

				    System.out.print("\t"+c[i][j]);

				 }//for

				 }//main

				//class
	}



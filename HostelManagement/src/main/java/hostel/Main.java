package hostel;

import java.util.List;
import java.util.Scanner;
import bean.Hostel;
import bean.User;
import service.IUserService;
import service.UserServiceImpl;
import util.Validation;

public class Main {
 public static void main(String[] args) throws Exception {
 int id,choice;
 String name,email,mNum,class1,address,roomNum,typeAC,payment,sharing;
 List<User> list;
 Hostel hostel=null;
 Scanner in = new Scanner(System.in);
 Scanner str = new Scanner(System.in);
 while(true)
 {
  System.out.println("===================================================");
  System.out.println("                   Hello DILIP   					 ");
  System.out.println("                  Welcome to HMS                    ");
  System.out.println("             Hostel Management System              ");
  System.out.println("===================================================");
  System.out.println("Select an Option");
  System.out.println("1. Insert the Data into the DataBase");
  System.out.println("2. Update the Data");
  System.out.println("3. Delete the Student's Data");
  System.out.println("4. Print all Data of Student");
  System.out.println("5. Sort the Data By Name");
  System.out.println("6. Exit");
  System.out.println("7. Print all Records By RoomNum ");
  System.out.print("Enter a choice: ");
  choice = in.nextInt();
  User user=new User();
  IUserService userService=new UserServiceImpl();
  int res=0;
  System.out.println("===================================================");
  switch(choice){
  case 1:
  System.out.println("1. Insert New Data");
  System.out.print("Enter Student's Name : ");
  name=str.nextLine();
  System.out.print("Enter Email : ");
  email=str.nextLine();
  System.out.print("Enter Mobile Number :");
  mNum=str.nextLine();
  System.out.print("Enter Address :");
  address=str.nextLine();
  System.out.print("Enter Class :");
  class1=str.nextLine();
  System.out.print("Enter Room Number :");
  roomNum= str.nextLine();
  System.out.print("Enter Type of room (AC/Non AC) :");
  typeAC= str.nextLine();
  System.out.print("Enter Room Sharing Type :");
  sharing=str.nextLine();
  System.out.print("Enter Payment Details:");
  payment= str.nextLine();
  int error=0;
    if (name.matches(Validation.regularExpression)) 
    {
     user.setName(name);

    } else {

    error++;

    System.out.println("Please Enter Proper Name");
      }

  if (email.matches(Validation.regxEmail)) 
  {
  user.setEmail(email);
    } else {
    	error++;
     System.out.print("Please Enter Proper Email");
      }
  if(mNum.matches(Validation.rgMobileNum))
  {
   user.setmNum(mNum);
  }
  else
  {
   System.out.print("Please Enter Proper Mobile Number");
   error++;
  }
  if (address.matches(Validation.rgAddress)) {
	  user.setAddress(address);
	    } else {
	     System.out.println("Please Enter Proper Address");
	     error++;
	      }
  if(class1.matches(Validation.rgClass1))
  {
   user.setClass1(class1);
  }
  else
  {
   System.out.println("Please Enter Proper Class of Study");
   error++;
  }
  hostel=new Hostel();
 if(roomNum.matches(Validation.roomExpression))
 {
  hostel.setRoomNum(roomNum);
 }else
 {
  System.out.print("Please Enter Proper Room Number");
  error++;
 }
 if(typeAC.matches(Validation.rgTypeAC))
 {
  hostel.setTypeAC(typeAC);
   }
 else
 {
  System.out.println("Please Enter Proper Type of Room (AC/Non AC)");
  error++;
 }
 if(sharing.matches(Validation.rgSharing))
 {
  hostel.setSharing(sharing);
 }
 else
 {
  System.out.println("Please Enter Proper type of Room Sharing");
  error++;
 }
 if(payment.matches(Validation.rgMobileNum))
 {
  hostel.setPayment(payment);
 }
 else
 {
  System.out.print("Please Enter Proper Mobile Number");
  error++;
 }
  user.setHostel(hostel);
   if(error>0)
   {
	  System.out.println("Please Enter Proper Data");
   }
   else {  
 	  res= userService.insertUser(user);
   }
  
  if(res==1) {  
  System.out.println("==========================================================================");
  System.out.println("                     Data Inserted Successfully");
  System.out.println("==========================================================================");
  }
  
  break;
  case 2:
  System.out.println("====================================================");
  System.out.println("Updating a Data");
  System.out.println("====================================================");
  System.out.print("Enter ID : ");
  id=in.nextInt();
  boolean b=userService.getUserId(id);
  if(b) {
  System.out.print("Enter Email : ");
  email=str.nextLine();
  System.out.print("Enter Mobile Number :");
  mNum=str.nextLine();
  System.out.print("Enter Address :");
  address=str.nextLine();
  System.out.print("Enter Class :");
  class1=str.nextLine();
  System.out.print("Enter Your Room Number :");
  roomNum=str.nextLine();
  System.out.print("Enter Your Room Type :");
  typeAC=str.nextLine();
  System.out.print("Enter Your Room Sharing :");
  sharing=str.nextLine();
  System.out.print("Enter Room Payment :");
  payment=str.nextLine();
  int updateError=0;
  hostel=new Hostel();
  hostel.setUserId(id);
  if (email.matches(Validation.regxEmail)) 
  {
  user.setEmail(email);
    } else {
    	updateError++;
     System.out.print("Please Enter Proper Email");
      }
  if(mNum.matches(Validation.rgMobileNum))
  {
   user.setmNum(mNum);
  }
  else
  {
   System.out.print("Please Enter Proper Mobile Number");
   updateError++;
  }
  if (address.matches(Validation.rgAddress)) {
	  user.setAddress(address);
	    } else {
	     System.out.println("Please Enter Proper Address");
	    updateError++;
	      }
  if(class1.matches(Validation.rgClass1))
  {
   user.setClass1(class1);
  }
  else
  {
   System.out.println("Please Enter Proper Class of Study");
   updateError++;
  }
  hostel=new Hostel();
 if(roomNum.matches(Validation.roomExpression))
 {
  hostel.setRoomNum(roomNum);
 }else
 {
  System.out.print("Please Enter Proper Room Number");
  updateError++;
 }
 if(typeAC.matches(Validation.rgTypeAC))
 {
  hostel.setTypeAC(typeAC);
   }
 else
 {
  System.out.println("Please Enter Proper Type of Room (AC/Non AC)");
  updateError++;
 }
 if(sharing.matches(Validation.rgSharing))
 {
  hostel.setSharing(sharing);
 }
 else
 {
  System.out.println("Please Enter Proper type of Room Sharing");
  updateError++;
 }
 if(payment.matches(Validation.rgMobileNum))
 {
  hostel.setPayment(payment);
 }
 else
 {
  System.out.print("Please Enter Proper Mobile Number");
  updateError++;
 }
  user.setHostel(hostel);

  user.setId(id);
//  user.setHostel(hostel);
  if(updateError>0)
  {
   //System.out.println("Please Enter Proper Data");
  }
  else {
   res=userService.updateUser(user);
   }
   if(res==1) {
      System.out.println("==========================================================================");
      System.out.println("                        Data Updated Successfully                          ");
      System.out.println("==========================================================================");
   }
  }
  else
  {
   System.out.println("Please Enter Id Which is in DataBase");
  }
  break;
  case 3:
  System.out.println("3. Deleting a Data");
  System.out.print("Enter ID : ");
  id=in.nextInt();
  b=userService.getUserId(id);
  if(b) {
  res=userService.deleteUser(id);
  if(res==1) {
  System.out.println("==========================================================================");
  System.out.println("                        Data Deleted Successfully                          ");
  System.out.println("===========================================================================");
  }
  }else
  {
   System.out.print("Please Enter Id Which is in the DataBase");
  }
  break;
  case 4:
  System.out.println("4. Print all Records");
   list= userService.getAllRecords();
   System.out.println("Id"+" "+"Name"+"\t"+"\t"+"Email"+"\t"+"\tMobileNum"+"\t"+"\tAddress"+"\t"+"Class1"+"\t"+"RoomNum"+"\t"+"TypeAC"+"\t"+"Sharing"+"\t"+"Floor"+"\t"+"Payment");
   System.out.println("==========================================================================================================================================================");

  //list.forEach(us->System.out.println(us.getId()+" "+us.getName()+" "+us.getAge()+" "+us.getEmail()+" "+us.getClass()));
   for(User us:list)
  {
	hostel= us.getHostel();
	System.out.println(us.getId()+" "+us.getName()+" "+us.getEmail()+" "+us.getmNum()+" "+us.getAddress()+" "+us.getClass1()+" "+hostel.getRoomNum()+" "+hostel.getTypeAC()+" "+hostel.getSharing()+" "+hostel.getPayment());
  }

  break;

  case 6:
	  System.out.println("=========================================================================");
      System.out.println("                                  Thank You                              ");
      System.out.println("=========================================================================");
  System.exit(0);
  break;
  case 5:
  System.out.println("Print all Records in Sorting Order By Name");
  list= userService.getAllNamesSortedOrder();
  System.out.println("Id"+" "+"  Name   "+"\t"+"            Email    "+"\t"+"    MobileNum "+"\t"+"     Address     "+"\t"+"  Class  "+"\t"+"  RoomNum   "+"\t"+"  typeAC  "+"\t"+"  sharing  "+"\t"+"Payment");

  System.out.println("==============================================================================================================================================================================");

  for(User us:list)

  {

	  hostel= us.getHostel();

	  System.out.println(us.getId()+"      "+us.getName()+"       "+us.getEmail()+"     "+us.getmNum()+"     "+us.getAddress()+"     "+us.getClass1()+"     "+hostel.getRoomNum()+"     "+hostel.getTypeAC()+"     "+hostel.getSharing()+"     "+hostel.getPayment());
  }
  break;

 case 7:
 System.out.println("Print all Records By RoomNum");
 System.out.println("Enter Room Number : ");
 roomNum=str.nextLine();
 list= userService.getAllRecordsByRoomNum(roomNum);
 System.out.println("Id"+" "+"  Name   "+"\t"+"            Email    "+"\t"+"    MobileNum "+"\t"+"     Address     "+"\t"+"  Class  "+"\t"+"  RoomNum   "+"\t"+"  typeAC  "+"\t"+"  sharing  "+"\t"+"Payment");

  System.out.println("==============================================================================================================================================================================");
  for(User us:list)

   {

	  hostel= us.getHostel();

	  System.out.println(us.getId()+"      "+us.getName()+"       "+us.getEmail()+"     "+us.getmNum()+"     "+us.getAddress()+"     "+us.getClass1()+"     "+hostel.getRoomNum()+"     "+hostel.getTypeAC()+"     "+hostel.getSharing()+"      "+hostel.getPayment());
   }

 break;

  default:
	  System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ");
      System.out.println("                                     Invalid Selection                                  ");
      System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
  break;
  }
  System.out.println("===============================================================================");
  System.out.println("                             Thank You !!!                                     ");
  System.out.println("===============================================================================");
 }

 }

} 











package hms.basic.main;

import java.util.List;
import java.util.Scanner;
import hms.basic.exception.InvalidAgeException;
import hms.basic.bean.Address;
import hms.basic.bean.User;
import hms.basic.service.IUserService;
import hms.basic.service.UserServiceImpl;
import hms.basic.util.Validation;

public class Hostel {
	 public static void main(String[] args) throws Exception {
	 int id,age,choice;
	 String name,email,roomtype,mobileNumber,street,state,city,country;
	 List<User> list;
	 Address address=null;
	 Scanner in = new Scanner(System.in);
	 Scanner str = new Scanner(System.in);
	 while(true)

	 {
	  System.out.println("=========================================== ");
	  System.out.println("                 WELCOME TO                   ");
	  System.out.println("           HOSTEL MANAGEMENT SYSTEM  ");
	  System.out.println("===========================================");
	  System.out.println("Enter the Details for Hostel Booking. ");
	  System.out.println("1. Insert New Data");
	  System.out.println("2. Modify the Existing Data");
	  System.out.println("3. Delete the Existing Data");
	  System.out.println("4. Show Existing Data");
	  System.out.println("5. Exit");
	  System.out.println("6. Sort data ByName");
	  System.out.println("7. Display Data By City");
	  System.out.print("Enter a choice: ");
	  choice = in.nextInt();
	  User user=new User();
	  IUserService userService=new UserServiceImpl();
	  int res=0;
	  System.out.println("----------------------------------------------------------------");
	  switch(choice){
	  case 1:
	  System.out.println("1. Insert New Data");
	  System.out.println("Enter Your Name : ");
	  name=str.nextLine();
	  System.out.println("Enter Your Age : ");
	  age=in.nextInt();
	  System.out.println("Enter Your Email : ");
	  email=str.nextLine();
	  System.out.println("Enter Room Type : ");
	  roomtype=str.nextLine();
	  System.out.println("Enter Your Mobile Number :");
	  mobileNumber= str.nextLine();
	  System.out.println("Enter Your Street :");
	  street=str.nextLine();
	  System.out.println("Enter Your City :");
	  city=str.nextLine();
	  System.out.println("Enter Your State :");
	  state=str.nextLine();
	  System.out.println("Enter Your Country :");
	  country=str.nextLine();
	  int error=0;
	    if (name.matches(Validation.regularExpression)) {

	     user.setName(name);

	    } else {

	    error++;

	    System.out.println("Please Enter Proper Name");

	      }

	    if (String.valueOf(age).matches(Validation.ageExpression)) {
	      if (age<=0 || age>130) {

	       error++;

	       try {

	       throw new InvalidAgeException("Age Should Not Be More than 130 years or Negative Number Or Zero");

	    } catch (InvalidAgeException e) {

	    System.out.println(e.getMessage());

	    }

	      }

	      else

	      {

	       user.setAge(age);

	      }

	    } else {

	     System.out.println("Please Enter Proper Age");
	     error++;

	    }

	  if (email.matches(Validation.regxEmail)) {
	  user.setEmail(email);

	    } else {

	     System.out.println("Please Enter Proper Email");
	     error++;

	      }
	  
	  if (roomtype.matches(Validation.roomExpression)) {
		  user.setRoomtype(roomtype);

		    } else {

		     System.out.println("Please Enter Room Type(AC/NON-AC) ");
		     error++;

		      }

	  if (mobileNumber.matches(Validation.MobileNum)) {
		  user.setMobileNumber(mobileNumber);

		    } else {

		     System.out.println("Mobile Number Should be of 10 digits only!! ");
		     error++;

		      }

	  address=new Address();
	 if(street.matches(Validation.regularExpression))
	 {
	  address.setStreet(street);
	 }
	 else
	 {
	  System.out.println("Please Enter Proper Street");
	  error++;
	 }

	 if(city.matches(Validation.regularExpression))

	 {
	  address.setCity(city);
	   }
	 else
	 {
	  System.out.println("Please Enter Proper City");
	  error++;
	 }

	 if(state.matches(Validation.regularExpression))
	 {
	  address.setState(state);
	 }
	 else
	 {
	  System.out.println("Please Enter Proper State");
	  error++;
	 }
	 if(country.matches(Validation.regularExpression))
	 {
	  address.setCountry(country);
	 }
	 else
	 {
	  System.out.println("Please Enter Proper Country");
	  error++;
	 }
	 user.setAddress(address);
	 //address=user.getAddress();
	  if(error>0)
	  {
	   //System.out.println("Please Enter Proper Data");
	  }
	  else {
	  res=userService.insertUser(user);
	  }
	  if(res==1) {
	  System.out.println("Data Inserted Successfully");
	  }
	  break;
	  case 2:
	  System.out.println("2. Updating the Data");
	  System.out.println("Enter ID : ");
	  id=in.nextInt();
	  boolean b=userService.getUserId(id);
	  if(b) {
	  System.out.println("Enter Email : ");
	  email=str.nextLine();
	  System.out.println("Enter Room Type(AC/NON-AC) : ");
	  roomtype=str.nextLine();
	  System.out.println("Enter Your Mobile Number : ");
	  mobileNumber=str.nextLine();
	  System.out.println("Enter Street :");
	  street=str.nextLine();
	  System.out.println("Enter City :");
	  city=str.nextLine();
	  System.out.println("Enter State :");
	  state=str.nextLine();
	  System.out.println("Enter Country :");
	  country=str.nextLine();
	  int updateError=0;
	  address=new Address();
	  address.setUserId(id);
	  if(email.matches(Validation.regxEmail))
	  {
	   user.setEmail(email);
	  }
	  else
	  {
	   System.out.println("Please Enter Proper Email");
	   updateError++;
	  }
	  if(roomtype.matches(Validation.roomExpression))
	  {
	   user.setEmail(roomtype);
	  }
	  else
	  {
	   System.out.println("Please Enter Proper Roomtype(AC/NON-AC) ");
	   updateError++;
	  }
	  if (mobileNumber.matches(Validation.MobileNum)) {
		  user.setMobileNumber(mobileNumber);
		    } else {
		     System.out.println("Mobile Number Should be of 10 digits only!! ");
		     updateError++;
		      }
	  if(street.matches(Validation.regularExpression))
	   {address.setStreet(street);
	   }
	  else
	  {
	   System.out.println("Please Enter Proper Street");
	   updateError++;
	  }
	  if(city.matches(Validation.regularExpression))
	  {
	  address.setCity(city);
	  }
	  else
	  {
	   System.out.println("Please Enter Proper City");
	   updateError=5;
	  }
	  if(state.matches(Validation.regularExpression))
	  {
	  address.setState(state);
	  }
	  else
	  {
	   System.out.println("Please Enter Proper State");
	   updateError++;
	  }
	  if(country.matches(Validation.regularExpression))
	  {
	   address.setCountry(country);
	  }
	  else
	  {System.out.println("Please Enter Proper Country");
	   updateError++;
	  }
	  user.setId(id);
	  user.setAddress(address);
	  if(updateError>0)
	  {
	   //System.out.println("Please Enter Proper Data");
	  }
	  else {
	   res=userService.updateUser(user);
	   }					
	   if(res==1) {
	  System.out.println("Data Updated Successfully");
	   }
	  }
	  else
	  {
	   System.out.println("Please Enter Id Which is in DataBase");
	  }
	  break;
	  case 3:
	  System.out.println("3. Deleting a Data");
	  System.out.println("Enter ID : ");
	  id=in.nextInt();
	  b=userService.getUserId(id);
	  if(b) {
	  res=userService.deleteUser(id);
	  if(res==1) {
	  System.out.println("Data Deleted Successfully");
	  }
	  }else
	  {
	   System.out.println("Please Enter Id Which is in the DataBase");
	  }
	  break;
	  case 4:
	  System.out.println("4. Display all Records");
	   list= userService.getAllRecords();
	   System.out.println("Id"+" "+"Name"+"\t"+"Age"+"\t"+"roomType"+"\t"+"mobilenumber"+"\t"+"Email"+"\t"+"\tStreet"+"\t"+"\tCity"+"\t"+"State"+"\t"+"Country");
	   System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");

	  //list.forEach(us->System.out.println(us.getId()+" "+us.getName()+" "+us.getAge()+" "+us.getEmail()+" "+us.getClass()));

	   for(User us:list)
	  {
	   address= us.getAddress();
	   System.out.println(us.getId()+" "+us.getName()+" "+us.getAge()+" "+us.getRoomtype()+" "+us.getMobileNumber()+" "+us.getEmail()+" "+address.getStreet()+" "+address.getCity()+" "+address.getState()+" "+address.getCountry());
	  }
	  break;
	  case 5:
	  System.out.println("Thank You");
	  System.exit(0);
	  break;
	  case 6:
	  System.out.println("6. Display all Records in Sorting Order By Name");
	  list= userService.getAllNamesSortedOrder();
	  System.out.println("Id"+" "+"Name"+"\t"+"Age"+"\t"+"Email"+"\t"+"roomtype"+"\t"+"mobilenumber"+"\t"+"\tStreet"+"\t"+"\tCity"+"\t"+"State"+"\t"+"Country");
	  System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
	  for(User us:list)
	  {
	   address= us.getAddress();
	   System.out.println(us.getId()+" "+us.getName()+" "+us.getAge()+" "+us.getEmail()+" "+us.getRoomtype()+" "+us.getMobileNumber()+" "+address.getStreet()+" "+address.getCity()+" "+address.getState()+" "+address.getCountry());
	  }
	  break;
	  case 7:
	  System.out.println("Enter City : ");
	  city=str.nextLine();
	  System.out.println("7. Display all Records By City");
	  list= userService.getAllRecordsByCity(city);
	  System.out.println("Id"+" "+"Name"+"\t"+"Age"+"\t"+"Email"+"\t"+"roomtype"+"\t"+"mobilenumber"+"\t"+"\tStreet"+"\t"+"\tCity"+"\t"+"State"+"\t"+"Country");
	  System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

	  for(User us:list)
	   {
	   address= us.getAddress();
	   System.out.println(us.getId()+" "+us.getName()+" "+us.getAge()+" "+us.getEmail()+" "+us.getRoomtype()+" "+us.getMobileNumber()+" "+address.getStreet()+" "+address.getCity()+" "+address.getState()+" "+address.getCountry());
	   }
	  break;
	  default:
	  System.out.println("Invalid Selection");
	  break;
	  }
	  System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
	 }

	 }

	} 

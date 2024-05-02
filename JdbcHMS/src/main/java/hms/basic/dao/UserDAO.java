 package hms.basic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import hms.basic.exception.InvalidAgeException;
import hms.basic.bean.Address;
import hms.basic.bean.User;
import hms.basic.util.DBUtil;

public class UserDAO implements IUserDAO
{
 Connection con;
 PreparedStatement preparedStatement;
 Statement statement;
 String qry="";
 public int insertUser(User user)throws InvalidAgeException
 {
 int id=0,i=0;
  con=DBUtil.getConnection();
 try {
  con.setAutoCommit(false);

  //create table users(id int auto_increment primary key,name varchar(25),age int,email varchar(25),roomtype varchar(25),MobileNumber bigint);

 qry="insert into users(NAME,AGE,EMAIL,ROOMTYPE,MobileNumber) values(?,?,?,?,?)";
 preparedStatement= con.prepareStatement(qry);
 preparedStatement.setString(1, user.getName());
 preparedStatement.setInt(2, user.getAge());
 preparedStatement.setString(3, user.getEmail());
 preparedStatement.setString(4, user.getRoomtype());
 preparedStatement.setString(5, user.getMobileNumber());
  i=preparedStatement.executeUpdate();

 Address address=user.getAddress();
 qry="select max(id) from users";
 statement=con.createStatement();
 ResultSet rs=statement.executeQuery(qry);
 if(rs.next())
 {

  id=rs.getInt(1);

 }

 else

 {

  id=id+1;

 }

 address.setUserId(id);

 //create table address(userid int,street varchar(25),city varchar(25),state varchar(25),country varchar(25), constraint fk_key foreign key(userid) references users(id));

 qry="insert into address(userid,street,city,state,country) values(?,?,?,?,?)";
 preparedStatement= con.prepareStatement(qry);
 preparedStatement.setInt(1, address.getUserId());
 preparedStatement.setString(2, address.getStreet());
 preparedStatement.setString(3, address.getCity());
 preparedStatement.setString(4, address.getState());
 preparedStatement.setString(5, address.getCountry());
 int j=preparedStatement.executeUpdate();
 if(i==1 && j==1)
 {

  con.commit();

 }

 else

 {

  con.rollback();

 }

 con.close();

 }catch (Exception e) {

  e.printStackTrace();

 }

 return i;

 }

 public boolean getUserId(int id)throws SQLException
 {

 con=DBUtil.getConnection();
 qry="select id from users where id=?";
 preparedStatement=con.prepareStatement(qry);
 preparedStatement.setInt(1, id);
 ResultSet rs=preparedStatement.executeQuery();
 if(rs.next())
 {

  return true;

 }

 else

 {

  return false;

 }

 }

 public int updateUser(User user)throws SQLException
 {
 con=DBUtil.getConnection();
 con.setAutoCommit(false);
 qry="update users set email=?,roomtype=?,mobileNumber=? where ID=?";
 preparedStatement= con.prepareStatement(qry);
 preparedStatement.setString(1, user.getEmail());
 preparedStatement.setString(2, user.getRoomtype());
 preparedStatement.setString(3, user.getMobileNumber());
 preparedStatement.setInt(4, user.getId());
 int i=preparedStatement.executeUpdate();

 Address address=user.getAddress();

 //System.out.println(user.getId()+" "+user.getEmail()+" "+address.getUserId()+" "+address.getStreet()+" "+address.getCity()+" "+address.getState()+" "+address.getCountry());

 qry="update address set street=?,city=?,state=?,country=? where USERID=?";
 preparedStatement= con.prepareStatement(qry);
 preparedStatement.setString(1, address.getStreet());
 preparedStatement.setString(2, address.getCity());
 preparedStatement.setString(3, address.getState());
 preparedStatement.setString(4, address.getCountry());
 preparedStatement.setInt(5, address.getUserId());

 int j= preparedStatement.executeUpdate();
  if(i==1 && j>=1)
  {
  con.commit();

  }

  else

  {

  con.rollback();

  }

  con.close();

 return i;

 }

 public int deleteUser(int id)throws SQLException
 {

 con=DBUtil.getConnection();
 con.setAutoCommit(false);
 qry="delete from address where userID=?";
 preparedStatement= con.prepareStatement(qry);
 preparedStatement.setInt(1, id);
 int i=preparedStatement.executeUpdate();
 qry="delete from users where ID=?";
 preparedStatement= con.prepareStatement(qry);
 preparedStatement.setInt(1, id);
 int j=preparedStatement.executeUpdate();
 if(i>=1 && j>=1)
 {

  con.commit();

 }

 else
 {

  con.rollback();
 }

 con.close();
 return i;
 }

 public List<User> getAllRecords()throws SQLException
 {

 Statement stmt =DBUtil.getConnection().createStatement();
 qry="select user.id,user.name,user.age,"
  + "user.email,user.roomtype,user.mobilenumber, "
  + "addr.street,addr.city,addr.state,"
  + "addr.country from users user join address addr on user.id=addr.userid;";
 ResultSet rs=stmt.executeQuery(qry);
 List<User> arrayList=new ArrayList<User>();
 while(rs.next())
 {
  User user=new User();
  Address address=new Address();
  user.setId(rs.getInt("ID"));
  user.setName(rs.getString("NAME"));
  user.setAge(rs.getInt("AGE"));
  user.setEmail(rs.getString("email"));
  user.setRoomtype(rs.getString("roomtype"));
  user.setMobileNumber(rs.getString("mobileNumber"));
  address.setStreet(rs.getString(5));
  address.setCity(rs.getString(6));
  address.setState(rs.getString(7));
  address.setCountry(rs.getString(8));
  user.setAddress(address);
  arrayList.add(user);
 }

 return arrayList;

 }

 public List<User> getAllRecordsByCity(String city)throws SQLException

 {

 qry="select user.id,user.name,user.age,user.email,user.roomtype,user.mobilenumber,"
 		+ "addr.street,addr.city,addr.state,addr.country "
 		+ "from users user join address addr where addr.city=? and user.id=addr.userid;";
 preparedStatement =DBUtil.getConnection().prepareStatement(qry);
 preparedStatement.setString(1, city);
 ResultSet rs=preparedStatement.executeQuery();
 List<User> arrayList=new ArrayList<User>();
 while(rs.next())
 {
  User user=new User();
  Address address=new Address();
  user.setId(rs.getInt("ID"));
  user.setName(rs.getString("NAME"));
  user.setAge(rs.getInt("AGE"));
  user.setEmail(rs.getString("email"));
  user.setRoomtype(rs.getString("roomtype"));
  user.setMobileNumber(rs.getString("mobileNumber"));
  address.setStreet(rs.getString(5));
  address.setCity(rs.getString(6));
  address.setState(rs.getString(7));
  address.setCountry(rs.getString(8));
  user.setAddress(address);
  arrayList.add(user);
 }

 return arrayList;

 }

 public List<User> getAllNamesSortedOrder()throws SQLException
 {

 Statement stmt =DBUtil.getConnection().createStatement();
 qry="select user.id,user.name,user.age,user.email,user.roomtype,user.mobilenumber,"
 		+ "addr.street,addr.city,addr.state,addr.country from users"
 		+ " user join address addr on user.id=addr.userid order by user.name";
 ResultSet rs=stmt.executeQuery(qry);
 List<User> arrayList=new ArrayList<User>();
 while(rs.next())
 {
  User user=new User();
  Address address=new Address();
  user.setId(rs.getInt("ID"));
  user.setName(rs.getString("NAME"));
  user.setAge(rs.getInt("AGE"));
  user.setEmail(rs.getString("email"));
  user.setRoomtype(rs.getString("roomtype"));
  user.setMobileNumber(rs.getString("mobilenumber"));
  address.setStreet(rs.getString(5));
  address.setCity(rs.getString(6));
  address.setState(rs.getString(7));
  address.setCountry(rs.getString(8));
  user.setAddress(address);
  arrayList.add(user);
  }

 return arrayList;
 }

}







 
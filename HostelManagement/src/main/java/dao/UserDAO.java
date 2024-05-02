package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import bean.Hostel;
import bean.User;
import exception.InvalidException;
import util.*;

public class UserDAO implements IUserDAO{
 Connection con;
 PreparedStatement preparedStatement;
 Statement statement;
 String qry="";
 public int insertUser(User user)throws InvalidException
 {
 int id=0,i=0;
  con=DBUtil.getConnection();
 try {
  con.setAutoCommit(false);
  //create table users(id int auto_increment primary key,name varchar(25),email varchar(45),mNum bigint,address varchar(50),class1 varchar(25));
 qry="insert into users (NAME,EMAIL,mNum,address,class1) values(?,?,?,?,?)";
 preparedStatement= con.prepareStatement(qry);
 preparedStatement.setString(1, user.getName());
 preparedStatement.setString(2, user.getEmail());
 preparedStatement.setString(3, user.getmNum());
 preparedStatement.setString(4, user.getAddress());
 preparedStatement.setString(5, user.getClass1());
 i=preparedStatement.executeUpdate();
 Hostel room=user.getHostel();
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
 room.setUserId(id);
 //create table hostel(userid int,roomNum varchar(25),typeAC varchar(25),sharing varchar(25),payment varchar(25),constraint fk_key foreign key (userid) references users(id));
 qry="insert into hostel(userid,roomNum,typeAC,sharing,payment) values(?,?,?,?,?)";
 preparedStatement= con.prepareStatement(qry);
 preparedStatement.setInt(1, room.getUserId());
 preparedStatement.setString(2, room.getRoomNum());
 preparedStatement.setString(3, room.getTypeAC());
 preparedStatement.setString(4, room.getSharing());
 preparedStatement.setString(5, room.getPayment());
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
 qry="update users set email=?,mNum=?,address=?,class1=? where ID=?";
 preparedStatement= con.prepareStatement(qry);
 preparedStatement.setString(1, user.getEmail());
 preparedStatement.setString(2, user.getmNum());
 preparedStatement.setString(3, user.getAddress());
 preparedStatement.setString(4, user.getClass1());
 preparedStatement.setInt(5, user.getId());
 int i=preparedStatement.executeUpdate();
 Hostel room=user.getHostel();
 //System.out.println(user.getId()+" "+user.getEmail()+" "+address.getUserId()+" "+address.getStreet()+" "+address.getCity()+" "+address.getState()+" "+address.getCountry());
 qry="update hostel set roomNum=?,typeAC=?,sharing=?,payment=? where USERID=?";
 preparedStatement= con.prepareStatement(qry);
 preparedStatement.setString(1, room.getRoomNum());
 preparedStatement.setString(2, room.getTypeAC());
 preparedStatement.setString(3, room.getSharing());
 preparedStatement.setString(4, room.getPayment());
 preparedStatement.setInt(5, user.getId()); 
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
 qry="delete from hostel where userID=?";
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
 qry="select user.id,user.name,user.email,"
  + "user.mNum,user.address,user.class1,"
  + "hostel.roomNum,hostel.typeAC,hostel.sharing,"
  + "hostel.payment from users user join hostel hostel on user.id=hostel.userid;";
 ResultSet rs=stmt.executeQuery(qry);
 List<User> arrayList=new ArrayList<User>();
 while(rs.next())
 {
  User user=new User();
  Hostel hostel=new Hostel();
  user.setId(rs.getInt("ID"));
  user.setName(rs.getString("NAME"));
  user.setEmail(rs.getString("email"));
  hostel.setRoomNum(rs.getString(5));
  hostel.setTypeAC(rs.getString(6));
  hostel.setPayment(rs.getString(7));
  user.setmNum(rs.getString(8));
  user.setClass1(rs.getString(9));
  user.setHostel(hostel);
  arrayList.add(user);
 }
 return arrayList;
 }
 public List<User> getAllRecordsByRoomNum(String roomNum)throws SQLException
 {
 qry="select user.id,user.name,user.email,user.mNum,"
 + "user.address,user.class1,hostel.roomNum,hostel.typeAC,hostel.sharing,hostel.payment from users user join hostel "
 + "hostel on user.id=hostel.userid where hostel.roomNum=? order by hostel.roomNum;";
 preparedStatement =DBUtil.getConnection().prepareStatement(qry);
 preparedStatement.setString(1, roomNum);
 ResultSet rs=preparedStatement.executeQuery();
 List<User> arrayList=new ArrayList<User>();
 while(rs.next())
 {
  User user=new User();
  Hostel hostel =new Hostel();
  user.setId(rs.getInt("ID"));
  user.setName(rs.getString("NAME"));
  user.setEmail(rs.getString("email"));
  user.setmNum(rs.getString("mNum"));
  user.setAddress(rs.getString("address"));
  user.setClass1(rs.getString("class1"));
  hostel.setRoomNum(rs.getString(5));
  hostel.setTypeAC(rs.getString(6));
  hostel.setSharing(rs.getString(7));
  hostel.setPayment(rs.getString(8));
  user.setHostel(hostel);
  arrayList.add(user);
 }
 return arrayList;
 }
 public List<User> getAllNamesSortedOrder()throws SQLException
 {
 Statement stmt =DBUtil.getConnection().createStatement();
 qry="select user.id,user.name,user.email,user.mNum,"
 + "user.address,user.class1,hostel.roomNum,hostel.typeAC,hostel.sharing,hostel.payment from users"
 + " user join hostel hostel on user.id=hostel.userid order by user.name";
 ResultSet rs=stmt.executeQuery(qry);
 List<User> arrayList=new ArrayList<User>();
 while(rs.next())
 {
  User user=new User();
  Hostel hostel=new Hostel();
  user.setId(rs.getInt("ID"));
  user.setName(rs.getString("NAME"));
  user.setAddress(rs.getString("address"));
  user.setEmail(rs.getString("email"));
  user.setmNum(rs.getString("mNum"));
  user.setClass1(rs.getString("class1"));
  hostel.setRoomNum(rs.getString(5));
  hostel.setTypeAC(rs.getString(6));
  hostel.setSharing(rs.getString(7));
  hostel.setPayment(rs.getString(8));
  user.setHostel(hostel);
  arrayList.add(user);
  }

 return arrayList;

 }

}



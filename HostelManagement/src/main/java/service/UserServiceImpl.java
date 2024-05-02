package service;

import java.sql.SQLException;
import java.util.List;
import dao.IUserDAO;
import dao.UserDAO;
import bean.User;
import exception.InvalidException;

public class UserServiceImpl implements IUserService{
 
IUserDAO userDAO=new UserDAO();
public int insertUser(User user)throws InvalidException{
 return userDAO.insertUser(user);
 }
public int updateUser(User user)throws SQLException{
 return userDAO.updateUser(user);
 }
public int deleteUser(int id)throws SQLException{
 return userDAO.deleteUser(id);
 }
public List<User> getAllRecords()throws SQLException{
 return userDAO.getAllRecords();
 }
public List<User> getAllRecordsByRoomNum(String roomNum) throws SQLException{
 return userDAO.getAllRecordsByRoomNum(roomNum);
 }
public List<User> getAllNamesSortedOrder()throws SQLException{
 return userDAO.getAllNamesSortedOrder();
 }
public boolean getUserId(int id)throws SQLException{
 return userDAO.getUserId(id);
 }
public List<User> getAllRecordsByRoomNum(int roomNum) throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

}

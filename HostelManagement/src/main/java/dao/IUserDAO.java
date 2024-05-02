package dao;

import java.sql.SQLException;
import java.util.List;
import bean.User;
import exception.InvalidException;

public interface IUserDAO {
	
public int insertUser(User user)throws InvalidException;
public int updateUser(User user)throws SQLException;
public int deleteUser(int id)throws SQLException;
public List<User> getAllRecords()throws SQLException;
public List<User> getAllRecordsByRoomNum(String roomNum)throws SQLException;
public List<User> getAllNamesSortedOrder()throws SQLException;
public boolean getUserId(int id)throws SQLException;
//public List<User> getAllRecordsByRoomNum(String roomNum);


}



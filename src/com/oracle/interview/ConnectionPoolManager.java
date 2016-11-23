package com.oracle.interview;

import java.util.*;
import java.sql.*;

public class ConnectionPoolManager
{

 String databaseUrl = "jdbc:mysql://localhost:3306/myDatabase";
 String userName = "userName";
 String password = "userPass";

 Vector connectionPool = new Vector();

 public ConnectionPoolManager()
 {
	 initializeConnectionPool();
 }

 public ConnectionPoolManager(String databaseUrl,String userName,String password)
 {
  this.databaseUrl = databaseUrl;
  this.userName = userName;
  this.password = password;
  initializeConnectionPool();
 }

 private void initializeConnectionPool()
 {
  while(!checkIfConnectionPoolIsFull())
  {
   System.out.println("Connection Pool is NOT full. Proceeding with adding new connections");
   connectionPool.addElement(createNewConnectionForPool());
  }
  System.out.println("Connection Pool is full.");
 }

 private synchronized boolean checkIfConnectionPoolIsFull()
 {
  final int MAX_POOL_SIZE = 5;

  //Check if the pool size
  if(connectionPool.size() < 5)
  {
   return false;
  }

  return true;
 }

 //Creating a connection
 private Connection createNewConnectionForPool()
 {
  Connection connection = null;

  try
  {
   Class.forName("com.mysql.jdbc.Driver");
   connection = DriverManager.getConnection(databaseUrl, userName, password);
   System.out.println("Connection: "+connection);
  }
  catch(SQLException sqle)
  {
   System.err.println("SQLException: "+sqle);
   return null;
  }
  catch(ClassNotFoundException cnfe)
  {
   System.err.println("ClassNotFoundException: "+cnfe);
   return null;
  }

  return connection;
 }

 public synchronized Connection getConnectionFromPool()
 {
  Connection connection = null;

  //Check if there is a connection available. There are times when all the connections in the pool may be used up
  if(connectionPool.size() > 0)
  {
   connection = (Connection) connectionPool.firstElement();
   connectionPool.removeElementAt(0);
  }
  //Giving away the connection from the connection pool
  return connection;
 }

 public synchronized void returnConnectionToPool(Connection connection)
 {
  //Adding the connection from the client back to the connection pool
  connectionPool.addElement(connection);
 }

 public static void main(String args[])
 {
  ConnectionPoolManager ConnectionPoolManager = new ConnectionPoolManager();
 }

}

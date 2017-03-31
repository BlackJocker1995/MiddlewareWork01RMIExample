
import java.rmi.server.*;
import java.rmi.*;

public class DataServiceImpl extends UnicastRemoteObject implements
DataService {
protected DataServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getData() throws RemoteException {
		// TODO Auto-generated method stub
		return Math.random();
	}
	// Crate table named "table_name"
	public void CreateTable(String table_name)throws RemoteException{
		DBmanager.CreateTable(table_name);
	}
	// insert one element
	public void Insert(String name,int score)throws RemoteException{
		DBmanager.Insert(name,score);
	}
	// search the score from table
	public int Search(String name)throws RemoteException{
		return DBmanager.Search(name);
	}


}

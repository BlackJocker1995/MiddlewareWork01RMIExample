
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DataService extends Remote
{
	public double getData() throws RemoteException ;

	public void CreateTable(String table_name)throws RemoteException;

	public void Insert(String name,int score)throws RemoteException;

	public int Search(String name)throws RemoteException;
}

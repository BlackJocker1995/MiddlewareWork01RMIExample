
import java.rmi.*;

public interface TimeService extends Remote
{
	public java.util.Date getTime() throws RemoteException ;
}


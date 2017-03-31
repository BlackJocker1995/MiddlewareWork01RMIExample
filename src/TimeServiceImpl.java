
import java.rmi.server.*;
import java.rmi.*;
import java.util.Date;
public class TimeServiceImpl extends UnicastRemoteObject implements
TimeService {

	public TimeServiceImpl() throws RemoteException {
		super();
	}
	public Date getTime() throws RemoteException {
		// TODO Auto-generated method stub
		return new Date(System.currentTimeMillis());
	}
}

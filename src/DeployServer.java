import java.rmi.*;
import java.rmi.registry.LocateRegistry;



public class DeployServer {
	public static void main(String[] args) {
		// ��������װ��ȫ������
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}

		try {
			// ����Զ�̶���
			TimeServiceImpl ts = new TimeServiceImpl();
			DataServiceImpl ds=new DataServiceImpl();

			// ����ע�����,���û�������䣬��Ҫ�ֹ���������ʼ�˵�--����--rmiregistry��Ĭ�϶˿�1099
			LocateRegistry.createRegistry(1100);   //�������˿ںſ�����ָ��
			
			// Զ�̶���󶨵�����
			Naming.rebind("//localhost:1100/ts", ts);
			Naming.rebind("//localhost:1100/ds", ds);

			System.out.println("RMI is running ............");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

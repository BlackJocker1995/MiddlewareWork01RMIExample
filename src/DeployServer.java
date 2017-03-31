import java.rmi.*;
import java.rmi.registry.LocateRegistry;



public class DeployServer {
	public static void main(String[] args) {
		// 创建并安装安全管理器
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}

		try {
			// 创建远程对象
			TimeServiceImpl ts = new TimeServiceImpl();
			DataServiceImpl ds=new DataServiceImpl();

			// 启动注册服务,如果没有这个语句，需要手工启动：开始菜单--运行--rmiregistry，默认端口1099
			LocateRegistry.createRegistry(1100);   //这里，服务端口号可任意指定
			
			// 远程对象绑定到服务
			Naming.rebind("//localhost:1100/ts", ts);
			Naming.rebind("//localhost:1100/ds", ds);

			System.out.println("RMI is running ............");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

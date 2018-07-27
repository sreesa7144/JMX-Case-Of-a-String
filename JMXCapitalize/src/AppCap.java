
import java.lang.management.ManagementFactory;
import java.util.Scanner;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class AppCap {
	public static void main(String[] args) throws Exception
	{
		Capitalize capitalize= new Capitalize();
	//	capitalize.Convertor()
		 registerWithJmxAgent(capitalize);
	      startConsoleApp(capitalize);
	}
	 private static void registerWithJmxAgent(Capitalize capitalize) throws Exception {
	      MBeanServer mbs3 = ManagementFactory.getPlatformMBeanServer();
	      ObjectName name3 = new ObjectName("com.opsramp.capitalize:type=capitalize");
	      mbs3.registerMBean(capitalize, name3);

}
	 private static void startConsoleApp(Capitalize capitalize) {
	      Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the string dude!!!");
          String s1=scanner.nextLine();
          String s2=capitalize.Convertor(s1);
          System.out.println(s2);
          String s3=scanner.nextLine();
          String s4=capitalize.Convertor(s3);
         
          System.out.println(s4);
          scanner.close();
         // String capitalizer=capitalize.getCapitalize();
          
          
	    
	  }
	 
}

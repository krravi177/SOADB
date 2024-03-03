package max;

public class UserDAo {
public static String insertUserByservice(User rr)
{
	try {
		System.out.println("server "+rr.getPhone()+" "+rr.getName()+" "+rr.getAdd());
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return "Send XML from Client to Server XML---> ";
}
}

package max;

import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class RequestHandlerClass {

	public String getUserDetailByXML(String userXML)
	{
		
			try {
				JAXBContext jc = JAXBContext.newInstance(User.class);
				Unmarshaller um = jc.createUnmarshaller();
				  StringReader sr = new StringReader(userXML);
				Object r = um.unmarshal(sr);
				User rr= (User) r;
				return UserDAo.insertUserByservice(rr);
	} catch (Exception e) {
				e.printStackTrace();
			}
			
		
		return "fail data on server ";
	}
	
	
	
	public String getStateData()
	{
		
		List<StateBean> list = new LocationDao().getStateList();
		StateClass sc = new StateClass();
		sc.setList(list);
		String xml = new XMLGenerator().generateXMl(sc);
		return xml;
		
	}
	
}

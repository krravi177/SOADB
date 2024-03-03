package max;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class XMLGenerator {

	public String generateXMl(StateClass sc)
	{
		try {
			JAXBContext jc = JAXBContext.newInstance(StateClass.class);
			Marshaller cm = jc.createMarshaller();
			StringWriter sw = new StringWriter();
			  cm.marshal(sc, sw);
			 return sw.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}

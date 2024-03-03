package reg;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;



public class GenerateXml {

	public String generateXMl(RegBean rb)
	{
		try {
			JAXBContext jc = JAXBContext.newInstance(RegBean.class);
			Marshaller cm = jc.createMarshaller();
			StringWriter sw = new StringWriter();
			  cm.marshal(rb, sw);
			 return sw.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

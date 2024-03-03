package readxml;

import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class ReadXML {

	
	public List<StateDTO> readXMLBYUnmarshling(String xml)
	{
		try {
			JAXBContext jc = JAXBContext.newInstance(XMLDATA.class);
			Unmarshaller um = jc.createUnmarshaller();
			  StringReader sr = new StringReader(xml);
			Object r = um.unmarshal(sr);
			XMLDATA rr= (XMLDATA) r;
			List<StateDTO> list = rr.getList();
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}

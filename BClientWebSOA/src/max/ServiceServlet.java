package max;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import readxml.ReadXML;
import readxml.StateDTO;


@WebServlet("/services")
public class ServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
RequestHandlerClassProxy b=new RequestHandlerClassProxy();
      String xml = b.getStateData();
      ReadXML rXML=new ReadXML();
     List<StateDTO> list = rXML.readXMLBYUnmarshling(xml);
     request.setAttribute("lst", list);
     request.getRequestDispatcher("A.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

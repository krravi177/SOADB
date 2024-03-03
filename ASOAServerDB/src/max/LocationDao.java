package max;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LocationDao {
	
public List<StateBean> getStateList()
{
   List<StateBean>	l=new ArrayList<StateBean>();
	try {
		Connection con = JDBCConn.getConnn();
PreparedStatement ps = con.prepareStatement("select * from mst_state");
	ResultSet rs = ps.executeQuery();
	 while(rs.next())
	 {
		 StateBean sb = new StateBean();
		 int stCode=rs.getInt(1);
		 sb.setStCode(stCode);
		String stName= rs.getString(2);
		sb.setStName(stName);
		String srtname = rs.getString(3);
		sb.setStShortName(srtname);
		l.add(sb);
	 }
	} catch (Exception e) {
		e.printStackTrace();
	}
	return l;
	
}
	
}

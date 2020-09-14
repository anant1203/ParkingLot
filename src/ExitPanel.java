import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExitPanel {
	
	private String id;
	LoadDriver c;
	
	public ExitPanel(String id) {
		this.id =id;
	}
	
	public boolean scanTicket() {
		if(id != null)
			return true;
		return false;
	}
	
	public boolean processPayment() {
		Connection conn = c.createconnection();
		String query = "Select * from Parking.ParkingTicket where TicketNumber = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, id);
		ResultSet rst = ps.executeQuery();
		rst.getArray()
		
		
		PreparedStatement ps = 
			
	}
	
	

}

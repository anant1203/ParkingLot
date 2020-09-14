import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EntrancePanel {
	
	private String id;
	LoadDriver c;
	
	public EntrancePanel(String id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	
	public void printTicket()throws Exception {
		c = new LoadDriver();
		Connection conn = c.createconnection();
		if(id != null) {
			String query = "Select  * from Parking.ParkingTicket where TicketNumber = ?";
			PreparedStatement ps  = conn.prepareStatement(query);
			ps.setString(1, id);
			ResultSet rst = ps.executeQuery();
			System.out.println("TicketNumber \t\t issuedAt \t\t payedAt \t\t payedAmount \t\t status ");
			while(rst.next()) {
				System.out.print(rst.getString(1));
	            System.out.print("\t\t"+rst.getString(2));
	            System.out.print("\t\t"+rst.getString(3));
	            System.out.print("\t\t"+rst.getString(4));
	            System.out.print("\t\t"+rst.getString(5));
	            System.out.println();
			}
		}
	}
}

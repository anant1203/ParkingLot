
public class ParkingAttendant {
	
	private String ticketNumber;
	private ParkingTicket pt;
	private EntrancePanel ep;
	
	public ParkingAttendant(String ticketNumber) {
		// TODO Auto-generated constructor stub
		this.ticketNumber = ticketNumber;
	}
	
	public void processTicket() throws Exception {
		pt = new  ParkingTicket();
		pt.setTokenNumber(ticketNumber);
		ep = new EntrancePanel(ticketNumber);
		ep.printTicket();
	}
}

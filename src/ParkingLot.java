import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class ParkingLot {
	String name;
	String id;
	Location address;
	String floorName;
	LoadDriver c = new LoadDriver();
	String spot;
	
	ParkingLot(String id, String name, Location address){
		this.address=address;
		this.id=id;
		this.name=name;
	}
	
	public ParkingLot(String id , String floorname) {
		// TODO Auto-generated constructor stub
		this.floorName =floorname;
		this.id = id;
	}
	
	public ParkingLot(String id, String floorname, String spot) {
		// TODO Auto-generated constructor stub
		this.floorName =floorname;
		this.id = id;
		this.spot =spot;
	}
	
	
	
	public void addParkingLot() throws Exception {
	
		Connection conn = c.createconnection();
		String query = "insert into Parking.ParkingLot(name,id,streetAddress,city,state,zipcode,country) values (?,?,?,?,?,?,?)";
		PreparedStatement p = conn.prepareStatement(query);
		p.setString(1, name);
		p.setString(2, id);
		p.setString(3, address.streetAddress);
		p.setString(4, address.city);
		p.setString(5, address.state);
		p.setString(6, address.zipcode);
		p.setString(7, address.country);
		p.execute();
		System.out.println("Record inserted ..........");
		conn.close();
				
	}
	
	public void addParkingFloor()throws Exception {
		Connection conn= c.createconnection();
		System.out.println(conn);
		String query = "insert into Parking.Floor(id,Floorname) values (?,?)";
		PreparedStatement p = conn.prepareStatement(query);
		p.setString(1, id);
		p.setString(2, floorName);
		System.out.println(id+floorName);
		p.execute();
		System.out.println("Floor inserted ..........");
		conn.close();
	}
	
	public void addParkingspot()throws Exception {
		Connection conn= c.createconnection();
		System.out.println(conn);
		String query = "insert into Parking.Spot(id,Floorname,spot) values (?,?,?)";
		PreparedStatement p = conn.prepareStatement(query);
		p.setString(1, id);
		p.setString(2, floorName);
		p.setString(3, spot);
		p.execute();
		System.out.println("Spot inserted ..........");
		conn.close();
	}
	
	public boolean addEnterancePanel() {
		return true;
		
	}
	
	public ParkingTicket getNewParkingTicket() {
		ParkingTicket pt=new ParkingTicket();
		return pt;	
	}
	
	public boolean isFull() {
		return true;
	}
	
	
	

}


public class Admin extends Account{
	
	 private String id;
	 private String name;
	 private Location address;
	 private String floorName;
	 ParkingLot pl;
	 private String spot;
	 
	 public Admin(String id, String name, Location address) {
		 this.id=id;
		 this.name=name;
		 this.address=address;
	 }
	 
	 public Admin(String id, String floorName) {
		 this.id = id;
		 this.floorName = floorName;
	 }
	 
	 public Admin(String id, String floorName, String spot) {
		 this.id = id;
		 this.floorName = floorName;
		 this.spot=spot;
	 }
	 
	 public void addParkingLot() throws Exception {
		 pl = new ParkingLot(id, name, address);
		 pl.addParkingLot();
	  }
	 
	 public void addParkingFloor()throws Exception {
		 pl = new ParkingLot(id,floorName);
		 pl.addParkingFloor(); 
	 }
	 
	 public void addParkingspot()throws Exception {
		 pl = new ParkingLot(id,floorName,spot);
		 pl.addParkingspot(); 
	 }
}

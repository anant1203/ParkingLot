import java.util.Scanner;

class Main{
	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the choice");
		System.out.println("1: Add Parking Lot");
		System.out.println("2: Add Parking Floor");
		System.out.println("3: Add Parking Spot");
		System.out.println("4: Iam Parking Attendant");
		int c = s.nextInt();
		if(c==1) {
			System.out.println("Enter the name");
			String name = s.nextLine();
			System.out.println("Enter the id");
			String id = s.nextLine();
			Location address = new Location();
			System.out.println("Enter the city");
			address.setCity(s.nextLine());
			System.out.println("Enter the country");
			address.setCountry(s.nextLine());
			System.out.println("Enter the state");
			address.setState(s.nextLine());
			System.out.println("Enter the street address");
			address.setStreetAddress(s.nextLine());
			System.out.println("Enter the zipcode");
			address.setZipcode(s.nextLine());
			Admin a = new Admin(name,id,address);
			a.addParkingLot();
		}
		if(c==2) {
			System.out.println("Enter floor name");
			s.nextLine(); 
			String floor = s.nextLine();
			System.out.println("enter parking lot id");
			String id = s.nextLine();
			Admin a = new Admin(id, floor);
			a.addParkingFloor();
		}
		
		if(c==3) {
			System.out.println("Enter floor name");
			s.nextLine(); 
			String floor = s.nextLine();
			System.out.println("enter parking lot id");
			String id = s.nextLine();
			System.out.println("enter parking Spot");
			String spot = s.nextLine();
			Admin a = new Admin(id, floor,spot);
			a.addParkingspot();
		}
		
		if(c==4) {
			System.out.println("Enter the ticker number");
			s.nextLine();
			String ticketNumber = s.nextLine();
			ParkingAttendant pa =new ParkingAttendant(ticketNumber);
			pa.processTicket();
			
		}
		
	}
}

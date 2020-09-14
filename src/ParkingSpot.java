public abstract class ParkingSpot {
	
	String number;
	boolean free;
	final ParkingSpotType type;
	
	public boolean getIsFree();
	
	public ParkingSpot(ParkingSpotType type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}
}

public class HandicappedSpot extends ParkingSpot{
	public HandicappedSpot() {
		// TODO Auto-generated constructor stub
		super(ParkingSpotType.HANDICAPPED);
	}
}

public class CompactSpot extends ParkingSpot{
	public CompactSpot(){
		super(ParkingSpotType.COMPACT);
	}
}

public class LargeSpot extends ParkingSpot{
	public LargeSpot() {
		super(ParkingSpotType.LARGE);
	}
}

public class MotorBike extends ParkingSpot{
	public MotorBike() {
		// TODO Auto-generated constructor stub
		super(ParkingSpotType.MOTORCYCLE);
	}
		
}

public class ElectricSpot extends ParkingSpot {
	  public ElectricSpot() {
	    super(ParkingSpotType.ELECTRIC);
	  }
}
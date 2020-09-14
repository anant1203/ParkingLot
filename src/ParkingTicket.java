import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ParkingTicket {
	
	
	String tokenNumber;
	LocalDateTime issuedAt;
	LocalDateTime payedAt;
	double payedAmount;
	ParkingTicketStatus status;
	
	
	public String getTokenNumber() {
		return tokenNumber;
	}
	public void setTokenNumber(String tokenNumber) {
		this.tokenNumber = tokenNumber;
	}
	public LocalDateTime getIssuedAt() {
		return issuedAt;
	}
	public void setIssuedAt(LocalDateTime issuedAt) {
		this.issuedAt = issuedAt;
	}
	public LocalDateTime getPayedAt() {
		return payedAt;
	}
	public void setPayedAt(LocalDateTime payedAt) {
		this.payedAt = payedAt;
	}
	public double getPayedAmount() {
		return payedAmount;
	}
	public void setPayedAmount(double payedAmount) {
		this.payedAmount = payedAmount;
	}
	public ParkingTicketStatus getStatus() {
		return status;
	}
	public void setStatus(ParkingTicketStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ParkingTicket [tokenNumber=" + tokenNumber + ", issuedAt=" + issuedAt + ", payedAt=" + payedAt
				+ ", payedAmount=" + payedAmount + ", status=" + status + "]";
	}
	
	
	

}

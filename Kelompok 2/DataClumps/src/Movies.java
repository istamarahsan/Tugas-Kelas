import java.util.*;

public class Movies {
	private String movieName;
	private Rental rental;
	public Date getStart() {
		return rental.getStart();
	}
	
	public Date getEnd() {
		return rental.getEnd();
	}
}

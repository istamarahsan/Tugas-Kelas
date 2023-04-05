import java.util.*;

public class Rental {
	private String name;
	private DateRange period;

	public Rental(String name, DateRange period) {
		this.name = name;
		this.period = period;
	}

	public String getLabel() {
		return name;
	}

	public Date getStart() {
		return period.getStart();
	}

	public Date getEnd() {
		return period.getEnd();
	}
}



import java.util.Date;

public class DateRange {
    private final Date start;
    private final Date end;
    
    public DateRange(Date start, Date end) /*throws IllegalArgumentException*/ {
//        if (!end.after(start)) throw new IllegalArgumentException("End must be after Start");
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}

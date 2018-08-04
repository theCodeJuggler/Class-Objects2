//class to implement the date operations separately
import java.time.LocalDate;
import java.time.Period;

public class Date {
	private int d;
	private int m;
	private int y;

	//parameterized constructors
	Date(int d, int m, int y)
	{
		this.d = d;
		this.y = y;
		this.m = m;
	}

	@Override
	public String toString() {
		return "Date is " + d + "/" + m + "/" + y + "";
	}

	// checks instance is greater than the argument variable ie argument date is
	// smaller than instance date or not
	boolean isSmaller(Date date)
	{
		return ((this.y > date.y) ? true
				: (this.y == date.y && this.m > date.m) ? true
						: (this.y == date.y && this.m == date.m && this.d > date.d) ? true : false);
	}

	// finds out the difference in dates and stores absolute values in as d,m,y in diffAr respectively

	int[] differenceDate(Date date)
	{
		int diffAr[] = new int[3];
		LocalDate dateArg = LocalDate.of(date.y, date.m, date.d);
		LocalDate dateIns = LocalDate.of(y, m, d);
		Period diff = Period.between(dateIns, dateArg);
		diffAr[0] = (int) diff.getDays();
		diffAr[1] = (int) (diff.getMonths());
		diffAr[2] = (int) diff.getYears();

		return diffAr;
	}

	public int getD() {
		return d;
	}

	public int getM() {
		return m;
	}

	public int getY() {
		return y;
	}
}

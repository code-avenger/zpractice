package Interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FindDayFromCalendar {
	public static void main(String[] args) throws ParseException {

		String month = "08";
		String day = "05";
		String year = "2015";
		String inputDateStr = String.format("%s/%s/%s", day, month, year);
		Date inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputDateStr);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);
		String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
		System.out.println(dayOfWeek);
		
	}
}

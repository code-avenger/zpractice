package FlightDataProgramme;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FlightSearchCriteria {

	int j = 1;

	public static void main(String args[]) {
		String path = "C:/sudeep/POC/zpractice/src/FlightDataProgramme/";
		String filename1 = "data_one.csv";
		String filename2 = "data_two.csv";
		String filename3 = "data_three.csv";



		FlightSearchCriteria obj = new FlightSearchCriteria();


		List<FlightOrder> list = new ArrayList<>();
		list.addAll(obj.processInputFile(path + filename1));
		list.addAll(obj.processInputFile(path + filename2));
		list.addAll(obj.processInputFile(path + filename3));

		list.forEach(System.out::println);

	}

	private List<FlightOrder> processInputFile(String inputFilePath) {

		List<FlightOrder> inputList = new ArrayList<FlightOrder>();
		try {
			File inputF = new File(inputFilePath);
			InputStream inputFS = new FileInputStream(inputF);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
			// skip the header of the csv
			inputList = br.lines().skip(1).map(mapToItem).collect(Collectors.toList());
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputList;
	}

	private Function<String, FlightOrder> mapToItem = (line) -> {
		String[] p = line.split(Pattern.quote("|"));// a CSV has comma separated lines

		//System.out.println(j++ + "     " + Arrays.toString(p));
		FlightOrder item = new FlightOrder();
		item.setFlightNum(p[0]);
		item.setDepLoc(p[1]);
		item.setArrLocValidTill(p[2]);
		item.setArrLocValidTill(p[3]);
		item.setFlightTime(p[4]);
		item.setFlightDurn(p[5]);
		item.setFare(p[6]);

		return item;
	};
}

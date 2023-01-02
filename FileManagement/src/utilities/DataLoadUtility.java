package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DataLoadUtility {
	public static List<Date> dataload(String filepath) {

		Scanner s;
		List<Date> dates=new ArrayList<Date>();
		 SimpleDateFormat inputtype=new SimpleDateFormat("dd/MM/yyyy");  
		 
		try {
			File file2=new File(filepath);
			s=new Scanner(file2);
			while (s.hasNextLine()) {
				   
				dates.add(inputtype.parse(s.next()));
				
			}
		} catch (Exception e) {
			System.out.println("Caught an exception "+ e);
		}
		return dates;
	}
}

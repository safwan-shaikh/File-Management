package client;

import java.util.Date;
import java.util.List;

import utilities.DBload;
import utilities.CreateFile;
import utilities.DataLoadUtility;

public class CleintApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Date> dates = DataLoadUtility.dataload("./input.txt");

		
		//CreateFile.create(dates, "output");
		DBload.connect();
		
		  }
	}



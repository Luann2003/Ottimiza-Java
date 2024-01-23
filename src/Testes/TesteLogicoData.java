package Testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteLogicoData {

	public static void main(String[] args) {

		String[] inputDates = { "01/05/2018", "01 05 2018", "01052018", "20180501" };
	

		for (String inputDate : inputDates) {
			String formattedDate = ConvertyyyyMM(inputDate);
			System.out.println("Data formatada: " + formattedDate);
		}

	}

	public static String ConvertyyyyMM(String inputDate) {
			
		try {
			 SimpleDateFormat[] dateFormats = {
	                    new SimpleDateFormat("dd/MM/yyyy"),
	                    new SimpleDateFormat("dd MM yyyy"),
	                    new SimpleDateFormat("ddMMyyyy"),
	                    new SimpleDateFormat("yyyyMMdd")
			 };
		for(SimpleDateFormat sdf : dateFormats) {
			try {
				Date date = sdf.parse(inputDate);
				
				SimpleDateFormat sdfOutput = new SimpleDateFormat("yyyy/MM");
                return sdfOutput.format(date);
			} catch (ParseException e) {
			}
			
		}
		
		return null;
		}catch (Exception e) {
			 e.printStackTrace(); 
	         return null;
		}
}
}

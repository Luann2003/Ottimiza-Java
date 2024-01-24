package Testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteLogicoData {

    public static void main(String[] args) {

        String[] inputDates = { "01/05/2018", "01 05 2018", "01052018", "2018 05 01" };

        for (String inputDate : inputDates) {
            String formattedDate = Conversor(inputDate);
            
            System.out.println("Data nao formatada: " + inputDate + " - Data formatada: " + formattedDate);
               
        }
    }

    public static String Conversor(String inputDate) {

        if (inputDate.matches("\\d{4} \\d{2} \\d{2}")) {
            try {
                SimpleDateFormat sdfInput = new SimpleDateFormat("yyyy MM dd");
                Date date = sdfInput.parse(inputDate);

                SimpleDateFormat sdfOut = new SimpleDateFormat("yyyy/MM");
                return sdfOut.format(date);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        }

        try {
            SimpleDateFormat[] dateFormats = {
                    new SimpleDateFormat("dd/MM/yyyy"),
                    new SimpleDateFormat("dd MM yyyy"),
                    new SimpleDateFormat("ddMMyyyy")       
            };

            for (SimpleDateFormat sdf : dateFormats) {
                try {
                    Date date = sdf.parse(inputDate);

                    SimpleDateFormat sdfOutput = new SimpleDateFormat("yyyy/MM");
                    return sdfOutput.format(date);
                } catch (ParseException e) {
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {

    public static Date formatDDMMYYDate(String birthDate) throws ApplicationException {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            return simpleDateFormat.parse(birthDate);
        } catch (Exception e) {
            throw (new ApplicationException("Date in wrong format. expecting DD-mm-YYYY"));
        }
    }

}

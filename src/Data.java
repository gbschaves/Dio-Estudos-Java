import java.time.format.DateTimeFormatter;

public class Data {
    public static boolean isDataValid(String data, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        try {
            formatter.parse(data);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

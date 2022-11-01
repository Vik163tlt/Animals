public class validOrDefult {

    public static String validOrDefult(String value, String defultValue) {
        return value == null || value.isEmpty() || value.isBlank() ? defultValue : value;

    }
}

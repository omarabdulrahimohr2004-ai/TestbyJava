
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    public static boolean validateEmail(String email) {
        if (email == null || email.trim().isEmpty()) return false;

        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        return email.matches(regex);
    }

    public static boolean validateUsername(String username) {
        if (username == null || username.trim().isEmpty()) return false;
        String regex = "^[A-Za-z0-9_]{3,20}$";
        return username.matches(regex);
    }

    public static boolean validatePhoneNumber(String phone) {
        if (phone == null || phone.trim().isEmpty()) return false;

        if (!phone.matches("\\d+")) return false;

        String regex = "^(01[0125]\\d{8}|201[0125]\\d{8})$";
        return phone.matches(regex);
    }

    public static boolean validateNationalId(String nationalId) {
        if (nationalId == null || nationalId.trim().isEmpty()) return false;
        if (!nationalId.matches("\\d{14}")) return false;

        char first = nationalId.charAt(0);
        if (first != '2' && first != '3') return false; // valid centuries only

        int month = Integer.parseInt(nationalId.substring(3, 5));
        int day = Integer.parseInt(nationalId.substring(5, 7));
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > 31) return false;

        int governorate = Integer.parseInt(nationalId.substring(7, 9));
        if (governorate < 1 || governorate > 88) return false;

        return true;
    }
}

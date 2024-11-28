import java.util.regex.Pattern;
public class PhoneNumberValidator {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^(\\d{2})-(0\\d{9})$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        String[] testNumbers = {
                "(84)-(0978489648)",   // hợp lệ
                "(a8)-(22222222)",     // không hợp lệ
                "(84)-(22b22222)",     // không hợp lệ
                "(84)-(9978489648)"    // không hợp lệ
        };
        for(String testNumber : testNumbers) {
            System.out.println(testNumber+" is valid: "+isValidPhoneNumber(testNumber));
        }
    }
}

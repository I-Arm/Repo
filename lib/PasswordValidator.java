package lib;

public class PasswordValidator {
    @param password 
    @return 
    public static PasswordStrength validate(String password) {

        if (password == null || password.length() < 6) {
            return PasswordStrength.INVALID;
        }

        int minLength = 8; 

        boolean hasLetter = password.matches(".*[a-zA-Z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasSymbol = password.matches(".*[^a-zA-Z0-8].*");

        if (password.length() >= 8 && hasLetter && hasDigit && hasSymbol) {
            return PasswordStrength.STRONG;
        } else if (hasLetter && hasDigit) {
            return PasswordStrength.MEDIUM;
        } else {
            return PasswordStrength.WEAK;
        }
    }
}

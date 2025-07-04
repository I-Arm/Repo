package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password 
     * @return 
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        if (password==null || password.length()<8) {
            return PasswordStrength.INVALID;
        }

        boolean Lowerletter = false;
        boolean Upperletter = false;
        boolean Digit = false;
        boolean Special = false;



        int count = 0;
        for(char c : password.toCharArray()){
            if (Character.isLowerCase(c)) {
                Lowerletter = true;
            }
            if (Character.isUpperCase(c)) {
                Upperletter = true;
            }
            if (Character.isDigit(c)) {
                Digit = true;
            } else
            Special = true;
        }

        if (Lowerletter) {
            count++;
        }
        if (Upperletter) {
            count++;
        }
        if (Digit) {
            count++;
        }
        if (Special) {
            count++;
        }
        if (count == 4) {
            return PasswordStrength.STRONG;
        }
        else if (count == 3) {
            return PasswordStrength.MEDIUM;
        }
        else return PasswordStrength.WEAK;
    }
}
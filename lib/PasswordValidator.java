package lib;

public class PasswordValidator {

    /**
     * 
     * @param  : password รหัสผ่านที่ต้องการทดสอบ
     * @return :PasswordStrength INVALID อื่นๆ
     */

    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength
        int minLength = 8;// TODO: มีอะไรขาดหายไปที่บรรทัดนี้?

        int countLower = 0;
        int countUpper = 0;
        int countNum = 0;
        int countSP = 0; // ตัวแปรสำหรับนับจำนวนตัวอักษรพิเศษ

        if (password == null || password.length() < minLength) {
            return PasswordStrength.INVALID; // ถ้ารหัสผ่านเป็น null หรือสั้นกว่า 8 ตัวอักษร ให้คืนค่า INVALID
        }

        

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                countLower++;
            }else
            if (Character.isUpperCase(c)) {
                countUpper++;
            }else
            if (Character.isDigit(c)) {
                countNum++;
            }else {
                countSP++; // นับตัวอักษรพิเศษ
            }
        }

        if (countNum == password.length()|| countLower == password.length() ) {
            return PasswordStrength.WEAK; // ถ้าไม่มีตัวเลขเลย ให้คืนค่า WEAK
            
        }

        if ((countUpper>0) && (countLower > 0)&& (countSP==0)) {
            return PasswordStrength.MEDIUM; // ถ้ามีตัวพิมพ์เล็ก ตัวพิมพ์ใหญ่ และตัวเลข ให้คืนค่า STRONG
            
        }

       return PasswordStrength.STRONG; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}
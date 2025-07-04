package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นกว่า 8 ควรจะ INVALID
        String pw = "1234" ;
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 " +pw+ "  : Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 " +pw+ ": Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านทั้งหมดเป็น 2 อย่างจาก 4 ( ตัวพิมพ์เล็ก + พิมพ์ใหญ่ + ตัวอักษรพิเศษ + เลข) ควรจะ WEAK
        pw = "laosKYfcsp" ;
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 " +pw+ " : There are 2 conditions out of 4 password is WEAK.");
        } else {
            System.out.println("Test Case 2 " +pw+ " : Expected INVALID but got " + result2);
        }

        // Test Case 3: รหัสผ่านททั้งหมด - อย่างจาก 4  ( ตัวพิมพ์เล็ก + พิมพ์ใหญ่ + ตัวอักษรพิเศษ + เลข) ควรจะ MEDIUM
        pw = "KLpr23hjFTi" ;
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 " +pw+ " : There are 3 conditions out of 4 password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 " +pw+ ": Expected INVALID but got " + result3);
        }

        // Test Case 4: รหัสผ่านเป็น ตัวพิมพ์เล็ก + พิมพ์ใหญ่ + ตัวอักษรพิเศษ + เลข ควรจะ STRONG
        pw = "Kaika125@" ;
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 "+pw+" : Contains lowercase,uppercase and spacial characters password is STRONG.");
        } else {
            System.out.println("Test Case 4 " +pw+ " : Expected INVALID but got " + result4);
        }
        
        
        System.out.println("--------------------------------");
    }
}

package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
        // Test Case 2: รหัสผ่านที่มีแค่ตัวอักษรตัวเล็กควรจะ WEAK
        PasswordStrength result2 = PasswordValidator.validate("ishowspeed");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: Only letter password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + result2);
        }
        // Test Case 3: รหัสผ่านที่มีแค่ตัวเลขควรจะ WEAK
        PasswordStrength result3 = PasswordValidator.validate("0647831726");
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 Passed: Only digit password is WEAK.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected INVALID but got " + result3);
        }
        // Test Case 4: รหัสผ่านที่มีตัวเลขและตัวอักษรพิมพ์เล็กควรจะ MEDIUM
        PasswordStrength result4 = PasswordValidator.validate("031047alexqt");
        if (result4 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4 Passed: Small letter and digit is MEDIUM.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected INVALID but got " + result4);
        }
        // Test Case 5: รหัสผ่านที่มีทั้งตัวเลข,ตัวอักษรพิมพ์ใหญ่และเล็ก,ตัวอักษรพิเศษ ควรจะ STRONG
        PasswordStrength result5 = PasswordValidator.validate("Lekkung2004!");
        if (result5 == PasswordStrength.STRONG) {
            System.out.println("Test Case 5 Passed: Big letter , small letter , digit and special letter is STRONG.");
        } else {
            System.out.println("Test Case 5 FAILED: Expected INVALID but got " + result5);
        }


        System.out.println("--------------------------------");
    }
}

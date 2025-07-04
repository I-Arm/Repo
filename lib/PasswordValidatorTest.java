package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 0: ไม่มีรหัสผ่านควรจะ INVALID
        String pw = " ";
        
        PasswordStrength result0 = PasswordValidator.validate(pw);
        if (result0 == PasswordStrength.INVALID) {
            System.out.println("Test Case 0 : "+pw+" : PASSED: Short password is INVALID.");
        } else {
            System.out.println("Test Case 0 : "+pw+" : FAILED: Expected INVALID but got " + result0);
        }

        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        pw = "123";
        
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" : PASSED: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED: Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านเป็นตัวเล็กทั้งหมดควรจะ WEAK
        pw = "abcdefghij";
        
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" : PASSED: All lowercase password is WEAK.");
        } else {
            System.out.println("Test Case 2 : "+pw+" : FAILED: Expected WEAK but got " + result2);
        }

        // Test Case 3: รหัสผ่านเป็นตัวใหญ่ทั้งหมดควรจะ WEAK
        pw = "ABCDEFGHIJ";
        
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 : "+pw+" : PASSED: All uppercase password is WEAK.");
        } else {
            System.out.println("Test Case 3 : "+pw+" : FAILED: Expected WEAK but got " + result3);
        }

        // Test Case 4: รหัสผ่านเป็นตัวเลขทั้งหมดควรจะ WEAK
        pw = "1234567890";
        
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.WEAK) {
            System.out.println("Test Case 4 : "+pw+" : PASSED: All number password is WEAK.");
        } else {
            System.out.println("Test Case 4 : "+pw+" : FAILED: Expected WEAK but got " + result4);
        }

        // Test Case 5: รหัสผ่านไม่มีตัวพิมพ์ใหญ่ควรจะ MEDIUM
        pw = "yahoo2147";
        
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 5 : "+pw+" : PASSED: password must have uppercase is MEDIUM.");
        } else {
            System.out.println("Test Case 5 : "+pw+" : FAILED: Expected MEDIUM but got " + result5);
        }

        // Test Case 6: รหัสผ่านไม่มีตัวอักษรพิเศษควรจะ MEDIUM
        pw = "Yahoo2147";
        
        PasswordStrength result6 = PasswordValidator.validate(pw);
        if (result6 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 6 : "+pw+" : PASSED: password must have special is MEDIUM.");
        } else {
            System.out.println("Test Case 6 : "+pw+" : FAILED: Expected MEDIUM but got " + result6);
        }

        // Test Case 7: รหัสผ่านปลอดภัย STRONG
        pw = "Yahoo@2147";
        
        PasswordStrength result7 = PasswordValidator.validate(pw);
        if (result7 == PasswordStrength.STRONG) {
            System.out.println("Test Case 7 : "+pw+" : PASSED: password is STRONG.");
        } else {
            System.out.println("Test Case 7 : "+pw+" : FAILED: Expected STRONG but got " + result7);
        }

        System.out.println("--------------------------------");
    }
}

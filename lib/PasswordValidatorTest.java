package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1: "+pw+" : Passed : Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED : Expected INVALID but got " + result1);
        }

        // --- เขียน Test Case อื่นๆ ต่อ ---
        // Test Case 2 : รหัสผ่านสั้นควรจะเป็นตัวเล็ก
        pw = "asdfghjk";
        PasswordStrength result2 = PasswordValidator.validate("asdfghjk");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2: "+pw+" :Passed: All lower string password is WEAK.");
        } else {
            System.out.println("Test Case 2: "+pw+" FAILED: Expected Weak but got " + result2);
        }

        // Test Case 3: รหัสผ่านสั้นควรจะมีตัวอักษรตัวใหญ่
        pw = "Asdfghjk";
        PasswordStrength result3 = PasswordValidator.validate("Asdfghjk");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3: "+pw+" : Passed: Password just has 1 upper case is MEDIUM.");
        } else {
            System.out.println("Test Case 3 : "+pw+" : FAILED: Expected MEDIUM but got " + result3);
        }

        // Test Case 4: รหัสผ่านสั้นควรจะ STRONG
        pw = "TToon1388";
        PasswordStrength result4 = PasswordValidator.validate("TToon1388");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4: "+pw+" : Passed: password is STRONG.");
        } else {
            System.out.println("Test Case 4 : "+pw+" :FAILED: Expected STRONG but got " + result4);
        }

        System.out.println("--------------------------------");
    }
}

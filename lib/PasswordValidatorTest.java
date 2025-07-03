package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("1234567");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }

        // --- เขียน Test Case อื่นๆ ต่อ ---
        PasswordStrength result2 = PasswordValidator.validate("12N");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: Short password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected WEAK but got " + result2);
        }
        PasswordStrength result3 = PasswordValidator.validate("DGHDH8544#FGFa");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: Short password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected MEDIUM but got " + result3);
        }
        PasswordStrength result4 = PasswordValidator.validate("AAAAAAAAA44444444444");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: Short password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected STRONG but got " + result4);
        }



        System.out.println("--------------------------------");
    }
}

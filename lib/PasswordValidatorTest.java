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
        // Test Case 2: มีแค่ตัวอักษร ควรจะ WEAK
        PasswordStrength result2 = PasswordValidator.validate("abcdef");
        if (result2 == PasswordStrength.WEAK) {
        System.out.println("Test Case 2 Passed: Letters only is WEAK.");
        } else {
        System.out.println("Test Case 2 FAILED: Expected WEAK but got " + result2);
        }
        // Test Case 3: มีทั้งตัวอักษรและตัวเลข ควรจะ MEDIU
        PasswordStrength result3 = PasswordValidator.validate("abc123");
        if (result3 == PasswordStrength.MEDIUM) {
        System.out.println("Test Case 3 Passed: Letters + digits is MEDIUM.");
        } else {
        System.out.println("Test Case 3 FAILED: Expected MEDIUM but got " + result3);
        }
        // Test Case 4: มีทั้งอักษร ตัวเลข และสัญลักษณ์ ความยาว >= 8 ควรจะ STRONG
        PasswordStrength result4 = PasswordValidator.validate("ab12$%AZ");
        if (result4 == PasswordStrength.STRONG) {
        System.out.println("Test Case 4 Passed: Letters + digits + symbols is STRONG.");
        } else {
        System.out.println("Test Case 4 FAILED: Expected STRONG but got " + result4);
        }

    }
}

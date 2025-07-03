package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String password = "123";
        PasswordStrength result1 = PasswordValidator.validate(password);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+ password +" Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+ password +" FAILED: Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านเป็นตัวเล็กทั้งหมดจะเป็น WEAK
        password = "aaaaaaaa";
        PasswordStrength result2 = PasswordValidator.validate(password);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+ password +" Passed: All lowercase is WEAK.");
        } else {
            System.out.println("Test Case 2 : "+ password +" FAILED: Expected WEAK but got " + result2);
        }

        // Test Case 3: รหัสผ่านเป็นตัวเล็กทั้งหมดจะเป็น WEAK
        password = "AAAAAAAA";
        PasswordStrength result3 = PasswordValidator.validate(password);
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 : "+ password +" Passed: All uppercase is WEAK.");
        } else {
            System.out.println("Test Case 3 : "+ password +" FAILED: Expected WEAK but got " + result3);
        }

        // Test Case 4: รหัสผ่านเป็นตัวเล็กและตัวใหญ่และมีตัวอักษร 8 ตัว จะเป็น MEDIUM
        password = "AAAAaaaa";
        PasswordStrength result4 = PasswordValidator.validate(password);
        if (result4 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4 : "+ password +" Passed: Have uppercase & lowercase is MEDIUM.");
        } else {
            System.out.println("Test Case 4 : "+ password +" FAILED: Expected MEDIUM but got " + result4);
        }

        // Test Case 5: รหัสผ่านเป็นตัวอักษรพิเศษทั้งหมด จะเป็น STRONG
        password = "!@#$%^&*";
        PasswordStrength result5 = PasswordValidator.validate(password);
        if (result5 == PasswordStrength.STRONG) {
            System.out.println("Test Case 5 : "+ password +" Passed: All symbol is STRONG.");
        } else {
            System.out.println("Test Case 5 : "+ password +" FAILED: Expected STRONG but got " + result5);
        }

        System.out.println("--------------------------------");
    }
}

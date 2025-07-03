package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านตัวเลขสั้นควรจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 :"+pw+":Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1:"+pw+": FAILED: Expected INVALID but got " + result1);
        }

         // Test Case 2: รหัสผ่านตัวเลขซ้ำกันควรจะ WEAK
        PasswordStrength result2 = PasswordValidator.validate(pw);
        pw = "11111111";
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2:"+pw+": Passed: Short password is WEAK.");
        } else {
            System.out.println("Test Case 2 :"+pw+":FAILED: Expected WEAK but got " + result2);
        }

         // Test Case 3: รหัสผ่านเป็นตัวอักษรengตัวเล็ก ตัวใหญ่ ควรจะ MEDIUM
        PasswordStrength result3 = PasswordValidator.validate(pw);
        pw = "Jeanangry";
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3:"+pw+": Passed: Short password is MEDIUM.");
        } else {
            System.out.println("Test Case 3:"+pw+": FAILED: Expected MEDIUM but got " + result3);
        }

         // Test Case 4: รหัสผ่านที่่มีตัวอักษรengตัวเล็ก ตัวใหญ่ ตัวเลขด้วยควรจะ STRONG
        PasswordStrength result4 = PasswordValidator.validate(pw);
        pw = "Jean2901";
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 :"+pw+":Passed:  Short password is STRONG.");
        } else {
            System.out.println("Test Case 4 :"+pw+":FAILED: Expected STRONG but got " + result4);
        }

        // Test Case 5: รหัสผ่านเป็นตัวอักษร eng ตัวเล็กทั้งหมดควรจะ WEAK
        PasswordStrength result5 = PasswordValidator.validate(pw);
        pw = "jeanangry";
        if (result5 == PasswordStrength.WEAK) {
            System.out.println("Test Case 5:"+pw+": Passed: Short password is WEAK .");
        } else {
            System.out.println("Test Case 5 :"+pw+":FAILED: Expected WEAK but got " + result5);
        }

        // Test Case 5: รหัสผ่านเป็นตัวอักษร eng ตัวเล็กทั้งหมดควรจะ WEAK
        PasswordStrength result6 = PasswordValidator.validate(pw);
        pw = "jeanangrytttt";
        if (result6 == PasswordStrength.WEAK) {
            System.out.println("Test Case 6:"+pw+": Passed: Short password is WEAK .");
        } else {
            System.out.println("Test Case 6 :"+pw+":FAILED: Expected WEAK but got " + result6);
        }





        // --- เขียน Test Case อื่นๆ ต่อ ---

        System.out.println("--------------------------------");
    }
}

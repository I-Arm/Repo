package lib;

public class PasswordValidatorTest {

    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");

        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123";

        PasswordStrength result1 = PasswordValidator.validate(pw);

        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed:" + pw + " :Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED:" + pw + " Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสสั้นควรจะ Weak
        pw = "12345678";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        

        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed:" + pw + " :Short password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED:" + pw + " Expected WEAK but got " + result2);
        }

        // Test Case 3: รหัสผ่านเป็นอักษรengตัวเล็ก ตัวใหญ่ ควรจะ Medium
         pw = "Aabcdefg";
        PasswordStrength result3 = PasswordValidator.validate(pw);
       

        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed:" + pw + " :Short password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED:" + pw + " Expected MEDIUM but got " + result3);
        }

        // Test Case 4: รหัสผ่านเป็นตัวเลขและอักษรengตัวเล็ก ตัวใหญ่ ควรจะ Strong
        pw = "Pooh2549.";
        PasswordStrength result4 = PasswordValidator.validate(pw);

        

        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed:" + pw + " :Short password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED:" + pw + " Expected STRONG but got " + result4);

        }

        // Test Case 5: รหัสผ่านเป็นตengตัวเล็กหมดควรweak
         pw = "abcdefgh" ;
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.WEAK) {
            System.out.println("Test Case 5 :"+pw+" : Passed : Short password is WEAK.");
        } else {
            System.out.println("Test Case 5 : "+pw+" :FAILED : Expected WEAK but got " + result5);
        }

        System.out.println("--------------------------------");
    }
}

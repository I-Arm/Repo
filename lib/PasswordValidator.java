package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password
     * @return strangth
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        if(password==null || password.length()<8){
            return PasswordStrength.INVALID;
        }
        boolean Number = false;
        boolean UpperCase = false;
        boolean LowerCase = false;
        boolean Special = false;

            for(int i = 0; i < password.length(); i++)
            {

            if(Character.isDigit(password.charAt(i))){
                Number = true;
            } else if(Character.isUpperCase(password.charAt(i))){
                UpperCase = true;
            }else if(Character.isLowerCase(password.charAt(i))){
                LowerCase = true;
            }else
                Special = true;
        }
        if(LowerCase && UpperCase && Number && Special)
            return PasswordStrength.STRONG;
        else if (LowerCase && Number)
            return PasswordStrength.MEDIUM;
        else if (LowerCase && UpperCase && Number)
            return PasswordStrength.MEDIUM;
        else return PasswordStrength.WEAK;
    }
}
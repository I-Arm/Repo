package lib;

public class PasswordValidator {

    /**
     * ตรวจสอบความยากง่ายของรหัสผ่าน
     * @param String. Must be not null and empty.
     * @return  The password has weak, mediumm strong or invalid
     * @throws illegalArgumentException if the password is null or empty.
     */
    
    public static PasswordStrength validate(String password) 
    { // Function Type ให้เป็น PasswordStrength 
        
        if(password == null || password.length() < 8)
        {
            return PasswordStrength.INVALID;
        }

        int upper = 0;
        int lower = 0;
        int digit = 0;
        for(char c : password.toCharArray())
        {
            if(Character.isLowerCase(c))
            {
                lower++;
            }
            if(Character.isUpperCase(c))
            {
                upper++;
            }
            if(Character.isDigit(c))
            {
                digit++;
            }
        }
        if(lower == password.length())
        {
             return PasswordStrength.WEAK;
        }
        if(upper == 1)
        {
            return PasswordStrength.MEDIUM;
        }
        
        if((password.length()> 8)&&(upper > 1)&&(digit >= 1))
        {
            return PasswordStrength.STRONG;
        }
        return null;
    }
}

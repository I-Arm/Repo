package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param รับค่ารหัส
     * @return ส่งค่าว่ารหัสมีความปลอดภัยระดับไหน
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...

        if(password == null || password.length()<8)
            return PasswordStrength.INVALID ;

        boolean hasLower = false ;
        boolean hasUpper = false ;
        boolean hasDegit = false ;
        boolean hasSpacial = false ;
        
        

        for (char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                hasLower = true ;
            }else if(Character.isUpperCase(c)){
                hasUpper = true ;
            }else if(Character.isDigit(c)){
                hasDegit = true ;
            }else{
                hasSpacial = true ;
            }

        }
        
        int count = 0;
        if(hasDegit)count++;
        if(hasLower)count++;
        if(hasUpper)count++;
        if(hasSpacial)count++;

        
        if(count == 4){
            return PasswordStrength.STRONG ;
        }else if(count == 3){
            return PasswordStrength.MEDIUM ;
        }else{
            return PasswordStrength.WEAK ;
        }

       
        
           
    }
}
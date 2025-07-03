package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password string ที่ต้องการตรวจสอบ
     * @return PasswordStrength ที่ต้องการตรวจสอบ
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 

        int minLength = 8;
        int lowercount = 0;
         int uppercount = 0;
        boolean isLower = false, isUpper = false , isSymbol = false;
        if(password==null || password.length()<minLength){
            return PasswordStrength.INVALID;
        }
        
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                lowercount++;
                isLower = true;
            }
            if(Character.isUpperCase(c)){
                uppercount++;
                isUpper = true;
            }
            if(isLower == false && isUpper == false && isSymbol == false){
            return PasswordStrength.STRONG;
            }
            if((uppercount>0 && lowercount>0)&&(uppercount<=4 && lowercount<=4) ){
                isLower = true; isUpper = true;
                return PasswordStrength.MEDIUM;
            }
            if(lowercount==password.length()){
                return PasswordStrength.WEAK;
            }
            if(uppercount==password.length()){
                return PasswordStrength.WEAK;
            }
        }
        return PasswordStrength.STRONG ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}
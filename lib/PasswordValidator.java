package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password string ที่ต้องการตรวจสอบ 
     * @return 
     * @return PasswordsStreng ทำหน้าที่ตรวจสอบระดับความยากง่ายของรหัสผ่าน แบางได้เป็น 4 ระดับ ไม่ผ่าน  ง่าย ปานกลาง แข็งแกร่ง
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
   
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        int countLower = 0;
        int countUpper = 0;
        int countNum = 0;
        int countSP = 0;
        int minLength = 8; 
        if(password==null || password.length() < minLength){
         return PasswordStrength.INVALID;}
        
         for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){countLower++;}
            else if(Character.isUpperCase(c)){countUpper++;}
             else if(Character.isDigit(c)){countNum++;} else{countSP++;}
         }

         if (countNum==password.length()||countLower == password.length()){
            return PasswordStrength.WEAK;
         }

         if((countUpper > 0)&& (countLower >0)&&(countSP == 0)){
            return PasswordStrength.MEDIUM;

         }
         return PasswordStrength.STRONG;
    }
}
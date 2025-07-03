package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password string ที่ต้องการตรวจสอบ
     * @return PasswordStrength INVALID อื่นๆ
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 


        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        char[] charArray = password.toCharArray();
        int upchar=0 , lowchar=0 , number=0 , other=0 , num=0;
        if(password.length()<8)
            return PasswordStrength.INVALID;
        else {
            for(int i=0; i<password.length(); i++) {
                if(charArray[i]>='A'&&charArray[i]<='Z') 
                    upchar++;
                else if(charArray[i]>='a'&&charArray[i]<='z') 
                    lowchar++;
                else if(charArray[i]>='0'&&charArray[i]<='9') 
                    number++;
                else other++;
            }
            if(upchar!=0) num++;
            if(lowchar!=0) num++;
            if(number!=0) num++;
            if(other!=0) num++;
            
            if(num==1||num==2) return PasswordStrength.WEAK;
            if(num==3) return PasswordStrength.MEDIUM;
            if(num==4) return PasswordStrength.STRONG;
        }
        
        int minLength = 8; // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        
        return PasswordStrength.WEAK ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}
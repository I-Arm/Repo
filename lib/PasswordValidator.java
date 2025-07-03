package lib;

import java.util.Scanner;

public class PasswordValidator {

    /**
     * ถ้าพาสเวิร์ดมี 8 ตัวแต่มีแค่ตัวเลขจะถือว่าอ่อนแอ
     * ถ้าพาสเวิร์ดมี 8 ตัวและมีแค่ตัวเลขกับตัวอักษรพิมพ์เล็กจะถือว่าปานกลาง 
     * ถ้าพาสเวิร์ดมี 8 ตัวและมีตัวเลข,ตัวอักษรพิมพ์เล็ก,ตัวอักษรพิมพ์ใหญ่,อักษรพิเศษ จะถือว่าแข็งแกร่ง
     * @param ใส่พาสเวิร์ดและตรวจสอบความแข็งแกร่งของพาสเวิร์ด
     * @return อธิบายความแข็งแกร่งของพาสเวิร์ดและจะแจ้งเตือนเมื่อผิดพลาด
     */
    public static PasswordStrength validate(String password) {  
        
        
        // เช็คว่ารหัสผ่านมีถึง 8 ตัวไหม
        if(password.length()<8){
            return PasswordStrength.INVALID;
        } 
        boolean LowerCase = false;
        boolean UpperCase = false;
        boolean Digit = false;
        boolean SpecialChar = false; // ควรเพิ่มการเช็คอักขระพิเศษด้วย

        // ตรวจสอบคุณสมบัติแต่ละประเภท
            int count = 0;
        for (char c : password.toCharArray()) {
            
            if (Character.isLowerCase(c)) {
                LowerCase = true;
                
            } else if (Character.isUpperCase(c)) {
                UpperCase = true;
                  
            } else if (Character.isDigit(c)) {
                Digit = true;
            
            } else if (!Character.isWhitespace(c) && !Character.isLetterOrDigit(c)) {
                // ตรวจสอบว่าเป็นอักขระพิเศษ (ไม่ใช่อักขระว่างเปล่า และไม่ใช่ตัวอักษร/ตัวเลข)
                SpecialChar = true;

            }
        }
        
        // ตรวจสอบรหัสผ่านแข็ง
        if(LowerCase&&UpperCase&&Digit&&SpecialChar)
            return PasswordStrength.STRONG;
        // ตรวจสอบรหัสผ่านกลาง
        else if (LowerCase&&Digit)
            return PasswordStrength.MEDIUM;
        // ตรวจสอบรหัสผ่านพิมพ์เล็กหรือพิมพ์ใหญ่
        else if (LowerCase || UpperCase)
            return PasswordStrength.WEAK;
        // ตรวจสอบรหัสผ่านนอกเหนือจากนี้
        else 
            return PasswordStrength.WEAK;
    }
}
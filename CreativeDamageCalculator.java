/**
- Project Name: Disaster & Environment Damage Calculator
- License: kvc License
- Author: Sikanas Samanmit
- Student ID / Class: 67219030012 คม.67/1
*
- Permission is hereby granted, free of charge, to any person obtaining a copy
- of this software and associated documentation files.
*/
public class CreativeDamageCalculator {
    /**
     - ฟังก์ชันคำนวณความเสียหายเชิงสร้างสรรค์
     */
    public static double calculateDamage(double inputVal1, double inputVal2) {
        // 1. คำนวณค่าความเสียหายตามสูตรที่นักเรียนออกแบบ
        double rawDamage = (inputVal1 * 0.05) + (inputVal2 * 1.5) ; // เติมสมการคำนวณ (ฝุ่น * 0.05 + จำนวนวัน * 1.5)
        
        // 2. บูรณาการภูมิคุ้มกัน: เช็กขอบเขตข้อมูลเพื่อป้องกันไม่ให้ผลลัพธ์เป็นลบ
        if (rawDamage < 0) {
            return 0.0 ; // คืนค่าความเสียหายเป็น 0
        }
        
        // ป้องกันไม่ให้เกิน 100% (ประสิทธิภาพสูญเสียสูงสุดได้ไม่เกิน 100)
        if (rawDamage > 100.0) {
            return 100.0;
        }
        
        return rawDamage;
    }

    public static void main(String[] args) {
        // กำหนดค่าตัวแปรทดสอบ
        double testInput1 = 50.0 ; // ค่าความเข้มข้นของฝุ่นละออง (ug/m3)
        double testInput2 = 12.0 ; // จำนวนวันที่ไม่ได้ทำความสะอาดแผง (วัน)
        
        // เรียกใช้งานฟังก์ชัน
        double result = calculateDamage(testInput1, testInput2);
        
        // แสดงผลลัพธ์การทำงาน
        System.out.println("==========================================");
        System.out.println("ระบบประมวลผลความเสียหายเชิงสร้างสรรค์");
        System.out.println("หัวข้อ: การสูญเสียประสิทธิภาพโซลาร์เซลล์จากฝุ่น");
        System.out.println("ผลการคำนวณความเสียหายที่เกิดขึ้น: " + result + " %");
        System.out.println("==========================================");
    }
}
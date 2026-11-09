/**
- Project Name: Disaster & Environment Damage Calculator
- License: MIT License
- Author: Sikanas Samanmit
- Student ID / Class: คม.67/1
*
- Permission is hereby granted, free of charge, to any person obtaining a copy
- of this software and associated documentation files.
*/
public class CreativeDamageCalculator {
    /**
     - ฟังก์ชันคำนวณความเสียหายเชิงสร้างสรรค์
     */
    public static double calculateDamage(double inputVal1, double inputVal2) {
        // 1. คำนวณค่าความเสียหายตามสูตรที่นักเรียนออกแบบ (ฝุ่น * 0.05 + จำนวนวัน * 1.5)
        double rawDamage = (inputVal1 * 0.05) + (inputVal2 * 1.5); 
        
        // 2. บูรณาการภูมิคุ้มกัน: เช็กขอบเขตข้อมูลเพื่อป้องกันไม่ให้ผลลัพธ์เป็นลบ
        if (rawDamage < 0) {
            return 0.0; 
        }
        
        // ป้องกันไม่ให้เกิน 100%
        if (rawDamage > 100.0) {
            return 100.0;
        }
        
        return rawDamage;
    }

    public static void main(String[] args) {
        // กำหนดค่าตัวแปรทดสอบ
        double testInput1 = 50.0; // Dust concentration (ug/m3)
        double testInput2 = 12.0; // Days without cleaning (days)
        
        // เรียกใช้งานฟังก์ชัน
        double result = calculateDamage(testInput1, testInput2);
        
        // แสดงผลลัพธ์การทำงาน (ใช้ภาษาอังกฤษเพื่อป้องกันปัญหา Output ไม่รองรับภาษาไทย)
        System.out.println("==========================================");
        System.out.println("Creative Damage Calculation System");
        System.out.println("Topic: Solar Panel Efficiency Loss from Dust");
        System.out.println("Calculated Damage: " + result + " %");
        System.out.println("==========================================");
    }
}
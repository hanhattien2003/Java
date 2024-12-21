/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class ifelse {
    public static void main(String[] args) {
//        System.out.println("Nhap vao tong cua 2 so:");
//            double tong = new Scanner(System.in).nextDouble();
//        System.out.println("Nhap vao hieu cua 2 so:");
//            double hieu = new Scanner(System.in).nextDouble();
//            
//        System.out.println("So x = "+((tong + hieu)/2)); 
//        System.out.println("So y = "+((tong - hieu)/2));

    
//        System.out.println("Nhap vao chieu cao (m):");
//            double chieuCao = new Scanner(System.in).nextDouble();
//        System.out.println("Nhap vao can nang (kg):");
//            double canNang = new Scanner(System.in).nextDouble();
//        double bmi;
//        bmi = canNang/Math.pow(chieuCao, 2);
//        System.out.println("BMI cua ban:"+bmi);
//        if (bmi<15)
//            System.out.println("Than hinh qua gay");
//        else if (bmi>=15 && bmi<16)
//            System.out.println("Than hinh gay");
//        else if (bmi >=16 && bmi<18.5)
//            System.out.println("Than hinh hoi gay");
//        else if (bmi >=18.5 && bmi <25)
//            System.out.println("Than hinh binh thuong");
//        else if (bmi >=25 && bmi<30)
//            System.out.println("Than hinh hoi beo");
//        else if (bmi>=30 && bmi <35)
//            System.out.println("Than hinh beo");
//        else if (bmi>=35)
//            System.out.println("Than hinh qua beo");

//
//        System.out.println("Nhap vao 1 nam duong lich: ");
//            int nam = new Scanner(System.in).nextInt();
//        if (nam%4==0 || nam%100==0 || nam % 400==0)
//                System.out.println("Day la nam nhuan");
//        else
//            System.out.println("Day khong phai nam nhuan");

            System.out.println("Nhap vao 1 thang bat ki:");
                int thang = new Scanner(System.in).nextInt();
        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("Thang "+thang+" co 31 ngay");
               
            }
            case 4, 6, 9, 11 -> {
                System.out.print("Thang "+thang+" co 30 ngay");
               
            }
            case 2 -> {
                System.out.println("Nhap nam:");
                int nam = new Scanner(System.in).nextInt();
                if (nam%4==0 || nam%100==0 || nam % 400==0){
                    System.out.println("Thang 2 co 29 ngay");
                }
                else
                    System.out.println("Thang 2 co 28 ngay");
            }
            default -> {
            }
        }
            
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.Scanner;

public class scaner {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Moi ban nhap so thuc a: ");
//        float a = sc.nextFloat();
//        System.out.println("So thuc a = "+a);
//        
//        System.out.println("Nhap ho va ten cua ban: ");
//        String b = sc.nextLine();
//        System.out.println("Ho ten cua ban la: "+b);



//        System.out.print("Moi ban nhap ho va ten: ");
//        String ten = new Scanner(System.in).nextLine();
//        System.out.println("Ten cua ban la: "+ten);
//        System.out.print("Nhap tuoi:");
//        int tuoi = new Scanner(System.in).nextInt();
//        System.out.println("Tuoi cua ban la: "+tuoi);

//        
//        System.out.println("Nhap ban kinh r =");
//        double r = new Scanner(System.in).nextDouble();
//        double chuVi=2*Math.PI*r;
//        double dienTich=Math.PI*Math.pow(r,2);
//        System.out.println("Chu vi hinh tron la; "+chuVi);
//        System.out.println("Dien tich hinh tron la; "+dienTich);
        
        System.out.println("Nhap chieu dai a:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Nhap chieu rong b:");
        double b = new Scanner(System.in).nextDouble();
        double p = a*b;
        double s=(a+b)*2;
        System.out.println("Chu vi cua hinh chu nhat la:"+s);
        System.out.println("Dien tich cua hinh chu nhat la:"+p);
        
    }
}

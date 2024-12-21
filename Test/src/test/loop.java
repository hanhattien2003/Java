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
public class loop {
    public static void main(String[] args) {
        
//        System.out.println("Nhap x lon hon 10 va nho hon 100:");
//        int x;
//        Scanner sc = new Scanner(System.in);
//        x= sc.nextInt();
//        
//        while (x<10 || x>100  ){
//            System.out.println("Nhap lai x");
//            x = sc.nextInt();
//        }
//        System.out.println("X vua nhap = "+x);

            
//            int n,i,luyThua;
//            luyThua=1;
//            Scanner sc = new Scanner(System.in);                                                                     
//            System.out.println("Nhap vao so nguyen n:");
//              n = sc.nextInt();
//              for (i=1;i<=n;i++){
//                  luyThua = luyThua * i;
//              }
//          System.out.println("Ket qua "+n+"! = "+luyThua);    

//            int n,i,luyThua;
//            luyThua = 1;
//            i = 0;
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Nhap n = ");
//            n = sc.nextInt();
//            while (i<n){
//                i++;
//                luyThua = luyThua * i;
//                if (i == n){
//                    break;
//                }
//            }
//            System.out.println("Ket qua la:"+luyThua);

                
            int i,a,tong;
            tong = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so a:");
            a = sc.nextInt();
            if (a % 2 == 0){
                for(i=0;i<=a;i+=2){
                    tong = tong + i;
                }
            }
            else{
                System.out.println("Khong tinh tong so le!");
            }
            
            System.out.println("Tong = "+tong);
                

    
    }
}

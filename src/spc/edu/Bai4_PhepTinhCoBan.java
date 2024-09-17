/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class Bai4_PhepTinhCoBan {
    public static void main(String[] args){
        System.out.println("Chuong trinh tinh toan co ban");
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");        
        a = sc.nextInt();
        System.out.print("Nhap so b: ");
        b = sc.nextInt();
        System.out.println("a + b = " + TinhTong(a,b));
        System.out.println("a - b = " + TinhHieu(a,b));
        System.out.println("a * b = " + TinhTich(a,b));
        System.out.println("a / b = " + TinhThuong(a,b));
    }
    
    public static int TinhTong(int a, int b){
        return a + b;
    }
    
    public static int TinhHieu(int a, int b){
        return a - b;
    }
    
    public static int TinhTich(int a, int b){
        return a * b;
    }
    
    public static String TinhThuong(int a, int b){
        if(b == 0) return a + " Khong the chia het cho 0";
        else return "" + a / b;
    }
}

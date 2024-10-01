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
public class Bai7_TinhGiaiThua {
    public static void main(String[] args){
        System.out.println("Chuong trinh tinh giai thua cua 1 so nguyen");
        System.out.println("Nhap so nguyen n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for(int i = 1 ; i <= n; i++)
        {
            result *= i;
        }
        System.out.println("Ket qua giai thua cua " + n + " la " + result);
    }
}

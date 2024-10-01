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
public class Bai6_TinhLuyThua {
    public static void main(String[] args)
    {
        System.out.println("Chuong trinh tinh luy thua cua mot so");
        System.out.println("Nhap so nguyen n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Nhap so mu:");
        int m =  sc.nextInt();
        int result = 1;
        for(int i = 1; i <= m; i ++)
        {
            result *= n;
        }
        System.out.println("Ket qua la " + result);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.Year;
/**
 *
 * @author SPC
 */
public class Bai5_TinhTuoi {
    public static void main(String[] args) {
        String fname ;
        int namSinh; 
        int tuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho va ten: ");        
        fname = sc.nextLine();
        System.out.println("Nam sinh: ");
        namSinh = sc.nextInt();
        tuoi = Year.now().getValue() - namSinh;
        System.out.println("Xin chao " + fname + " Tuoi cua ban la " + tuoi);
    }
}

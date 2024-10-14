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
public class Bai9_TinhCanChi {
    public static void main(String[] args){
        System.out.println("Chuong trinh tinh can chi");
        System.out.println("Nhap vao nam");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String result = "";
        String can[] = {"Canh","Tan", "Nham", "Quy","Giap", "At","Binh", "Dinh","Mau" ,"Ky"};
        String chi[] = {"Than", "Dau", "Tuat", "Hoi", "Ty", "Suu", "Dan", "Mao" ,"Thin", "Ty", "Ngo","Mui"};
        if(year >= 0){
            int i = year % 10;
            result += can[i];
            i = year % 12;
            result += " " + chi[i];
            System.out.println(result);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class Bai11_ArrayList {
    public static void main(String[] args){
        System.out.println("Bai 11 khai bao mang array list tu 1 den n");
        System.out.println("Nhap n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ls = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            ls.add(Integer.toString(i));
        }
        ls.add("999");
        ls.set(0, "Luong Dinh Hoang");
        int x = ls.indexOf("Luong Dinh Hoang");
        ls.remove(x);
        for(String j : ls){
            System.out.println(j);
        }
    }
}

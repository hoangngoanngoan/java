/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author SPC
 */
public class De1_LuongDinhHoang {
    public static void main(String[] args){
        int op = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        do{
            System.out.println("----------MENU---------");
            System.out.println("Nhap vao n vao ban phim");
            System.out.println("Go 0 de dung");
            System.out.println("-----------------------");
            op = sc.nextInt();
            sc.nextLine();
//            switch(op){
//                case "0":
//                    arr.add(0);
//                    break;
//                case "1":
//                    arr.add(1);
//                    break;
//                case "2":
//                    arr.add(2);
//                    break;
//                case "3":
//                    arr.add(3);
//                    break;
//                case "4":
//                    arr.add(3);
//                    break;
//                case "5":
//                    arr.add(3);
//                    break;
//                case "6":
//                    arr.add(3);
//                    break;
//                case "7":
//                    arr.add(3);
//                    break;
//                case "8":
//                    arr.add(3);
//                    break;
//                case "9":
//                    arr.add(3);
//                    break;
//                case "stop":
//                    System.out.println("Done");
//                    break;
//                default:
//                    System.out.println("Vui long nhap so tu 0 den 9");
//                    break;
//          }
            if(op == 0){
                System.out.println("Done");
                break;
            }else {
                arr.add(op);
            }
        }while(true);
        
        int max = arr.get(0);
        int min = arr.get(0);
        int sum = 0;
        
        for(int i = 0; i < arr.size(); i++)
        {
            if(max < arr.get(i))
            {
                max = arr.get(i);
            }  
        }
        
        for(int i = 0; i < arr.size(); i++)
        {
            if(min < arr.get(i))
            {
                min = arr.get(i);
            }  
        }
        
        for(int i = 0; i < arr.size(); i++)
        {
            sum += arr.get(i);  
        }
        
        System.out.println("So lon nhat : " + max);
        System.out.println("So nho nhat : " + min);
        System.out.println("Tong cac so da nhap : " + sum);
        System.out.println("Trung binh day so da nhap : " + sum / arr.size());
    
        
    }
    
}

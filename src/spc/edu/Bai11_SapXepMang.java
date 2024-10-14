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
public class Bai11_SapXepMang {
    public static void main(String[] args){
        System.out.println("Bai tap nhap hai mang ho ten va diem xuat hai mang giam theo diem");
        Scanner sc = new Scanner(System.in);
        String[] lsName = new String[3];
        float[] lsMark = new float[3];
        for(int i = 0 ; i < 3 ; i ++){
            System.out.println("Nhap ho va ten");
            String fullName = sc.nextLine();
            System.out.println("Nhap diem");
            float mark = sc.nextFloat();
            lsName[i] = fullName;
            lsMark[i] = mark;
            sc.nextLine();
        }

//        String[] lsName = {"Hoang", "Huy", "Ngoc"};
//        float[] lsMark = {5,6,3};
        float max = lsMark[0];
        String maxName = lsName[0];
        for(int i = 0; i < 3; i ++){
            for(int j = i + 1; j < 3; j++){
                if(max < lsMark[j]){
                    max = lsMark[j];
                    lsMark[j] = lsMark[i];
                    lsMark[i] = max;
                    
                    maxName = lsName[j];
                    lsName[j] = lsName[i];
                    lsName[i] = maxName;
                }
            }
        }
        
        for(int i = 0; i < 3 ; i++){
            System.out.println(lsName[i] + " " + lsMark[i]);
        }
    }
}

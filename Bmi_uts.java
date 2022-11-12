/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package uts.bmi_uts;

import java.util.Scanner;


public class Bmi_uts {

    
    public static void main(String[] args) {
        int berat;
        double tinggi;
        double bmi;
        
       Scanner in = new Scanner(System.in);
            System.out.println("Berapakah tinggi badanmu (cm)?");
                tinggi=in.nextInt();
            System.out.println("Berapakah berat badanmu  ?");
                berat=in.nextInt();
                 tinggi/=100; 
        bmi=berat / (tinggi*tinggi);
            System.out.println("Bmi mu:" + bmi);
        
        if(bmi<16){
            System.out.println("anda kurus");
        }
        else if (bmi<30){
            System.out.println("anda normal");
        }
        else if (bmi>30){
            System.out.println("anda gemuk");
        }
       
    }
    
}
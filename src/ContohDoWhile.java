/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class ContohDoWhile {
    public static void main(String[] args){
        String jawab;
        Scanner scanner=new Scanner (System.in);
        int nom1, nom2;
        
        do{
            System.out.print("Nombor pertama: ");
            nom1=scanner.nextInt();
            System.out.print("Nombor kedua: ");
            nom2=scanner.nextInt();
            System.out.println("Hasil darab: " + nom1 + " X "+ nom2 +"=" + Math.abs (nom2 * nom1));
            System.out.println("Taipkan Y untuk teruskan..");
            jawab=scanner.next();
            
        }while (jawab.equals("Y"));
    }
    
}

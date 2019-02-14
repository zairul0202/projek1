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
public class ContohWhile {
    public static void main(String[] args){
        int nom1 = ( int )(Math.random()*101);
        int nom2 = ( int )(Math.random()*101);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nyatakan Jawapan " + nom1 + "+" + nom2 + "= ");
        int jawapan = input.nextInt();
        
        while (nom1 + nom2 != jawapan){
            System.out.print("Jawapan anda salah! Sila cuba lagi...\n Nyatakan Jawapan "+ nom1 +"+"+ nom2 +"= ");
            jawapan = input.nextInt();
        }
        
        System.out.println("Tahniah, jawapan anda betul!");
    }
}

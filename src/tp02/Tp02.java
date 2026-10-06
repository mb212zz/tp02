/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02;

/**
 *
 * @author mbenjelloun
 */
import java.util.Scanner;
public class Tp02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*QUESTION 7 
        Scanner sc = new Scanner(System.in);
        double s = 0;       
        double m = 0;       
        int i = 1;
        int rep = 1;
        while (i > 0) { 
            System.out.print("Saisir note " + rep + " :");           
            m = sc.nextDouble();
            if (m < 0) {
                break;
            }
            rep++;
            s = s + m;
        }                        
        System.out.println("Somme = " + s);
        System.out.print("Moyenne = " + s / (rep - 1));
    }*/
        
        
        Scanner sc = new Scanner(System.in);
        byte rep;
        rep = 0;
        int n = (int)(Math.random() * 101);
        int a = 0;
        while (a != n){
            System.out.print("Saisissez un nombre : ");
            a = sc.nextInt();
            rep = (byte) (rep + 1);
            if (a < n){
                System.out.println("Trop petit ! Tu as " + rep + " tentatives.");
            }
            if (a > n){
                System.out.println("Trop grand ! Tu as " + rep + " tentatives.");
            }
            if (a == n){
                System.out.println("Bien joué ! Tu as " + rep + " tentatives.");
            }
            if (rep > 10){               
                System.out.println("T'es tarpin nul ! C'était " + n);
                break;
            }
            if (rep >= 6 && rep <= 9){               
                System.out.println("C'est pas mal.");
                break;
            }
            if (rep >= 2 && rep <= 5 && a == n){               
                System.out.println("Félicitation !");
                break;
            } 
            if (rep == 10 && a == n){                
                System.out.println("C'était juste.");
                break;
            }
            if (rep == 1 && a == n){              
                System.out.println("Tricheur !"); 
                break;
            }
        }
    }
}

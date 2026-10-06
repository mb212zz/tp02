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
    }
    
}

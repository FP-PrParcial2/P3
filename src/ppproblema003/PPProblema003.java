/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema003;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       long factorial=1;
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = numero.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
}
    }
    


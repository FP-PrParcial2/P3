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
       
        Scanner entrada= new Scanner(System.in);
       System.out.println("Introduce un número");
       int n;
       int factorial = 1;
        n = entrada.nextInt();
       while ( n!=0) {
             factorial*=n;
             n--;
             System.out.println("El factorial de:" + n + "es" + factorial);
}
    }
    
}

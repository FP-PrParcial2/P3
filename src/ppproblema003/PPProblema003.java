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
       int n;
       double factorial = 1;
        Scanner entrada= new Scanner(System.in);
       System.out.println("Introduce un número");
        n = entrada.nextInt();
       while ( n!=0) {
             factorial=factorial*n;
             n--;
             System.out.println(factorial);
}
    }
    
}

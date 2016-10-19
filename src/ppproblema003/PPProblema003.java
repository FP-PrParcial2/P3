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
       
        for (int i = 0; i <= 10; i++){
            System.out.printf("%d! = %d\n", i,
            factorial(i));
        }
    }
    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
}
    }
    


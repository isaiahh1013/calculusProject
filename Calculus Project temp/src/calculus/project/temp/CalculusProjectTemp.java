/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculus.project.temp;

import Derivative.Derivative;
import java.util.Scanner;

/**
 *
 * @author Benja_thomp486
 */
public class CalculusProjectTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean ans1 = false;
        boolean ans2 = false;
        Scanner sc = new Scanner(System.in);
        String[] trigFunc = {"sin","cos","tan","sec","csc","cot"};
        
        System.out.println("a. Trig Functions");
        System.out.println("b. Power Functions");
        System.out.println("c. Exponential Functions");
        System.out.println("d. Logarithms Functions");
        System.out.println("e. 1 step Chain Rule");
        System.out.println("\nEnter the letter of the type of tunction you want to take the derivative of: ");
        while (!ans1) {
            String choice = sc.next();

            switch (choice) {
                case "a":
                    ans1 = true;
                    System.out.println("What trig function do you want to take the derivative of (Don't include the variable): ");
                    String trigfun = sc.next();
                    for(int i = 0; i<6 ; i++){
                        trigFunc[i]
                    }
                        
                    }
                    break;
                case "b":
                    ans1 = true;
                    //do power rules
                    break;
                case "c":
                    ans1 = true;
                    //do exponential rules
                    break;
                case "d":
                    ans1 = true;
                    //do log rules
                    break;
                case "e":
                    ans1 = true;
                    //do chain rule
                    break;
                default:
                    System.out.println("Not a valid option!");
            }
        }

    }

}

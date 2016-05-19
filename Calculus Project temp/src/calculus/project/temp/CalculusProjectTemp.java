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
    public boolean checkFor(String[] arr, String str){
        for(String key : arr){
            if(key.equalsIgnoreCase(str)){
                return true;
            }
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean ans1 = false;
        boolean ans2 = false;
        String var;
        String out = "";
        String func;
        String[] trigFunc = {"sin","cos","tan","csc","sec","cot"};
        String[] funcTypes = {"trig","pow","exp","log"};
        Derivative der = new Derivative();
        Scanner sc = new Scanner(System.in);
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
                    func = sc.next();
                    for(int i = 0; i<6 ; i++){
                        
                    }
                    break;
                case "b":
                    ans1 = true;
                    int pow;
                    int coeff;
                    System.out.println("Enter the coefficient:");
                    coeff = sc.nextInt();                    
                    System.out.println("Now enter the power:");
                    pow = sc.nextInt();
                    System.out.println("What variable are you using?");
                    var = sc.next();
                    out = der.powerRule(coeff,var,pow);
                    System.out.println("The derivative of " + coeff + var + "^" + pow + "is:");
                    break;
                case "c":
                    ans1 = true;
                    //do exponential rules
                    break;
                case "d":
                    ans1 = true;
                    
                    System.out.println("Imput the base of the log"
                                + "\nremember that ln is log_e");
                    String base = sc.next();   
                    System.out.println("Input the name of the variable you are using");
                    var = sc.next();
                    out = der.logRule(base, var);
                    System.out.println("The derivative of log_" + base + "(" + var + ") is:");
                    break;
                case "e":
                    ans1 = true;
                    System.out.println("What variable are you using: ");
                    var = sc.next();
                    System.out.println("What type of function is f: ");
                    while(!ans2){
                        String typeF = sc.next();
                    }
                    break;
                default:
                    System.out.println("Not a valid option!");
            }
        }
        System.out.println(out);
    }

}

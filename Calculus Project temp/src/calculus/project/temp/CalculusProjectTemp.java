/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculus.project.temp;
import Derivative.Derivative;
/**
 *
 * @author Benja_thomp486
 */
public class CalculusProjectTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Derivative der = new Derivative();
        String var = "x";
        String out;
        out = der.powerRule(2, var, 3);
        System.out.println(out);
    }
    
}

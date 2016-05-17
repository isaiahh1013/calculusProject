
package Derivative;
import java.util.*;
/**
 *
 * @author Benja_thomp486
 */
public class Derivative {
    
    public Derivative(){
        
    }
    public void takeDerivative(){
        
    }
    public String powerRule(int a, String var, int b){
        String c;
        if(a > 0 && b > 1){
            a *= b;
            b -= 1;
        }
        else if(b-1 <0){
            
        }

        c = Integer.toString(a) + var + "^" + Integer.toString(b);
        return c;
    }
    public String trigRule(String a, String var){
        String b;
        switch(a){
            case "sin":
                b = "cos(" + var + ")";
                break;
            case "cos":
                b = "-sin("+ var + ")";
                break;
            case "tan":
                b = "sec^2("+ var + ")";
                break;
            case "sec":
                b="sec("+ var + ")" + "tan(" + var + ")";
                break;
            case "csc":
                b="csc("+ var + ")" + "cot(" + var + ")";
                break;
            case "cot":
                b = "csc^2("+ var + ")";
                break;
            default:
                b = "Check your spelling. Only basic trig functions"
                        + "/nare supported at this time";
        }
        return b;
    }
    public void productRule(){
        
    }
    public void quotientRule(){
        
    }
    public void chainRule(){
        
    }
}

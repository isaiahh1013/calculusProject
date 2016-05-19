
package Derivative;
import java.util.*;
/**
 *
 * @author Benja_thomp486
 */
public class Derivative {
    
    public Derivative(){
        
    }
    /*
    public int A;
    public int B;
    public void readPower(String func,String var){
        char[] tempA = {};
        char[] tempB = {};
        char[] function;
        char charVar = var.charAt(0);
        function = func.toCharArray();
        for(int i=0; i < function.length; i++){
            if(function[0] == charVar){
                A=0;
            }
            else if(function[i+1] == charVar){
                System.arraycopy(function, 0, tempA, 0, i);
                A = Integer.valueOf(String.valueOf(tempA));
            }
            else if(function[i-1] == '^'){
                System.arraycopy(function, i, tempB, 0, function.length);
                B = Integer.valueOf(String.valueOf(tempB));
            }
            else{
                System.out.println("There's something wrong with that power statement"
                        + "\nThere's probably a space that shouldn't be there");
            }
        }
    }*/
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
                b = "If this is in your equation, you misspelled a trig function";
        }
        return b;
    }
    public String logRule(String logBase, String var){
        String out;
        if(logBase == "e"){
            out = "1/(" + var + ")";
        }
        else{
            out = "ln("+ logBase + ")/" + "(" + var + ")";
        }
        return out;
    }
    public String exponentRule(String var, String exp){
        String out = "";
        if(exp == "e"){
            out = exp + "^" + var;
        }
        else{
            out = exp + "^" + var + "*ln(" + exp + ")";
        }
        return out;
    }
    /**Derivative taken in the form of f(g(x))= f'(g(x))g'(x)
     * 
     * @param typeF
     * @param typeG
     * @param var
     * @return 
     */
    /*
    public String chainRule(String typeF, String f, String typeG, String g, String var){
        String fPrimeG = "";
        String gPrime = "";
        switch(typeG){
            case "trig":
                gPrime = trigRule(g,var);
                break;
            case "power":
                readPower(f,var);
                gPrime = powerRule(A,g,B);
                break;
            case "exp":
                System.out.println("");
                break;
            case "log":
                
                break;
            default:
                gPrime = "ERROR function not recognized";
        }
        switch(typeF){
            case "trig":
                fPrimeG = trigRule(f,g);
                break;
            case "power":
                
                break;
            case "exp":
                
                break;
            case "log":
                
                break;
            default:
                fPrimeG = "ERROR";
        }
        return fPrimeG + gPrime;
    }*/
}

package org.abrahamtech.session01B;

import org.abrahamtech.session01B.exception.InvalidSequenceException;

//import java.util.Stack;

public class BalancedParentheses {

    //Ejemplos:

    /* Balanceados
     * ()
     * ()()
     * ((()))
     * (()(()))()
     */

     /* No Balanceados
      * )(
      * (()
      */
    
    public static boolean isBalanced(String sequence) throws InvalidSequenceException {
        //Stack<Character> parentheses = new Stack<>();
        int counter = 0;

        for(int i = 0; i < sequence.length(); i++) {
            
            char current = sequence.charAt(i);

            if(current != '(' && current != ')') {
                throw new InvalidSequenceException();
            }

            if(current == '(') {
                //parentheses.push(current);
                counter++;
            }else if (current == ')') {
                //parentheses.pop();
                counter--;

                if(counter<0) {
                    return false;
                }
            }
        }

        //return parentheses.isEmpty();
        return counter == 0;
    }
}
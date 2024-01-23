package org.abrahamtech.session06;

import java.util.Stack;

public class BalancedParenthesis {
    public static  boolean isBalanced(String sequence) {

        //Una secuencia vacia es valida
        if(sequence.isEmpty()) {
            return true;
        }

        Stack<Character> parenthesis = new Stack<>();

        //Una secuencia con al menos un caracter que no es un parentesis es invalida
        for(int i = 0; i < sequence.length(); i++) {
            char current = sequence.charAt(i);

            if((current != ')') && (current != '(')) {
                return false;
            }


            if(current == '(') {
                parenthesis.push(current);
            } else if(parenthesis.isEmpty()) {
                return false;
            } else {
                //Va eliminando los '(' que se han ido guardando 
                //El ultimo que se ha guardado es el primero que elimina
                parenthesis.pop();
            }
        }

        return parenthesis.isEmpty();

        /*if(sequence.equals(")(")) {
            return false;
        }
 
        //Una secuencia de longitud par es válida
        if(sequence.length() % 2 == 0) {
            return true;
        }

        return false;*/
    }
}
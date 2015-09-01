/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackStructure;

import com.Structure.Data.Interfaces.Stack;
import com.Structure.Data.Impl.StackImp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jovani
 */
public class Bracket {

    private String text;
    private final Stack<Character> theStack;

    public Bracket() {
        theStack = new StackImp();
    }

    public void validateSpression() {
        try {
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            text = getString();
        } catch (IOException ex) {
            Logger.getLogger(Bracket.class.getName()).log(Level.SEVERE, null, ex);
        }
        check(text.length()-1);
    }

    public String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        br.close();
        return s;
    }

    public void check(int posicion) {
        if (posicion >=0 ) {
            check(posicion - 1);
        } else {
            return;
        }
        char charRead = text.charAt(posicion);

        switch (charRead) {
            case '{':
            case '[':
            case '(':
                theStack.push(charRead);
                break;
            case '}':
            case ']':
            case ')':

                if (!theStack.isEmpty()) {
                    char charStack = theStack.pop();
                    if ((charRead == '}' && charStack != '{') || (charRead == ']' && charStack != '[') || (charRead == ')' && charStack != '(')) {
                        System.out.println("Error at " + charRead);
                    }
                } else {
                    System.out.println("Eror at " + charRead);
                }
                break;
            default:
                break;
        }
    }
}

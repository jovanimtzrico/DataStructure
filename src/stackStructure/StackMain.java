/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackStructure;

import com.Structure.Data.Impl.Prueba;
import com.Structure.Data.Interfaces.Stack;


/**
 *
 * @author Jovani
 */
public class StackMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//        Stack<Integer> theStack = new StackImp();
//        System.out.println("Push");
//        theStack.push(23);
//        theStack.push(12);
//        theStack.display();
//        System.out.println("Call peek method");
//        theStack.peek();
//        System.out.println("Call pop Method");
//        theStack.pop();
//        theStack.pop();
//        theStack.pop();
//        theStack.display();
//       
        //Bracket theChecker = new Bracket();
        //theChecker.validateSpression();
        
        
      String input = "3*(4+5)";
      String output;
      InToPost theTrans = new InToPost(input);
      output = theTrans.doTrans(); 
      System.out.println("Infix is " + input);
      System.out.println("Postfix is " + output + '\n');

    }
}

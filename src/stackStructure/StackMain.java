/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackStructure;

/**
 *
 * @author Jovani
 */
public class StackMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack<Integer> theStack = new StackImp();
        System.out.println("Push");
        theStack.push(23);
        theStack.push(12);
        theStack.display();
        System.out.println("Call peek method");
        theStack.peek();
        System.out.println("Call pop Method");
        theStack.pop();
        theStack.pop();
        theStack.pop();
        theStack.display();
       
        //Bracket theChecker = new Bracket();
        //theChecker.validateSpression();
    }
}

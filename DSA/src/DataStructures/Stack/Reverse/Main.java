package DataStructures.Stack.Reverse;

import java.util.ArrayList;

public class Main {

    // WRITE THE REVERSESTRING METHOD HERE //
    //                                     //
    //                                     //
    //                                     //
    //                                     //
    /////////////////////////////////////////
    public static String revString(String str){
        String rev = "";
        for(int i = str.length()-1 ; i>=0;i--){
            rev+=str.charAt(i);
        }
        
        return rev.toString();
        
    }
    
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        String reversedString = "";
        for(int i =0; i< str.length();i++){
            stack.push(str.charAt(i));
        }
        
        for(int i =0; i< str.length();i++){
            reversedString+=stack.pop();
        }
        
        return reversedString;
        
    }
    
    public static boolean isBalancedParentheses(String tstString){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<tstString.length();i++){
            if((tstString.charAt(i)==')')&&(stack.isEmpty())){
                return false;
            }
            if(tstString.charAt(i)=='('){
                stack.push('(');
            }else{
                stack.pop();
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }



    public static void sortStack(Stack<Integer> stack){
        Stack<Integer> tempStack =  new Stack<>();
        
        while(!(stack.isEmpty())){
             int temp = stack.pop();
             while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                 stack.push(tempStack.pop());
             }
  
             tempStack.push(temp);
        }
        while(!tempStack.isEmpty()) {
        	stack.push(tempStack.pop());
        }
        
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
 
        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3
            
            After sorting:
            1
            2
            3
            4
            5

        */
        
    }
    
    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);
        
        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);
        
        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }
        
        // Print a separator for better readability
        System.out.println("--------------");
    }



}


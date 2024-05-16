import java.io.PrintStream;
import java.util.*;
public class QuestionTree {
    
    public QuestionTree(){ 
        
    } 

    public void read(Scanner input){ 

    } 

    public void write(PrintStream output){ 

    } 

    public void askQuestions(){ 

    } 
    // post: asks the user a question, forcing an answer of "y " or "n";
    // returns true if the answer was yes, returns false otherwise
    public boolean yesTo(String prompt){ 
        System.out.print(prompt + " (y/n)? ");
        String response = console.nextLine().trim().toLowerCase();
        while (!response.equals("y") && !response.equals("n")) {
            System.out.println("Please answer y or n.");
            System.out.print(prompt + " (y/n)? ");
            response = console.nextLine().trim().toLowerCase();
        }
        return response.equals("y");
    }
}

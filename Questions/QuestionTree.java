import java.io.PrintStream;
import java.util.*;
public class QuestionTree{ 
    QuestionNode root;
    //Will initialize the question tree with only one question and the only solution being computer
    public QuestionTree(){ 
        root = new QuestionNode();
    } 
    //Will read a text file and make a new tree for the game
    public void read(Scanner input){ 
        while(input.hasNextLine()){ 
            String now = input.nextLine(); 
            if(input.hasNextLine()){
                String next = input.nextLine().trim(); 
                root = new QuestionNode(now, readHelper(now, next), readHelper(now, next), null);
            }
        }
    } 
    //Method to help build the trees in the read method
    public QuestionNode readHelper(String now, String next){ 
        if(now.equals("Q:")){ 
            QuestionNode x = new QuestionNode(next, readHelper(now, next), readHelper(now.nextLine().nextLine(), next.nextLine().nextLine()), now);
        } 
        else if(now.equals("A:")){ 
            QuestionNode y = new QuestionNode(next, null, null, now);
        }
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

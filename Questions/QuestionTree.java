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
                now = input.nextLine(); 
                root = new QuestionNode(now,null,null,null); //Will create the root node
                root.yes = readHelper(now, input, root); //Will build up the left/yes node
                root.no = readHelper(now, input, root); //Will build up the right/no node
            }
        }
    } 
    //Method to help build the trees in the read method
    public QuestionNode readHelper(String now, Scanner input, QuestionNode parent){  
        QuestionNode leaf = null; 
        String next = input.nextLine().trim(); 
        if(next.equals("Q:")){ //If it is a question build the yes and no nodes
            next = input.nextLine().trim(); 
            leaf = new QuestionNode(next,null,null, parent); //Builds the node as if it is an answer
            leaf.yes=readHelper(input.nextLine().trim(), input, leaf); 
            leaf.no=readHelper(input.nextLine().trim(), input, leaf); 
        }   
        else if(now.equals("A:")){  
            leaf = new QuestionNode(next,null,null, parent);
        } 
        else if(next.equals("A:")){  
            next = input.nextLine().trim(); 
            leaf = new QuestionNode(next,null,null, parent);
        } 
        return leaf; 
    }

    public void write(PrintStream output){ 
        
    } 

    public void askQuestions(){ 

    } 
    // post: asks the user a question, forcing an answer of "y " or "n";
    // returns true if the answer was yes, returns false otherwise
    public boolean yesTo(String prompt){ 
        System.out.print(prompt + " (y/n)? ");
        Scanner console = new Scanner(System.in);
        String response = console.nextLine().trim().toLowerCase();
        while (!response.equals("y") && !response.equals("n")) {
            System.out.println("Please answer y or n.");
            System.out.print(prompt + " (y/n)? ");
            response = console.nextLine().trim().toLowerCase();
        }
        return response.equals("y");
    }
}

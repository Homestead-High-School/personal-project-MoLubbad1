// The QuestionNode class is used to store the information for one
// question or object in the game.
public class QuestionNode {
    public final String qOrO; // A question or a object
    public QuestionNode yes; // a node if the answer to the question was yes
    public QuestionNode no; // a node if the answer to the question was no
    public QuestionNode parent; //A node to be able to build up the tree and go back to build the no node

    // constructs a node with only the question: is it a computer?
    public QuestionNode() {
        this("Is your object a computer? ", new QuestionNode("computer", null, null,null), new QuestionNode(null, null, null, null), new QuestionNode(null, null, null, null));
    }

    // constructs a node if everything is given
    public QuestionNode(String qOrO, QuestionNode yes, QuestionNode no, QuestionNode parent) {
        this.qOrO = qOrO;
        this.yes = yes;
        this.no = no; 
        this.parent = parent;
    } 
}

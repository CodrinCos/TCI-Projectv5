package WebCrawler.WebCrawler;

import java.util.*;

/**
 * This class represents the data structure used in order to store every link
 * in the website.
 */
public class Tree {
    public List<Node> listNodes;
    private Node root;

    /**
     * First type of constructor with no parameters
     */
    public Tree(){
        listNodes = new ArrayList<Node>();
    }

    /**
     * Second type of constructor with a Node as parameter for storing the root
     * @param rt
     */
    public Tree(Node rt){
        listNodes = new ArrayList<Node>();
        root=rt;
        listNodes.add(rt);
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public boolean add(Node node) {
        listNodes.add(node);
        return true;
    }

    /**
     * This class will search if a node is in the tree
     * @param node
     * @return
     */
   public boolean searchNode(Node node){
        int i;
        for (i=0;i<listNodes.size();i++)
            if (listNodes.contains(node)) return true;
        return false;
   }


}


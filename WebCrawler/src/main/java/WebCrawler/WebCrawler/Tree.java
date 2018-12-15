package WebCrawler.WebCrawler;

import java.util.*;

public class Tree {
    public List<Node> listNodes= new ArrayList<Node>();
    public Node parent = new Node();

    public boolean add(Node node) {
        listNodes.add(node);
        return true;
    }

   public boolean searchNode(Node node){
        int i;
        for (i=0;i<listNodes.size();i++)
            if (listNodes.contains(node)) return true;
        return false;
   }

}


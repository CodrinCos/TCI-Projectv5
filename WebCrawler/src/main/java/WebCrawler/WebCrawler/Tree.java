package WebCrawler.WebCrawler;

import java.util.*;

public class Tree {
    public List<Node> listNodes= new ArrayList<Node>();
    public Node parent = new Node();

    public boolean add(Node node) {
        listNodes.add(node);
        return true;
    }

}


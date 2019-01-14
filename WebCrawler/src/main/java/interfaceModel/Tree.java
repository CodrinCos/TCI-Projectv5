package interfaceModel;

import  Tree.Node;

public interface Tree {
     void setRoot(Node root);
     Node getRoot();
     boolean add(Node node);
     boolean searchNode(Node node);
}

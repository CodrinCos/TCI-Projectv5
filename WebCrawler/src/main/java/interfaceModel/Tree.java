package interfaceModel;

import WebCrawler.WebCrawler.Node;

import java.util.ArrayList;

public interface Tree {
     void setRoot(Node root);
     Node getRoot();
     boolean add(Node node);
     boolean searchNode(Node node);
}

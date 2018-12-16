import WebCrawler.WebCrawler.Node;
import WebCrawler.WebCrawler.Tree;
import interfaceModel.WebCrawler;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TreeTest {

    Node node = mock(Node.class);

    @Test
    public void checkInstanceOf(){
        assertTrue(node instanceof Node);
    }
    //test with inputs and outputs
    @Test
    public void setRootInTreeTest(){
        //arrange
        Tree t1 = new Tree();
        Node n1 = new Node();
        //act
        t1.setRoot(n1);
        //assert
        Assert.assertEquals(t1.getRoot(),n1);
    }

    @Test
    public void checkIfFindsANodeInTreeTest(){
        //arrange
        Tree t1 = new Tree();
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        //act
        t1.add(n1);
        t1.add(n2);
        t1.add(n3);
        t1.add(n4);
        t1.add(n5);
        //assert
        Assert.assertEquals(t1.searchNode(n3),true);
        Assert.assertEquals(t1.searchNode(n6),false);
        Assert.assertEquals(t1.searchNode(n5),true);
    }
    @Test
    public void checkIfTheListOfNodesInTreeExists(){
        //arrange
        Tree t1 = new Tree();
        //act
        List<Node> ltest;
        ltest = t1.listNodes;
        //assert
        Assert.assertEquals(ltest,t1.listNodes);
    }
    @Test
    public void dummyObjectTreeCheck(){
        Tree test = mock(Tree.class);
        Node testnode = new Node();
        test.setRoot(testnode);
        when (test.getRoot()).thenReturn(testnode);
        when(test.getRoot()).thenThrow(new RuntimeException());
    }

}

import WebCrawler.WebCrawler.Node;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class WebCrawlerTest {


    /**
     * Insert a new node with a link,
     * check if the node has a parent.
     */
    @Test
    public void nodeParentCheck(){
        //arrange
        Node baseNode = new Node(new Node(),"link");
        //act
        Node parent = baseNode.getParent();
        //assert
        Assert.assertNotNull(parent);
    }

}

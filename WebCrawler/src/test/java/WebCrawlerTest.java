import WebCrawler.WebCrawler.Node;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class WebCrawlerTest {

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

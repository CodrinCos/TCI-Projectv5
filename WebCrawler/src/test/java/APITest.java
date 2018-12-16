import WebCrawler.WebCrawler.API;
import WebCrawler.WebCrawler.Node;
import org.junit.Assert;
import org.junit.Test;

public class APITest {
    @Test
    public void checkJson(){
        //arrange
        String json = "{name:Codrin}";
        API jsonString= new API();
        Node n=new Node();
        //act
        jsonString.getJSON(n);
        //verify
        Assert.assertSame(json, jsonString.getJSON(n));
    }
}

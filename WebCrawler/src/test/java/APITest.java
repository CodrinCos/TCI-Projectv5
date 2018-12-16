import WebCrawler.WebCrawler.API;
import WebCrawler.WebCrawler.Node;
import org.junit.Assert;
import org.junit.Test;

public class APITest {
    @Test
    public void checkJson(){
        String json = "{name:Codrin}";
        API jsonString= new API();
        Node n=new Node();
        jsonString.getJSON(n);
        Assert.assertSame(json, jsonString.getJSON(n));
    }
}

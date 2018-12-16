import WebCrawler.WebCrawler.BooksNode;
import WebCrawler.WebCrawler.Node;
import org.junit.Assert;
import org.junit.Test;

public class BooksNodeTest {
    @Test
    public void testFilledConstructorNodeBooks(){
        //arrange
        Node mockNode = new BooksNode("tudor", "tudor", 1, new Node(), "mockLink", "category", "mochName",
                "action", "ereader", 1997);
        //act
        //assert
        Assert.assertEquals(((BooksNode) mockNode).getAuthors(), "tudor");
        Assert.assertEquals(((BooksNode) mockNode).getPublisher(), "tudor");
        Assert.assertEquals(((BooksNode) mockNode).getISBN(), 1);
        Assert.assertNotNull(((BooksNode) mockNode).getParent());
        Assert.assertEquals(((BooksNode) mockNode).getLink(), "mockLink");
        Assert.assertEquals(((BooksNode) mockNode).getCategory(), "category");
        Assert.assertEquals(((BooksNode) mockNode).getName(), "mochName");
        Assert.assertEquals(((BooksNode) mockNode).getGenre(), "action");
        Assert.assertEquals(((BooksNode) mockNode).getFormat(), "ereader");
        Assert.assertEquals(((BooksNode) mockNode).getYear(), 1997);

    }
}

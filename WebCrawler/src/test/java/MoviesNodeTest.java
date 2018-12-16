import WebCrawler.WebCrawler.MoviesNode;
import WebCrawler.WebCrawler.Node;
import org.junit.Assert;
import org.junit.Test;

public class MoviesNodeTest {
    @Test
    public void testFilledConstructorNodeMovies(){
        //arrange

        Node mockNode = new MoviesNode("Me","You","Us",new Node(),"link","category","Same","action","dvd",1999);
        //act
        //assert
        Assert.assertEquals(((MoviesNode) mockNode).getDirector(), "Me");
        Assert.assertEquals(((MoviesNode) mockNode).getWriters(), "You");
        Assert.assertEquals(((MoviesNode) mockNode).getStars(), "Us");
        Assert.assertNotNull(((MoviesNode) mockNode).getParent());
        Assert.assertEquals(((MoviesNode) mockNode).getLink(), "link");
        Assert.assertEquals(((MoviesNode) mockNode).getCategory(), "category");
        Assert.assertEquals(((MoviesNode) mockNode).getName(), "Same");
        Assert.assertEquals(((MoviesNode) mockNode).getGenre(), "action");
        Assert.assertEquals(((MoviesNode) mockNode).getFormat(), "dvd");
        Assert.assertEquals(((MoviesNode) mockNode).getYear(), 1999);

    }
}

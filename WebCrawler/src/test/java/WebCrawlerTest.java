import WebCrawler.WebCrawler.MoviesNode;
import WebCrawler.WebCrawler.BooksNode;
import WebCrawler.WebCrawler.MusicNode;
import WebCrawler.WebCrawler.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

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

    @Test
    public void testFilledConstructorNodeMusic(){
        //arrange
        Node mockNode = new MusicNode("tudor",new Node(),"link2","category","mochName","rock","mp3",2007);
        //act
        //assert
        Assert.assertEquals(((MusicNode) mockNode).getArtist(), "tudor");
        Assert.assertNotNull(((MusicNode) mockNode).getParent());
        Assert.assertEquals(((MusicNode) mockNode).getLink(), "link2");
        Assert.assertEquals(((MusicNode) mockNode).getCategory(), "category");
        Assert.assertEquals(((MusicNode) mockNode).getName(), "mochName");
        Assert.assertEquals(((MusicNode) mockNode).getGenre(), "rock");
        Assert.assertEquals(((MusicNode) mockNode).getFormat(), "mp3");
        Assert.assertEquals(((MusicNode) mockNode).getYear(), 2007);

    }

}

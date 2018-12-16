import WebCrawler.WebCrawler.MusicNode;
import WebCrawler.WebCrawler.Node;
import org.junit.Assert;
import org.junit.Test;

public class MusicNodeTest {
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

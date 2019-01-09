import WebCrawler.WebCrawler.MusicNode;
import WebCrawler.WebCrawler.Node;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MusicNodeTest {

    /**
     * Tudor
     * Verifies the get methods if they return the passed values
     */
    @Test
    public void testFilledConstructorNodeMusic(){
        //arrange
        Node mockNode = new MusicNode("tudor",new Node(),"link2","category",
                                    "mochName","rock","mp3",2007);
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

    /**
     * Tudor
     * 'Mock asserts'
     * Creates a mock Music class and verify the set methods
     * if they have been invoked with the same parameter
     */
    @Test
    public void mockAssertMusic(){
        //arrange
        interfaceModel.MusicNode music = mock(interfaceModel.MusicNode.class);
        String artist = "John Cena";
        //act
        music.setArtist(artist);
        //assert
        verify(music).setArtist(artist);

    }


    /**
     * Tudor
     * Verifies if the Movie returns the intended parameter
     */
    @Test
    public void verificationOfMovies(){
        //arrange
        interfaceModel.MusicNode music = mock(interfaceModel.MusicNode.class);
        //act
        when(music.getArtist()).thenReturn("artist");
        //assert
        assertSame(music.getArtist(), "artist");

    }
}

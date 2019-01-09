import WebCrawler.WebCrawler.MoviesNode;
import WebCrawler.WebCrawler.Node;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MoviesNodeTest {


    /**
     * Tudor
     * Verifies the get methods if they return the passed values
     */
    @Test
    public void testFilledConstructorNodeMovies(){
        //arrange
        Node mockNode = new MoviesNode("Me","You","Us",new Node(),"link",
                                "category","Same","action","dvd",1999);
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

    /**
     * Tudor
     * 'Mock asserts'
     * Creates a mock Movie class and verify the set methods
     * if they have been invoked with the same parameter
     */
    @Test
    public void mockAssertMovies(){
        //arrange
        interfaceModel.MoviesNode movies = mock(interfaceModel.MoviesNode.class);
        String director = "Director";
        String star = "John";
        String writer = "Michael";
        //act
        movies.setDirector(director);
        movies.setStars(star);
        movies.setWriters(writer);
        //assert
        verify(movies).setDirector(director);
        verify(movies).setStars(star);
        verify(movies).setWriters(writer);
    }


    /**
     * Tudor
     * Verifies if the Movie returns the intended parameter
     */
    @Test
    public void verificationOfMovies(){
        //arrange
        interfaceModel.MoviesNode movies = mock(interfaceModel.MoviesNode.class);
        //act
        when(movies.getDirector()).thenReturn("Director");
        when(movies.getStars()).thenReturn("Star");
        when(movies.getWriters()).thenReturn("Writer");
        //assert
        assertSame(movies.getDirector(), "Director");
        assertSame(movies.getStars(), "Star");
        assertSame(movies.getWriters(), "Writer");

    }
}

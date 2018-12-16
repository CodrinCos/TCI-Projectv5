import interfaceModel.Main;
import org.junit.Test;
import WebCrawler.WebCrawler.Node;
import WebCrawler.WebCrawler.Tree;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Test class that checks the functionality of the main class
 * indirect input mock test
 */
public class MainTest {
    @Test
    public void checkIfMainWorksUsingMockObjects () throws IOException {
        //act
        interfaceModel.Main main1 = mock(Main.class);
        main1.main(new String[]{ "asd"});
        //verify
        verify(main1).main(new String[]{ "asd"});
    }
//    when(movie.getDirector()).thenReturn("The director of this movie is" + director);
//    when(movie.getDirector()).thenThrow(new RuntimeException());
}
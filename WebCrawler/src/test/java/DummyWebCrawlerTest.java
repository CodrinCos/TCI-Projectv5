import interfaceModel.WebCrawler;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Test the functionality of webcrawler with mockito
 */
public class DummyWebCrawlerTest{
   @Test
   public void checkTreeIfWorksWithMockObject(){
       WebCrawler testCrawler = mock(WebCrawler.class);
       testCrawler.getT();
       verify(testCrawler).getT();
   }
}

import EndPoint.Resource;
import Tree.Node;
import Tree.Tree;
import WebCrawler.WebCrawler.WebCrawlerV2;
import interfaceModel.WebCrawler;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ResTests {
    @Test
    public void CheckingJsonForEachItem(){
        //arrange
        Resource resource=new Resource();
        //act
        //assert
        try {
            Assert.assertEquals("{\"parent\":{\"parent\":{\"Url\":\"[http://i343677.hera.fhict.nl/]\"},\"Url\":\"http://i319728.hera.fhict.nl/catalog.php?cat\\u003dbooks\"},\"Url\":\"http://i343677.hera.fhict.nl/details.php?id\\u003d102\",\"category\":\"Books\",\"genre\":\"Tech\",\"format\":\"Ebook\",\"year\":\"2008\",\"authors\":[\"Robert C. Martin\"],\"publisher\":\"Prentice Hall\",\"ISBN\":\"978-0132350884\",\"title\":\"Clean Code: A Handbook of Agile Software Craftsmanship\",\"id\":\"102\"}",resource.GetBookById("102"));
            Assert.assertEquals("{\"parent\":{\"parent\":{\"Url\":\"[http://i343677.hera.fhict.nl/]\"},\"Url\":\"http://i319728.hera.fhict.nl/catalog.php?cat\\u003dmovies\"},\"Url\":\"http://i343677.hera.fhict.nl/details.php?id\\u003d202\",\"category\":\"Movies\",\"genre\":\"Comedy\",\"format\":\"Blu-ray\",\"year\":\"1999\",\"director\":\"Mike Judge\",\"writer\":[\"William Goldman\"],\"stars\":[\"Ron Livingston\",\"Jennifer Aniston\",\"David Herman\",\"Ajay Naidu\",\"Diedrich Bader\",\"Stephen Root\"],\"title\":\"Office Space\",\"id\":\"202\"}",resource.GetMovieById("202"));
            Assert.assertEquals("{\"parent\":{\"parent\":{\"Url\":\"[http://i343677.hera.fhict.nl/]\"},\"Url\":\"http://i319728.hera.fhict.nl/catalog.php?cat\\u003dmusic\"},\"Url\":\"http://i343677.hera.fhict.nl/details.php?id\\u003d302\",\"category\":\"Music\",\"genre\":\"Rock\",\"format\":\"Vinyl\",\"year\":\"2015\",\"artist\":\"Elvis Presley\",\"title\":\"Elvis Forever\",\"id\":\"302\"}",resource.GetMusicById("302"));
           // Assert.assertEquals("There is no book with this id", resource.GetBookById("777"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testWebCrawler() throws MalformedURLException {
        WebCrawlerV2 crawler = new WebCrawlerV2(new URL("http://i319728.hera.fhict.nl/"));
        Assert.assertEquals("There is no book with such id",crawler.t.GetBookById("111"));
    }
}

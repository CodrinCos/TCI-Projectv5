import WebCrawler.WebCrawler.BooksNode;
import WebCrawler.WebCrawler.Node;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BooksNodeTest {

    /**
     * Tudor
     * Verifies the get methods if they return the passed values
     */
    @Test
    public void testFilledConstructorNodeBooks(){
        //arrange
        Node mockNode = new BooksNode("tudor", "tudor", 1, new Node(), "mockLink",
                "category", "mochName", "action", "ereader", 1997);
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

    /**
     * Tudor
     * 'Mock asserts'
     * Creates a mock Book class and verify the set methods
     * if they have been invoked with the same parameter
     */
    @Test
    public void mockAssertBooks(){
        //arrange
        interfaceModel.BooksNode book = mock(interfaceModel.BooksNode.class);
        String author = "Author";
        int isbn = 152632;
        String publisher = "Publisher";
        //act
        book.setAuthors(author);
        book.setISBN(isbn);
        book.setPublisher(publisher);
        //assert
        verify(book).setAuthors(author);
        verify(book).setISBN(isbn);
        verify(book).setPublisher(publisher);
    }


    /**
     * Tudor
     * Verifies if the Book returns the intended parameter
     */
    @Test
    public void verificationOfBooks(){
        //arrange
        interfaceModel.BooksNode book = mock(interfaceModel.BooksNode.class);
        //act
        when(book.getAuthors()).thenReturn("auth");
        when(book.getISBN()).thenReturn(1002);
        when(book.getPublisher()).thenReturn("pub");
        //assert
        assertSame(book.getAuthors(), "auth");
        assertEquals(book.getISBN(), 1002);
        assertSame(book.getPublisher(), "pub");

    }
}

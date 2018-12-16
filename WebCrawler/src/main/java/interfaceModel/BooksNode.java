package interfaceModel;

public interface BooksNode {

     String getAuthors();
     String getPublisher();
     int getISBN();

     void setAuthors(String authors);
     void setPublisher(String publisher);
     void setISBN(int isbn);
}

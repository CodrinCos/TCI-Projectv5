package Tree;

import com.google.gson.Gson;

import java.util.*;

/**
 * This class represents the data structure used in order to store every link
 * in the website.
 */
public class Tree {
    public List<Node> listNodes;
    private Node root;


    /**
     * First type of constructor with no parameters
     */
    public Tree(String url){
        listNodes = new ArrayList<Node>();
        Node n=new Node();
        n.setUrl(url);
        listNodes.add(n);
    }

    /**
     * Second type of constructor with a Node as parameter for storing the root
     * @param rt
     */
    public Tree(Node rt){
        listNodes = new ArrayList<Node>();
        root=rt;
        listNodes.add(rt);
    }

    public void setRoot(String url) {
        Node n = new Node();
        n.setUrl(url);
        this.root=n;
    }
    public void setRoot(Node n)
    {
        this.root=n;
    }
    public void CreateMusicNode (String url) {
        Node n = new Node();
        n.setUrl(url);
        n.setParent(listNodes.get(0));
        listNodes.add(n);
    }
    public boolean NotContainLink(String url){
        for (Node aux:listNodes) {
            if (aux.getUrl().equals(url) ) return true;
        }
        return false;
    }
    /*
    The following 3 methods are used in the webCrawler to add each item in the tree.
     */
    public void AddBook (String title, String category, String genre, String format, String year, ArrayList<String> authors, String publisher, String ISBN, String url){
        CreateBooksNode(url);
        for (Node aux:listNodes) {
            if (aux.getUrl() == url){
                aux.setCategory(category);
                aux.setGenre(genre);
                aux.setFormat(format);
                aux.setYear(year);
                aux.setAuthors(authors);
                aux.setPublisher(publisher);
                aux.setISBN(ISBN);
                aux.setTitle(title);
                aux.setParent(listNodes.get(1));
                aux.setId(url.toString().substring(url.toString().length()-3));
            }
        }
    }
    public void AddMovie(String title, String category, String genre, String format, String year, String director, ArrayList<String> writer, ArrayList<String> stars, String url){
        CreateMoviesNode(url);
        for (Node aux:listNodes) {
            if (aux.getUrl() == url){
                aux.setCategory(category);
                aux.setGenre(genre);
                aux.setFormat(format);
                aux.setYear(year);
                aux.setDirector(director);
                aux.setWriter(writer);
                aux.setStars(stars);
                aux.setTitle(title);
                aux.setParent(listNodes.get(2));
                aux.setId(url.toString().substring(url.toString().length()-3));
            }
        }
    }
    public void AddMusic(String title, String category, String genre, String format, String year, String artist, String url){
        CreateMusicNode(url);
        System.out.println(url);
        for (Node aux:listNodes) {
            if (aux.getUrl() == url){
                aux.setCategory(category);
                aux.setGenre(genre);
                aux.setFormat(format);
                aux.setYear(year);
                aux.setArtist(artist);
                aux.setTitle(title);
                aux.setParent(listNodes.get(3));
                aux.setId(url.toString().substring(url.toString().length()-3));
            }
        }
    }
    public Tree(){

    }

/*
The following 3 methods are used to create and set the root for a new node for each item (movie book or music)
 */
    public void CreateMoviesNode (String url) {
        Node n = new Node();
        n.setUrl(url);
        n.setParent(listNodes.get(0));
        listNodes.add(n);
    }
    public void CreateBooksNode (String url) {
        Node n = new Node();
        n.setUrl(url);
        n.setParent(listNodes.get(0));
        listNodes.add(n);
    }
    public Node getRoot() {
        return root;
    }

    public boolean add(Node node) {
        listNodes.add(node);
        return true;
    }

    /**
     * This class will search if a node is in the tree
     * @param node
     * @return
     */
   public boolean searchNode(Node node){
        int i;
        for (i=0;i<listNodes.size();i++)
            if (listNodes.contains(node)) return true;
        return false;
   }
   public String ParseToJson(Node n){
           Gson gson = new Gson();
           return gson.toJson(n, Node.class);
   }

   /*
   This method add all the elements from the tree into a list in order to create a JSON format
    */
   public ArrayList<String> ShowInJsonFormat (){
       ArrayList<String> list = new ArrayList<>();
       for (Node aux: listNodes) {
           list.add(ParseToJson(aux));
       }
       return list;
   }
    public ArrayList<String> ShowInJsonFormatBooks(){
        ArrayList<String> list = new ArrayList<>();
        for (Node aux: listNodes) {
            if (aux.getCategory()!=null && aux.getCategory().equals("Books")) list.add(ParseToJson(aux));
        }
        return list;
    }
    public ArrayList<String> ShowInJsonFormatMovies(){
        ArrayList<String> list = new ArrayList<>();
        for (Node aux: listNodes) {
            if (aux.getCategory()!=null && aux.getCategory().equals("Movies")) list.add(ParseToJson(aux));
        }
        return list;
    }
    public ArrayList<String> ShowInJsonFormatMusic(){
        ArrayList<String> list = new ArrayList<>();
        for (Node aux: listNodes) {
            if (aux.getCategory()!=null && aux.getCategory().equals("Music")) list.add(ParseToJson(aux));
        }
        return list;
    }
    /*
    The following 3 methods helps when we want to search an item by his id
     */
    public String GetBookById(String id){
        for (Node aux: listNodes) {
            if (aux.getId()!=null && aux.getId().equals(id) && aux.getCategory().equals("Books")) return ParseToJson(aux);
        }
        return "There is no book with such id";
    }
    public String GetMusicById(String id){
        for (Node aux: listNodes) {
            if (aux.getId()!=null && aux.getId().equals(id) && aux.getCategory().equals("Music")) return ParseToJson(aux);
        }
        return "There is no music with such id";
    }
    public String GetMovieById(String id){
        for (Node aux: listNodes) {
            if (aux.getId()!=null && aux.getId().equals(id) && aux.getCategory().equals("Movies")) return ParseToJson(aux);
        }
        return "There is no movie with such id";
    }
    public Node GetNodeById(String id){
        for (Node aux: listNodes) {
            if (aux.getId()!=null && aux.getId().equals(id) ) return aux;
        }
        return null;
    }
}


package EndPoint;

import Tree.Tree;
import Tree.Node;
import WebCrawler.WebCrawler.WebCrawlerV2;
import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
/*
The restful API.
 */
@Path("Main")
public class Resource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String Check(){
        return "check";
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("All")
    public String GetAll() throws MalformedURLException {
        WebCrawlerV2 webCrawlerV2 = new WebCrawlerV2(new URL("http://i343677.hera.fhict.nl/"));
        Tree t = webCrawlerV2.t;
        ArrayList<String> list = t.ShowInJsonFormat();
        String JSON="";
        for(String aux: list){
            JSON+="\n";
            JSON+=aux;
        }
        return JSON;
    }
/*
This api returns all the books
 */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("Books")
    public String GetBooks() throws MalformedURLException{
        WebCrawlerV2 webCrawlerV22 = new WebCrawlerV2(new URL("http://i343677.hera.fhict.nl/"));
        Tree t = webCrawlerV22.t;
        ArrayList<String> list = t.ShowInJsonFormatBooks();
        String JSON="";
        for(String aux: list){
            JSON+="\n";
            JSON+=aux;
        }
        return JSON;
    }
/*
This api returns all the movies
 */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("Movies")
    public String GetMovies() throws MalformedURLException{
        WebCrawlerV2 webCrawlerV222 = new WebCrawlerV2(new URL("http://i343677.hera.fhict.nl/"));
        Tree t = webCrawlerV222.t;
        ArrayList<String> list = t.ShowInJsonFormatMovies();
        String JSON2="";
        for(String aux: list){
            JSON2+="\n";
            JSON2+=aux;
        }
        return JSON2;
    }
/*
This api returns all the music
 */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("Music")
    public String GetMusic() throws MalformedURLException{
        WebCrawlerV2 webCrawlerV2222 = new WebCrawlerV2(new URL("http://i343677.hera.fhict.nl/"));
        Tree t = webCrawlerV2222.t;
        ArrayList<String> list = t.ShowInJsonFormatMusic();
        String JSON="";
        for(String aux: list){
            JSON+="\n";
            JSON+=aux;
        }
        return JSON;
    }
/*
These methods returns each item by id
 */
    @GET
    @Path("Books/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String GetBookById(@PathParam("id") String id) throws MalformedURLException {
        WebCrawlerV2 webCrawlerV2222 = new WebCrawlerV2(new URL("http://i343677.hera.fhict.nl/"));
        Tree t = webCrawlerV2222.t;
        return t.GetBookById(id);
    }
    @GET
    @Path("Music/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String GetMusicById(@PathParam("id") String id) throws MalformedURLException {
        WebCrawlerV2 webCrawlerV2222 = new WebCrawlerV2(new URL("http://i343677.hera.fhict.nl/"));
        Tree t = webCrawlerV2222.t;
        return t.GetMusicById(id);
    }
    @GET
    @Path("Movies/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String GetMovieById(@PathParam("id") String id) throws MalformedURLException {
        WebCrawlerV2 webCrawlerV2222 = new WebCrawlerV2(new URL("http://i343677.hera.fhict.nl/"));
        Tree t = webCrawlerV2222.t;
        return t.GetMovieById(id);
    }
    @GET
    @Path("Statistics/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String Statistics(@PathParam("id") String id) throws MalformedURLException {
        WebCrawlerV2 webCrawlerV2222 = new WebCrawlerV2(new URL("http://i343677.hera.fhict.nl/"));
        Tree t = webCrawlerV2222.t;
        Node aux = t.GetNodeById(id);
        Statistics statistics=new Statistics();
        statistics.depth="3";
        statistics.id=id;
        statistics.methodUsed="bfs";
        statistics.setDepth("3");
        Gson gson = new Gson();
        return gson.toJson(statistics, Statistics.class);
    }
}

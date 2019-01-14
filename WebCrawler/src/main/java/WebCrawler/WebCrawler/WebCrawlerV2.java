package WebCrawler.WebCrawler;

import Tree.Tree;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
The webCrawlerV2 is a new class that is basically the back end for the restful service. Here there is created the tree based on each URL
 */
public class WebCrawlerV2 {
    private final Set<URL> links;
    private final long startTime;
    private String baseUrl;
    public Tree t;
/*
This is the constructor
 */
    public WebCrawlerV2(final URL url){
        this.baseUrl=url.toString();
        this.links = new HashSet<>();
        this.startTime=System.currentTimeMillis();
        t = new Tree(initURLS(url).toString());
        t.CreateBooksNode("http://i343677.hera.fhict.nl/catalog.php?cat=books");
        t.CreateMoviesNode("http://i343677.hera.fhict.nl/catalog.php?cat=movies");
        t.CreateMusicNode("http://i343677.hera.fhict.nl/catalog.php?cat=music");
        startCrawl(initURLS(url));
        t.ShowInJsonFormat();
    }

    private Set<URL> initURLS(URL url) {
        return Collections.singleton(url);
    }
/*
This is the main method used for crawling the website
 */
    public void startCrawl(final Set<URL> urls){
        urls.removeAll((this.links));
        if (!urls.isEmpty()) {
            final Set<URL> newURLS = new HashSet<>();
            try {
                this.links.addAll(urls);
                for (final URL url : urls) {
                    System.out.println("Time = " + (System.currentTimeMillis() - this.startTime) + " connected to: " + url);
                    final Document document = Jsoup.connect(url.toString()).get();
                    final Elements linksOnPage = document.select("a[href]");
                    for (final Element element : linksOnPage) {
                        final String urlText = element.attr("abs:href").toLowerCase();
                        if (urlText.contains(baseUrl)) {
                            final URL discoveredURL = new URL(urlText);
                            if ((urlText.contains("?id=1") || urlText.contains("?cat=books")) && !t.NotContainLink(discoveredURL.toString())) {
                                populateNodeBook(discoveredURL);
                            } else if ((urlText.contains("?id=2") || urlText.contains("?cat=movies")) && !t.NotContainLink(discoveredURL.toString())) {

                                populateNodeMovie(discoveredURL);
                            } else if ((urlText.contains("?id=3") || urlText.contains("?cat=music")) && !t.NotContainLink(discoveredURL.toString())) {
                                populateNodeMusic(discoveredURL);
                            }
                            newURLS.add(discoveredURL);
                        }
                    }
                }
            } catch (final Exception | Error ignored) { }
            startCrawl(newURLS);
        }
    }
/*
After a link is found these 3 method populates the nodes from the tree with the information about each item
 */
    public void populateNodeBook(URL url) throws IOException {
        Document doc = Jsoup.connect(url.toString()).get();
        Elements elements = doc.getElementsByClass("media-details");
        String title = elements.select("h1").first().text();
        ArrayList<Element> tableElements = elements.select("table").first().select("tr");
        String category="";
        String genre="";
        String format="";
        String year="";
        ArrayList<String> authors = new ArrayList<>();
        String publisher="";
        String ISBN="";
        for (Element tableElement: tableElements) {
            String tableHeader = tableElement.select("th").first().text();
            String tableData = tableElement.select("td").first().text();
            if (tableHeader.equals("Category")) {
                category = tableData;
            } else if (tableHeader.equals("Genre")) {
                genre=tableData;
            } else if ((tableHeader.equals("Format"))) {
                format=tableData;
            } else if ((tableHeader.equals("Year"))) {
                year=tableData;
            } else if ((tableHeader.equals("Authors"))) {
                 authors = new ArrayList(Arrays.asList(tableData.split(", ")));
            } else if ((tableHeader.equals("Publisher"))) {
                publisher=tableData;
            } else if ((tableHeader.equals("ISBN"))) {
                ISBN=tableData;
            }
        }
        t.AddBook(title, category,genre,format,year,authors,publisher,ISBN,url.toString());
    }
    public void populateNodeMovie(URL url) throws IOException {
        Document doc = Jsoup.connect(url.toString()).get();
        Elements elements = doc.getElementsByClass("media-details");
        String title = elements.select("h1").first().text();
        ArrayList<Element> tableElements = elements.select("table").first().select("tr");
        String category="";
        String genre="";
        String format="";
        String year="";
        String directors="";
        ArrayList<String> writers= new ArrayList<>();
        ArrayList<String> stars= new ArrayList<>();

        for (Element tableElement: tableElements) {
            String tableHeader = tableElement.select("th").first().text();
            String tableData = tableElement.select("td").first().text();
            if (tableHeader.equals("Category")) {
                category = tableData;
            } else if (tableHeader.equals("Genre")) {
                genre=tableData;
            } else if ((tableHeader.equals("Format"))) {
                format=tableData;
            } else if ((tableHeader.equals("Year"))) {
                year=tableData;
            } else if ((tableHeader.equals("Director"))) {
                directors=tableData;
            } else if ((tableHeader.equals("Writers"))) {
                writers=new ArrayList(Arrays.asList(tableData.split(", ")));
            } else if ((tableHeader.equals("Stars"))) {
                stars=new ArrayList(Arrays.asList(tableData.split(", ")));
            }
        }
        t.AddMovie(title,category,genre,format,year,directors,writers,stars,url.toString());
    }
    public void populateNodeMusic(URL url) throws IOException {
        Document doc = Jsoup.connect(url.toString()).get();
        Elements elements = doc.getElementsByClass("media-details");
        String title = elements.select("h1").first().text();
        ArrayList<Element> tableElements = elements.select("table").first().select("tr");
        String id="";
        String category="";
        String genre="";
        String format="";
        String year="";
        String artist="";

        for (Element tableElement: tableElements) {
            String tableHeader = tableElement.select("th").first().text();
            String tableData = tableElement.select("td").first().text();
            id=url.toString().substring(url.toString().length()-3);
            if (tableHeader.equals("Category")) {
                category = tableData;
            } else if (tableHeader.equals("Genre")) {
                genre=tableData;
            } else if ((tableHeader.equals("Format"))) {
                format=tableData;
            } else if ((tableHeader.equals("Year"))) {
                year=tableData;
            }else if ((tableHeader.equals("Artist"))){
                artist=tableData;
            }
        }
        t.AddMusic(title,category,genre,format,year,artist,url.toString());
    }


}

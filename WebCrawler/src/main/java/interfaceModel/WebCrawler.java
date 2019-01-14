package interfaceModel;

import Tree.Tree;

import java.net.URL;
import java.util.Set;

public interface WebCrawler {
    public Tree getT();
    void crawl(final Set<URL> urls);
    Set<URL> initURLS(final URL startURL);

}

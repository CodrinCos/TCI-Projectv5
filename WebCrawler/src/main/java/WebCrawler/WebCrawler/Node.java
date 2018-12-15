package WebCrawler.WebCrawler;

public class Node {
    private Node parent;
    private String category;
    private String info;

    public Node() { }
    public Node(Node parent, String category, String info) {
        this.parent = parent;
        this.category = category;
        this.info = info;
    }

    public Node getParent() {
        return parent;
    }

    public String getCategory() {
        return category;
    }

    public String getInfo() {
        return info;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setInfo(String info) {
        this.info = info;
    }


}

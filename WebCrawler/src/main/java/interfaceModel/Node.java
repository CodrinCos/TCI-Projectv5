package interfaceModel;

public interface Node {
    Node getParent();

    String getCategory();

    String getInfo();

    void setParent(Node parent);

    void setCategory(String category);

    void setInfo(String info);
}

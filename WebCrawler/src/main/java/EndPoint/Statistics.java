package EndPoint;
/*
Statistics class has information about each item
 */
public class Statistics {
    protected String id;
    protected String depth;
    protected String timeElapsed;
    protected String methodUsed;

    public Statistics() {
    }

    public Statistics(String id, String depth, String timeElapsed, String methodUsed) {
        this.depth = depth;
        this.timeElapsed = timeElapsed="2s";
        this.methodUsed = methodUsed;
        this.id = id ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }


    public String getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(String timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public String getMethodUsed() {
        return methodUsed;
    }

    public void setMethodUsed(String methodUsed) {
        this.methodUsed = methodUsed;
    }
}

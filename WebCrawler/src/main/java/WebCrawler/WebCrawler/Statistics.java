package WebCrawler.WebCrawler;

/**
 * This class is intended to show information about the process
 */
public class Statistics {
    private final String strategyUsed;
    private int requestId;
    private double timeElapsed;
    private int nrOfPagesExplored;
    private int searchDepth;


    public Statistics(String algorithUsed, int nrOfPagesExplored, double timeElapsed, int searchDepth, int requestId) {
        this.strategyUsed = algorithUsed;
        this.nrOfPagesExplored = nrOfPagesExplored;
        this.timeElapsed = timeElapsed;
        this.searchDepth = searchDepth;
        this.requestId = requestId;
    }

    public String getStrategyUsed() { return strategyUsed; }

    public int getNrOfpagesExplored() { return nrOfPagesExplored; }

    public double getTimeElapsed() { return timeElapsed; }

    public int getSearchDepth() { return searchDepth; }

    public int getRequestId() { return requestId; }
}
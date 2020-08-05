public class ScrabbleTestThreads {
    public static void main(String[] args) {
        Runnable getTiles = new GetTheTiles();
        Runnable getTheTilesAgain = new GetTheTiles();
        new Thread(getTiles).start();
        new Thread(getTheTilesAgain).start();
    }
}

public class Putter implements Runnable{
    QueueData sharedqueue;
    int start;

    Putter(QueueData queue, int thestart ) {
        sharedqueue = queue;
        start = thestart;
    }

    public void run() {
        for (int i = start; i < start+300; i = i + 1) {
            boolean saved = sharedqueue.put(i);
            while (!saved) {
                saved = sharedqueue.put(i);
            }
            System.out.println("Saved: " + saved);
        }
    }
}

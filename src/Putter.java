public class Putter implements Runnable{
    QueueData sharedqueue;

    Putter(QueueData queue) {
        sharedqueue = queue;
    }

    public void run() {
        for (int i = 0; i < 300; i = i + 1) {
            boolean saved = sharedqueue.put(i);
            while (!saved) {
                saved = sharedqueue.put(i);
            }
            System.out.println("Saved: " + saved);
        }
    }
}

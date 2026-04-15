public class Putter implements Runnable{
    QueueData sharedqueue;

    Putter(QueueData queue) {
        sharedqueue = queue;
    }

    public void run() {
        for (int i = 0; i < 100; i = i + 1) {
            System.out.println("Next Value: " + sharedqueue.put(i));
        }
    }
}

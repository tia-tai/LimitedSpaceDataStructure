public class Getter implements Runnable{
    QueueData sharedqueue;

    Getter(QueueData queue) {
        sharedqueue = queue;
    }

    public void run() {
        for (int i = 0; i < 100; i = i + 1) {
            System.out.println("Next Value: " + sharedqueue.get());
        }
    }
}

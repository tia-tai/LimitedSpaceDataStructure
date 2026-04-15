public class Getter implements Runnable{
    QueueData sharedqueue;

    Getter(QueueData queue) {
        sharedqueue = queue;
    }

    public void run() {
        for (int i = 0; i < 300; i = i + 1) {
            Object num = sharedqueue.get();
            while (num == null) {
                num = sharedqueue.get(false);
            }
            System.out.println("Next Value: " + num);
        }
    }
}

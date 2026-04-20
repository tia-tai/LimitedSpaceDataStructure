public class Main {
    public static void main(String[] args) {
        QueueData queue = new QueueData();

        Getter getter  = new Getter(queue);
        Getter getter2  = new Getter(queue);
        Getter getter3  = new Getter(queue);
        Putter putter = new Putter(queue, 500);
        Putter putter2 = new Putter(queue, 200);
        Putter putter3 = new Putter(queue, 800);

        Thread putterThread = new Thread(putter);
        Thread putter2Thread =  new Thread(putter2);
        Thread putter3Thread =  new Thread(putter3);
        Thread getterThread = new Thread(getter);
        Thread getter2Thread = new Thread(getter2);
        Thread getter3Thread = new Thread(getter3);

        putterThread.start();
        putter2Thread.start();
        putter3Thread.start();
        getterThread.start();
        getter2Thread.start();
        getter3Thread.start();

//        for (int i = 0; i < 200; i = i + 1) {
//            System.out.println(queue.put(i));
//        }
//        for (int i = 0; i < 200; i = i + 1) {
//            System.out.println(queue.get());
//        }

//        QueueStackData queueStackData = new QueueStackData();
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println(queueStackData.put(i));
//        }
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println(queueStackData.get());
//        }
//
//        queueStackData.switchStructure();
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println(queueStackData.get());
//        }


       // for (int i = 0; i < 200; i = i + 1) {
        //    System.out.println(queue.get());
        //}

        /*
        for (int i = 100; i < 150; i = i + 1) {
            System.out.println(queue.put(i));
        }

        for (int i = 50; i < 150; i = i + 1) {
            System.out.println(queue.get());
        }

        StackData stack = new StackData();
        for (int i = 0; i < 100; i = i + 1) {
            System.out.println(stack.put(i));
        }

        for (int i = 0; i < 100; i = i + 1) {
            System.out.println(stack.get());
        }

        for (int i = 100; i < 200; i = i + 1) {
            System.out.println(stack.put(i));
        }

        for (int i = 100; i < 200; i = i + 1) {
            System.out.println(stack.get());
        }

        for (int i = 200; i < 300; i = i + 1) {
            System.out.println(stack.put(i));
        }

        for (int i = 200; i < 300; i = i + 1) {
            System.out.println(stack.get());
        }

         */
    }
}
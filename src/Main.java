public class Main {
    public static void main(String[] args) {
        QueueData queue = new QueueData();

        Getter getter  = new Getter(queue);
        Putter putter = new Putter(queue);

        Thread putterThread = new Thread(putter);
        Thread getterThread = new Thread(getter);

        putterThread.start();
        getterThread.start();

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
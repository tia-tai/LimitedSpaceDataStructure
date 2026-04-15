public class QueueStackData implements LimitedSpaceDataStructure{
    boolean isQueue = true;
    StackData stack = new StackData();
    QueueData queue = new QueueData();

    @Override
    public boolean put(Object obj) {
        stack.put(obj);
        return queue.put(obj);
    }

    @Override
    public Object get() {
        if (isQueue) {
            return queue.get();
        } else {
            return stack.get();
        }
    }

    @Override
    public Object get(boolean increment) {
        return null;
    }

    public void switchStructure() {
        isQueue = !isQueue;
    }
}
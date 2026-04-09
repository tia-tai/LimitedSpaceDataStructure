public class QueueData implements LimitedSpaceDataStructure{
    @Override
    public boolean put(Object obj) {
        return false;
    }

    @Override
    public Object get() {
        return null;
    }
}

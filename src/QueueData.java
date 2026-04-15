public class QueueData implements LimitedSpaceDataStructure{
    Object[] objects = new Object[100];
    int objRead = 0;
    int objWrite = 0;
    int size = 0;

    @Override
    public synchronized boolean put(Object obj) {
        if (size == 100) {
            return false;
        }

        objects[objWrite] = obj;
        objWrite = (objWrite + 1) % 100;
        size++;

        return true;
    }

    @Override
    public Object get() {
        if (size == 0) {
            return null;
        }

        Object obj = objects[objRead];
        objRead = (objRead + 1) % 100;
        size--;

        return obj;
    }

    @Override
    public synchronized Object get(boolean increment) {
        if (size == 0) {
            return null;
        }

        if (increment) {
            return get();
        } else {
            return objects[objRead-1];
        }
    }
}

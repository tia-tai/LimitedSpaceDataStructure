public class StackData implements LimitedSpaceDataStructure{
    Object[] objects = new Object[100];
    int objNum = -1;

    @Override
    public boolean put(Object obj) {
        if (objNum == 99) {
            return false;
        }

        objNum++;
        objects[objNum] = obj;

        return true;
    }

    @Override
    public Object get() {
        if (objNum == -1) {
            return null;
        }

        Object obj = objects[objNum];
        objNum--;

        return obj;
    }

    @Override
    public Object get(boolean increment) {
        return null;
    }
}

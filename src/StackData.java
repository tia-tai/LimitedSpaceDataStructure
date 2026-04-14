public class StackData implements LimitedSpaceDataStructure{
    Object[] objects = new Object[100];
    int objNum = 0;

    @Override
    public boolean put(Object obj) {
        if (objNum == 100) {
            return false;
        }

        objects[objNum] = obj;
        objNum++;

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
}

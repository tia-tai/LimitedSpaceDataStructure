public class StackData implements LimitedSpaceDataStructure{
    Object[] objects = new Object[100];
    int objNum = 0;
    int objectsAmount = 0;

    @Override
    public boolean put(Object obj) {
        if (objectsAmount < 100) {
            objects[objectsAmount] = obj;
            objNum = objectsAmount;
            objectsAmount++;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Object get() {
        if (objNum > -1) {
            Object obj = objects[objNum];
            objNum--;
            return obj;
        } else {
            return null;
        }
    }
}

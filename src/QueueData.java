public class QueueData implements LimitedSpaceDataStructure{
    Object[] objects = new Object[100];
    int objNum = 0;
    int objectsAmount = 0;
    int secondaryAmount = 0;

    @Override
    public boolean put(Object obj) {
        if (objectsAmount < 100) {
            objects[objectsAmount] = obj;
            objectsAmount++;
            return true;
        } else if (objNum > secondaryAmount) {
            objects[secondaryAmount] = obj;
            secondaryAmount++;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Object get() {
        if (objNum < 100) {
            Object obj = objects[objNum];
            objNum++;
            return obj;
        } else if (secondaryAmount != 0) {
            objNum = 0;
        }


//        else if (secondaryAmount > 0) {
//            objNum = 0;
//            Object obj = objects[objNum];
//            objNum++;
//            if (secondaryAmount > 100 && objNum > 100) {
//                objectsAmount = 0;
//                secondaryAmount = 0;
//                objNum = 0;
//            }
//            return obj;
//        }
        else {
            return null;
        }
    }
}

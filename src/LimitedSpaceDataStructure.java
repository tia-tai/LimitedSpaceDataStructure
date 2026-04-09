public interface LimitedSpaceDataStructure {
    // Fields
    Object[] objects = new Object[100];

    // Methods
    boolean put(Object obj);
    Object get();
}
package ibf.sdf;

public final class App {
    public static void main(String[] args) {

        ArraySortExample array = new ArraySortExample();
        array.example();
        CollectionSortExample list = new CollectionSortExample();
        list.example01();
        list.example02();
        // HashMapExample map = new HashMapExample();
        // map.example();
        ConcurrentHashMapExample conMap = new ConcurrentHashMapExample();
        conMap.example();
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Main {
    public static void main(String[] args) {
        compareMaps(10000);
    }

    public static void compareMaps(int noOfOps) {
        HashMap<Integer, String> map = new HashMap<>();
        long nonConcMapTime, concMapTime;


        long start = System.nanoTime();
        for (int i = 0; i < noOfOps; i++) {
            map.put(i, "Hello");
        }
        long end = System.nanoTime();

        System.out.println("Non concurrent map");

        nonConcMapTime = end - start;
        System.out.println(nonConcMapTime);


        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();

        long startConc = System.nanoTime();

        for (int i = 0; i < noOfOps; i++) {
            concurrentMap.put(i, "Hello");
        }

        long endConc = System.nanoTime();

        System.out.println("Concurrent map");
        concMapTime = endConc - startConc;
        System.out.println(concMapTime);
    }


}
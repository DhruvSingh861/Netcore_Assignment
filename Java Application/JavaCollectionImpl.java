import java.util.*;
import java.util.concurrent.*;

public class JavaCollectionImpl {
    public static void main(String[] args) {

        // List Interface
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new LinkedList<>();
        List<Integer> l3=new Stack<>();
        //concurrent version of ArrayList
        List<Integer> l4=new CopyOnWriteArrayList<>();

        //comparision btw ArrayList and CopyOnWriteArrayList
        long start = System.nanoTime();
        for(int i=0;i<1000;i++) l1.add(i);
        for(int i=0;i<1000;i++) l1.get(i);
        long finish = System.nanoTime();
        System.out.println("ArrayList: "+(finish - start));

        start = System.nanoTime();
        for(int i=0;i<1000;i++) l4.add(i);
        for(int i=0;i<1000;i++) l4.get(i);
        finish = System.nanoTime();
        System.out.println("CopyOnWriteArrayList: "+(finish - start));


        // Set Interface
        Set<Integer> s1=new HashSet<>();
        //ordered version of HashSet
        Set<Integer> s2=new LinkedHashSet<>();
        Set<Integer> s3=new TreeSet<>();
        //concurent version of TreeSet i.e thread-safe
        Set<Integer> s4=new ConcurrentSkipListSet<>();
        //thread-safe version of set
        Set<Integer> s5=new CopyOnWriteArraySet<>();

        //Map Interface
        Map<Integer, Integer> m1=new HashMap<>();
        Map<Integer, Integer> m2=new TreeMap<>();
        Map<Integer, Integer> m3=new LinkedHashMap<>();
        //concurrent version of HashMap
        Map<Integer, Integer> m4=new ConcurrentHashMap<>();
        //concurrent version of TreeMap
        Map<Integer, Integer> m5=new ConcurrentSkipListMap<>();

    }
}

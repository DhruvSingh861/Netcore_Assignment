import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class JavaCollectionImpl {
    public static void main(String[] args) {

        // List Interface
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new LinkedList<>();
        List<Integer> l3=new Stack<>();
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
        Set<Integer> s2=new LinkedHashSet<>();
        Set<Integer> s3=new TreeSet<>();
        Set<Integer> s4=new ConcurrentSkipListSet<>();
        Set<Integer> s5=new CopyOnWriteArraySet<>();
    }
}

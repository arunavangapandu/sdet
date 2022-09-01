import java.util.*;

public class App {

    public static void main(String[] args) {
        /*String[] arrStr = {"Hello", "World"};
        Integer[] intArr = {1,2,3,4};
        Laptop laptop = new Laptop();
       // laptop.genericMethod(arrStr);
      //  laptop.genericMethod(intArr);

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("how are you");
        list.get(1);
        list.remove(1);

        for(String elem:list) {
            System.out.println(elem);
        }


        // list.remove("hello"); // you can't do that in array, its static
        List<String> ll = new LinkedList<>();
        ll.add("hello");
        ll.add("world");
        ll.get(1);
        ll.remove(1);

        for(String elem:ll) {
            System.out.println(elem);
        }

        Set<String> hashSet = new HashSet<>(); // performance is the best
        // for this set, look up is fast
        // Random order ---order wont maintain as you insert
        hashSet.add("hashSet");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        // Better than treeset in performance, but slower than in hashset
        // Maintain the order of insertion
        linkedHashSet.add("linkedHashSet");

        Set<String> treeSet = new TreeSet<>(); // slowest set for adding and retrieving
        // all data is sorted
        treeSet.add("treeSet");

        // Union
        Set<Integer>  a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        Set<Integer>  b = new HashSet<>();
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);

        Set<Integer>  union = new HashSet<>(a);
        union.addAll(b);
        System.out.println(union);

        // Intersection
        Set<Integer>  intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        // Difference
        Set<Integer>  difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println(difference);

        // HashMap
        Map<Integer, String> basicMap = new HashMap<>(); // random access,fast access
        basicMap.put(1, "good morning");
        basicMap.put(2, "hello");
        basicMap.put(3, "");

        System.out.println(basicMap);

        Map<String, Integer> basicMap2 = new HashMap<>();
        basicMap2.put("good morning", 1);
        basicMap2.put("hello", 2);
        System.out.println(basicMap2);

        Map<Integer, Integer> linkedhashMap = new LinkedHashMap<>(); // maintains insertion order

        Map<Integer, Integer> treehashMap = new TreeMap<>(); // it will sort the entries by key

        for(Map.Entry<Integer, String> element: basicMap.entrySet()) {
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }

        String str1 = "string1";
        String str2 = "String2";
        str1.equals(str2);
*/
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();

        laptop1.setManufacturer("HP");
        laptop2.setManufacturer("HP");
        System.out.println(laptop1.hashCode()== laptop2.hashCode());

        // System.out.println(laptop1.equals(laptop2));

        System.out.println(laptop1);
    }

}
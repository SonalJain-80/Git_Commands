package javatraining;

import java.util.*;

public class Collections {
    public static void main (String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //System.out.println(10>>1);
        arr.add(12); //primitive data directly getting stored in non-primitive type class by using concept of AUTOBOXING
        arr.add(34);
        arr.add(87);
        int y=arr.get(0); //UNBOXING concept is used to convert from Integer to int
        for (Integer i : arr) {
            System.out.println(i);
        }
        System.out.println(arr);
        LinkedList<String> ll = new LinkedList<>();
        //ll.add("Sookhi");
        ll.offer("Papdi");
        ll.offer("Paglait");
        ll.offer("SAP");
        ll.pop();
        ll.pop();
        System.out.println(ll);
        List<String> ll1 = new LinkedList<>();
        ll1.add("Sookhi");  //cannot use offer() , pop()
        ll1.add("mad");
        ll1.remove(0);
        Set<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(100);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);
        System.out.println(hashSet);
        Set<Integer> s = new TreeSet<>();
        s.add(24);
        s.add(89);
        s.add(5);
        System.out.println(s);

        Set<EmployeeDemo> emp = new HashSet<>();
        EmployeeDemo em1 = new EmployeeDemo("Jimin", 25);
        EmployeeDemo em2 = new EmployeeDemo("Jungkook", 23);
        EmployeeDemo em3 = new EmployeeDemo("Taehyung", 26);
        EmployeeDemo em4 = new EmployeeDemo("Jimin", 25);  //We are adding an instance as a whole and not individual values, so it is not able to track duplicate values
        emp.add(em1);
        emp.add(em2);
        emp.add(em3);
        emp.add(em4);
        System.out.println(emp);
        for (EmployeeDemo e : emp )
            System.out.println(e.getName() + " " + e.getAge());

        //Map does not implements Collections
        Map<String, String> map = new HashMap<String, String> ();
        map.put("J", "Jimin");
        map.put("T", "Taehyung");
        System.out.println(map);
    }
}

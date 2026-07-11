package DSA.MapSetHasing;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
         HashMap<Integer, String> map = new HashMap<>();
         map.put(1, "One");
         map.put(2, "Two");
         map.put(3, "Three");
         map.put(4, "Four");
         map.put(5, "Five");
         map.put(6, "Six");
         map.put(7, "Seven");

         System.out.println(map);
         System.out.println(map.get(1));
         System.out.println(map.containsKey(1));
         System.out.println(map.containsValue("One"));
         System.out.println(map.remove(1));
         System.out.println(map);
         System.out.println(map.remove(2, "Two"));
         System.out.println(map);

         // iterate
         for (Integer key : map.keySet()) {
             System.out.println(key + " " + map.get(key));
         }

         for (String value : map.values()) {
             System.out.println(value);
         }
         for (java.util.Map.Entry<Integer, String> entry : map.entrySet()) {
             System.out.println(entry.getKey() + " " + entry.getValue());
         }

         // clear
         map.clear();
         System.out.println(map);
         System.out.println(map.isEmpty());
         System.out.println(map.size());
         System.out.println(map.containsKey(1));
         System.out.println(map.containsValue("One"));
         System.out.println(map.get(1));
         System.out.println(map.remove(1));
         System.out.println(map);
         System.out.println(map.remove(2, "Two"));
         System.out.println(map);
         System.out.println(map.keySet());
         System.out.println(map.values());
         System.out.println(map.entrySet());
         System.out.println(map.toString());
         System.out.println(map.hashCode());
         System.out.println(map.equals(map));
         System.out.println(map.equals(null));
         System.out.println(map.equals(new HashMap<>()));
         System.out.println(map.equals(new HashMap<Integer, String>() {{
             put(1, "One");
         }}
                 ));
         System.out.println(map.equals(new HashMap<Integer, String>() {{
             put(1, "One");
             put(2, "Two");
         }}
                 ));
         System.out.println(map.equals(new HashMap<Integer, String>() {{
             put(1, "One");
             put(2, "Two");
             put(3, "Three");
         }}
                 ));


    }
}

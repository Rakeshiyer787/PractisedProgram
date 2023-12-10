package Hash_map;

import java.util.HashMap;

public class Hash_put {
    public static void main(String[] args) {
        HashMap <String,Integer> NG = new HashMap<String,Integer>();
        NG.put("Rakesh",25);
        NG.put("Mohan",60);
        NG.put("Kishore",30);
        NG.put("Nanjunda",40);
        NG.put("Ashok",35);
        System.out.println("Retuning element with Key & Value: "+NG);
        NG.putIfAbsent("Raju",18);
        System.out.println("Updated: "+NG.keySet());
        System.out.println("Elements only with Keys: "+NG.keySet());
        System.out.println("Elements with only Values: "+NG.values());
        NG.remove("Rakesh");
        System.out.println("Retuning element after removing Key: "+NG);
        System.out.println("Retuning element contains value: "+NG.containsValue(35));
        System.out.println("Retuning element contains value: "+NG.containsKey("Rakesh"));
        NG.replace("Ashok",40);
        System.out.println("After replacing value"+NG);
        NG.clear();
        System.out.println("After clearing the values: "+NG);
        System.out.println("Checking element : "+NG.isEmpty());




    }
}

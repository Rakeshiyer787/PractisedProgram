package Hash_Set;


import java.util.HashSet;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Raju");
        names.add("Lokesh");
        names.add("Rocky");
        names.add("Jitesh");
        names.add("Rakesh");
        names.add("Edwin");
        System.out.println(names);
        System.out.println(names.remove("Rakesh"));
        System.out.println(names.contains("Edwin"));
        System.out.println(names.size());
        names.clone();
        System.out.println(names);
        System.out.println(names.isEmpty());
    }
}

package Hash_Set;
import java.util.HashSet;

public class Hash_set1 {
    public static void main(String[] args) {
        HashSet<Integer> regnum = new HashSet<Integer>();
        regnum.add(10);
        regnum.add(20);
        regnum.add(80);
        regnum.add(60);
        regnum.add(70);
        regnum.add(100);
        System.out.println(regnum);
        Object [] num = regnum.toArray();
        System.out.println(num[3]);

    }
}

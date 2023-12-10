package Arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist_iterator {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>();
        names.add("Welcome");
        names.add("To");
        names.add("Java");
        ListIterator <String> iterator = names.listIterator() ;
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        }
    }


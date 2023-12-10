package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Array_sort {
  public static void main(String args[]) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Mango");
    list.add("Apple");
    list.add("Banana");
    list.add("Grapes");
    list.add("Watermelon");
      Collections.sort(list);
    for (String fruit : list) {
      System.out.println(list+fruit);
    }
  }
}

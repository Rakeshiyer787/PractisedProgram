package Arrays;

import java.util.ArrayList;

public class Array_list2 {
    public static void main(String args[]){
      ArrayList<String> list=new ArrayList<String>();
      list.add("Mango");
      list.add("Apple");
      list.add("Banana");
      list.add("Grapes");
      System.out.println(list);
      System.out.println("Retuning element: "+list.get(3));
      list.set(2,"Watermelon");
      System.out.println("Changing the place: "+list.get(2) + list);
      list.remove("Apple");
      System.out.println("Removing element: "+list);
      }
}


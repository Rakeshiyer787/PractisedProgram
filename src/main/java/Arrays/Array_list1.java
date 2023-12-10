package Arrays;

import java.util.ArrayList;

public class Array_list1 {
    public static void main(String args[]){
      ArrayList<String> list=new ArrayList<String>();
      list.add("Mango");
      list.add("Apple");
      list.add("Banana");
      list.add("Grapes");
      for (String fruit : list){
        System.out.println(fruit);
      }
}
}

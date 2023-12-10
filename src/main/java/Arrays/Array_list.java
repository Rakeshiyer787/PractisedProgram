package Arrays;

import java.util.ArrayList;

public class Array_list {
    public static void main(String args[]){
      ArrayList<String> list=new ArrayList<String>();
      list.add("Mango");
      list.add("Apple");
      list.add("Banana");
      list.add("Grapes");
      System.out.println(list);
      list.add(2,"Papaya");
      System.out.println(list);
      System.out.println(list.size());

}
}

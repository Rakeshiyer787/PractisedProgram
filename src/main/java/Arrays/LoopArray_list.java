package Arrays;

import java.util.ArrayList;

public class LoopArray_list {
    public static void main(String args[]){
      ArrayList<String> list=new ArrayList<String>();
      list.add("Mango");
      list.add("Apple");
      list.add("Banana");
      list.add("Grapes");
      System.out.println(list);
      for (int i=0;i<list.size();i++){
        System.out.println(list.get(i));
      }

}
}

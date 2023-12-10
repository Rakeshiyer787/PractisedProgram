package Arrays;

public class Index {
    public static void main(String[] args) {
        String names[]={"Rahul","Suresh","Moolya","Manchu"};
        System.out.println(names[2]);

        names[2]="Software";
        System.out.println(names[2]);

       String array[]= new String[4];
        array[0]="Iam learning comunication skills";
        array[1]="It will help u";
        array[2]="Programing language is easy";
        array[3]="It will help u";
        System.out.println(array[4]);

        for (String i : names){
            System.out.println(i);


        }



    }
}

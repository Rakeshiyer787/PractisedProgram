package Array2d;

public class dimensional_array {
    /*Multidimensional arrays are useful when you want to store data as
    a tabular form, like a table with rows and columns.*/
    public static void main(String[] args) {
       String names [][]= new String[3][3];

       names[0][0]= "Sharath";
       names[0][1]= "RaghuRaj";
       names[0][2]= "Murthy";

        names[1][0]= "Rakesh";
        names[1][1]= "Kishen";
        names[1][2]= "Lohith";

        names[2][0]= "Moith";
        names[2][1]= "Suresh";
        names[2][2]= "Ramesh";

        for (int i=0;i<names.length;i++){
            for (int j=0; j<names[i].length;j++){
                System.out.println(names[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

package Day2;

public class Split {
    public static void main(String[] args) {
        String text = "Hello, world!";
        String[] words = text.split(" ");
        for (String word : words) {
        System.out.println(word);
        }
    }
}


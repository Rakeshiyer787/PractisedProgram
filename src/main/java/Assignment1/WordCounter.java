package Assignment1;

public class WordCounter {
    public static void main(String[] args) {
        String name = "w3resource";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("String name " +name);
        System.out.println("Number of Vowels "+count);
    }
}

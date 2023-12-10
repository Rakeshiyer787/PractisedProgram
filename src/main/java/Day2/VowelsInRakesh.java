package Day2;

import java.util.HashSet;

public class VowelsInRakesh {

        public static void main(String[] args) {
            String name = "Rakesh iyer";
            HashSet<Character> vowels = new HashSet<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');

            int vowelCount = 0;
            for (char c : name.toCharArray()) {
                if (vowels.contains(c)) {
                    vowelCount++;
                    System.out.println(c);
                }
            }

            System.out.println("The number of vowels in Rakesh is: " + vowelCount);


        }
    }



public class VowelConsonantCounter {
    public static void main(String[] args) {
        String word="Salam";
        countVowelsAndConsonants(word);
    }
    public static void countVowelsAndConsonants(String word) {
        int vowels = 0;
        int consonants = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else consonants++;
            }
        }
        System.out.printf("Vowels: " + vowels + ", Consonants: " + consonants);

    }}
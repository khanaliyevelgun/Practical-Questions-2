import java.util.stream.Stream;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence="Hello i am a java backend developer";
        System.out.println(reverseWordsInASentence(sentence));
    }
    public static String reverseWordsInASentence(String sentence){
        String[] words = new String[50];
        int wordCount=0;
        StringBuilder currentWord=new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch)){
                currentWord.append(ch);
            } else if (!currentWord.isEmpty()) {
                words[wordCount]=currentWord.toString();
                wordCount++;
                currentWord.setLength(0);
            }
        }
        if (currentWord.length()>0){
            words[wordCount++] = currentWord.toString();
        }
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = wordCount-1; i >=0; i--) {
            reversedSentence.append(words[i]);
            if (i>0){
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();


    }
}

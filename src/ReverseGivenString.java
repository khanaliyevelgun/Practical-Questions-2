public class ReverseGivenString {
    public static void main(String[] args) {
        String word="Salam";
        String output= reverseGivenString(word);
        System.out.println(output);
    }
    public static String reverseGivenString(String word){
        StringBuilder reversedWord=new StringBuilder();
        for (int i=word.length()-1;i>=0;i--){
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }
}

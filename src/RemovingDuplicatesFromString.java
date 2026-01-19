public class RemovingDuplicatesFromString {
    public static void main(String[] args) {
        String word="Almmam";
        System.out.println(removeDuplicatesFromString(word));
    }
    public static String removeDuplicatesFromString(String word){
        word=word.toLowerCase();
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar=word.charAt(i);
            if (result.indexOf(String.valueOf(currentChar))==-1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}

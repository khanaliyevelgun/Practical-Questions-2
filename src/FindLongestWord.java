public class FindLongestWord {
    public static void main(String[] args) {
        String sentence="Hey, i wanna become a software developer";
        System.out.println(longestWord(sentence));
    }
    public static String longestWord(String sentence){
        String longest="";
        String currentWord="";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                currentWord+=ch;
            }
            else {
                if (currentWord.length() >longest.length()){
                    longest=currentWord;
                }
                currentWord="";
            }
        }
        if (currentWord.length()>longest.length()){
            longest=currentWord;
        }
        return longest;
    }
}

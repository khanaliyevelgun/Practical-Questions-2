public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String sentence="i hope to get a software developer job";
        System.out.println(capitalizeWords(sentence));
    }
    public static String capitalizeWords(String sentence){
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar=sentence.charAt(i);
            if (i==0 || sentence.charAt(i-1)==' '){
                result.append(Character.toUpperCase(currentChar));
            }
            else result.append(currentChar);
        }
        return result.toString();
    }
}

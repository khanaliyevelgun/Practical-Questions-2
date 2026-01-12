public class StringRotation {
    public static void main(String[] args) {
        String word1="Alma";//almaalma -> maal
        String word2="maal";
        System.out.println(stringsBeingRotations(word1,word2));
    }
    public static boolean stringsBeingRotations(String word1,String word2){
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        if (word1.length()==word2.length() && !word1.isEmpty()){
            String combination = word1 + word1;
            return combination.contains(word2);
        }
        return false;
    }
}

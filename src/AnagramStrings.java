import java.util.HashMap;

public class AnagramStrings {
    public static void main(String[] args) {
        String word1="Elgun";
        String word2="Gunel";
        System.out.println(checkAnagram(word1,word2));


    }
    public static boolean checkAnagram(String word1,String word2){
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();

        for (int i = 0; i < word1.length(); i++) {
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
        }
        for (int i = 0; i < word2.length(); i++) {
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
        }
        return map1.equals(map2);
    }

}

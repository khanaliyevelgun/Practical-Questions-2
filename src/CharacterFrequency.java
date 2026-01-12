import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String word="Salam";
        checkFrequency(word);


    }
    public static void checkFrequency(String word){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }
            else map.put(ch,1);
        }
        for (Character ch : map.keySet()){
            System.out.println(ch + " : " + map
                    .get(ch));
        }
    }
}



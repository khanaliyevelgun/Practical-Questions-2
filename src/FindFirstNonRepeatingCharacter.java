import java.util.HashMap;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String word="aSalam";
         Character result=findCharacter(word);
        System.out.println(result);

    }
    public static Character findCharacter(String word){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }
            else map.put(ch,1);
        }
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            if (map.get(ch)==1){
                return ch;
            }
        }
        return '_';
    }
}




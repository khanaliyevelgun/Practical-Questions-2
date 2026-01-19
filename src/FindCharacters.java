import java.util.HashMap;

public class FindCharacters {
    public static void main(String[] args) {
        String word="Hhelloo";
        findDuplicateCharacters(word);
    }
    public static void findDuplicateCharacters(String word){
        word=word.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean found = false;
        for (char letter : map.keySet()){
            int count = map.get(letter);
            if (count==2){
                System.out.println(letter + ": appears 2 times");
                found=true;
            }

        }
        if (!found){
            System.out.println("No duplicated letters");
        }

    }
}

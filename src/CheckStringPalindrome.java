public class CheckStringPalindrome {
    public static void main(String[] args) {
        String word="Abba";
        checkStringPalindrome(word);

    }
    public static boolean checkStringPalindrome(String word){
        if (word.equals(null)){
            return false;
        }
        String newWord=word.toLowerCase();
        int left=0;
        int right=newWord.length()-1;
        while (left<right){
            if (newWord.charAt(left)!=newWord.charAt(right)){
                System.out.println("Not Palindrome");
                return false;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");
        return true;
    }

}

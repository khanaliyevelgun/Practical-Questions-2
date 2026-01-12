public class ReplaceSubstring {
    public static void main(String[] args) {
        String original="I like Java. Java is powerful. Java is fast";
        String target="Java";
        String replacement = "Spring";
        System.out.println(replaceSubstring(original,target,replacement));

    }
    public static String replaceSubstring(String original,String target,String replacement){
         if (original==null || target==null || replacement==null){
             throw new IllegalArgumentException("Arguments can not be null");
         }
         if (target.isEmpty()){
             return original;
         }
         StringBuilder result = new StringBuilder();
         int startingIndex=0;
         int targetLength=target.length();
         while(startingIndex<original.length()){
             int foundIndex=original.indexOf(target,startingIndex);
             if (foundIndex==-1){
                 result.append(original.substring(startingIndex));
                 break;
             }
             result.append(original.substring(startingIndex,foundIndex));
             result.append(replacement);
             startingIndex=foundIndex+targetLength;
         }
         return result.toString();
    }

}

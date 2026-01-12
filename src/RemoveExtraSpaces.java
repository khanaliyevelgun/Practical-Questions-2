public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String string="   Salam   necesen ,      yaxsi     deyilem      ";
        System.out.println(removeSpaces(string));
    }
    public static String removeSpaces(String string){
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch != ' '){
                result.append(ch);
            } else if (result.length()>0 && result.charAt(result.length()-1) !=' ') {
                result.append(' ');
            }

        }
        if (result.length()>0 && result.charAt(result.length()-1)==' '){
            result.deleteCharAt(result.length()-1);
        }
        return result.toString();




    }

}

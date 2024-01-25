public class UpperCase {

    public static String to_upper_case(String str){
        StringBuilder sb = new StringBuilder("");

        //converting first char in uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        //loop for remaining characters
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));   //adding space first
                i++;        //go to after space character
                sb.append(Character.toUpperCase(str.charAt(i)));    //conversing uppercase the current char
            } else {
                sb.append(str.charAt(i));   //otherwise, add the chars
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am nagu";
        System.out.println(to_upper_case(str));
    }
}

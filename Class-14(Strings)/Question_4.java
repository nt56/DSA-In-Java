import java.util.Arrays;

public class Question_4 {
    public static void main(String[] args) {
        String s1 = "earth";
        String s2 = "heart";

        //Convert Strings to lowercase. Why? So that we don't have to check separately for lower & uppercase.
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // First check - if the lengths are the same
        if(s1.length() == s2.length()){
            // convert strings into char array
            char[] s1charArray = s1.toCharArray();
            char[] s2charArray = s2.toCharArray();

            //sort the char array
            Arrays.sort(s1charArray);
            Arrays.sort(s2charArray);

            // if the sorted char arrays are same or identical, then the strings are anagram
            boolean result = Arrays.equals(s1charArray,s2charArray);

            if(result){
                System.out.println(s1 + " and " + s2 + " are anagrams of each other.");
            } else {
                System.out.println(s1 + " and " + s2 + " are not anagrams of each other.");
            }
        }
        // case when lengths are not equal
        else {
            System.out.println(s1 + " and " + s2 + " are not anagrams of each other.");
        }
    }
}
//Determine if 2 Strings are anagrams of each other.
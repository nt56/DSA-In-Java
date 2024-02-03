public class Question_3 {

    public static int find_length(String str){
        if(str.isEmpty()){
            return 0;
        }

        return find_length(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(find_length(str));
    }
}


//Write a program to find the Length of a String using Recursion

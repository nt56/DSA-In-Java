public class Question_4 {
    public static void main(String[] args) {
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print((char)(ch | ' '));
        }
    }
}
//Convert uppercase characters to lowercase using bits.
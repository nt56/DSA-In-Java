public class Demo {

    public static void print_letters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) +" ");
        }
    }

    public static void main(String[] args) {
        String str = "nagbhushan";
        print_letters(str);
    }
}

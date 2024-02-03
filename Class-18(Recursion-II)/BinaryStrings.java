public class BinaryStrings {

    public static  void print_binary_string(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        print_binary_string(n-1,0,str+"0");

        if(lastPlace == 0){
            print_binary_string(n-1,1,str+"1");
        }
    }

    public static void main(String[] args) {
        print_binary_string(3,0,"");
    }
}

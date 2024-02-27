public class PrintSubstrings {

    public static void print_substring(String str, int start){
        if(start == str.length()){
            return;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=start; i<str.length(); i++){
            sb.append(str.charAt(i));
            System.out.print(sb +" ");
        }

        print_substring(str,start+1);
    }

    public static void main(String[] args) {
        print_substring("hello",0);
    }
}

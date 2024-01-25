public class Compression {

//    public static String compress(String str){
//        String newString = "";
//
//        for(int i=0; i<str.length(); i++){
//            Integer count = 0;
//
//            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                count++;
//                i++;
//            }
//
//            newString += str.charAt(i);
//
//            if(count > 1){
//                newString += count.toString();
//            }
//        }
//
//        return newString;
//    }

    public static String compress(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            int count = 0;

            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }

            sb.append(str.charAt(i));

            if(count >= 1){
                sb.append(Integer.toString(count));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbccccdddd";
        System.out.println(compress(str));
    }
}

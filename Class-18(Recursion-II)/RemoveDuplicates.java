public class RemoveDuplicates {

    public static void remove_duplicate(String str, int i, StringBuilder newStr, boolean[] map){
        if(i==str.length()){
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(i);

        if(map[ch - 'a']){
            //duplicate
            remove_duplicate(str,i+1,newStr,map);
        } else {
            map[ch-'a'] = true;
            remove_duplicate(str,i+1,newStr.append(ch),map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        remove_duplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
}

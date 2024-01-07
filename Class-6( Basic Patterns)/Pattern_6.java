public class Pattern_6 {
    public static void main(String[] args) {

        int r = 4;

        for(int i=1; i<=r; i++){
            for(int j=1; j<=r; j++){
                if(i==1 || i==r || j==1 || j==r){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


//public class Pattern_6 {
//    public static void main(String[] args) {
//
//        int r = 4;
//
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=r; j++){
//                if(i==1 || i==r || j==1 || j==r){
//                    System.out.print(" * ");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//* * * * *
//*       *
//*       *
//* * * * *
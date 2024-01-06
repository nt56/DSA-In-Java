public class Pattern_2 {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){      //(5-1+1)=5star -->(5-2+1)=4star -->(5-3+1)=3star -->(5-4+1)=2star -->(5-5+1)=1star
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


//public class Pattern_2 {
//    public static void main(String[] args) {
//        int n = 5;
//
//        for(int i=1; i<=n; i++){
//            for(int j=n; j>=i; j--){      //(5-1+1)=5star -->(5-2+1)=4star -->(5-3+1)=3star -->(5-4+1)=2star -->(5-5+1)=1star
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//}



//*****
//****
//***
//**
//*
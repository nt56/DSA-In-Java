public class friendsPairing {

    public static int friends_pair(int n){
        if(n==0 || n==1){
            return n;
        }

//        //single
//        int fnm1 = friends_pair(n-1);
//
//        //pair
//        int fnm2 = friends_pair(n-2);
//        int pairWays = (n-1) * fnm2;
//
//        //total ways
//        return fnm1 + pairWays;

        return friends_pair(n-1) + (n-1) * friends_pair(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friends_pair(5));
    }
}

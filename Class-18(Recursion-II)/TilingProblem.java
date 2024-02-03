public class TilingProblem {

    //2 X n (Floor size)
    public static int tiling_problem(int n){
        if(n==0 || n==1){
            return 1;
        }

        //vertical choice
//        int fnm1 = tiling_problem(n-1);
//
//        //horizontal choice
//        int fnm2 = tiling_problem(n-2);
//
//        int totalWays = fnm1+fnm2;
//        return totalWays;

        return tiling_problem(n-1) + tiling_problem(n-2);
    }


    public static void main(String[] args) {
        System.out.println(tiling_problem(4));
    }
}

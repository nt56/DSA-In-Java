public class Pattern_4 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}


//54321
//4321
//321
//21
//1
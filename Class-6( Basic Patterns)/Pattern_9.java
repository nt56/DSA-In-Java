public class Pattern_9 {
    public static void main(String[] args) {
        int n=4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n*2); j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                } else {
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
}

//12121212
//12121212
//12121212
//12121212

public class DecimalToBinary {

    public static void decToBin(int dec){
        int d = dec;
        int p = 0;
        int bin = 0;

        while(dec > 0){
            int rem = dec % 2;
            bin = bin + (rem * (int) Math.pow(10,p));
            p++;
            dec = dec / 2;
        }

        System.out.println("Binary of " +d+ " is : " +bin);
    }

    public static void main(String[] args) {
        decToBin(10);
    }
}

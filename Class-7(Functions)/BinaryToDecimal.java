public class BinaryToDecimal {

    public static void binToDec(int bin){
        int b = bin;
        int p = 0;
        int dec = 0;

        while(bin > 0){
            int ld = bin % 10;
            dec = dec + (ld * (int) Math.pow(2,p));
            p++;
            bin = bin / 10;
        }

        System.out.println("Decimal of " +b+ " is : " +dec);
    }

    public static void main(String[] args) {
        binToDec(1111);
    }
}

import java.util.Scanner;

public class Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cost Of Pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Cost Of Pen : ");
        float pen = sc.nextFloat();
        System.out.print("Cost Of Eraser : ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Cost without GST : " +total);

        float newTotal = total + (0.18f * total);
        System.out.println("Cost with GST : " +newTotal);
    }
}

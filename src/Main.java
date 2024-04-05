import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kenar1,kenar2,kenar3;
        int u;
        int alan;

        System.out.print("1. kenar: ");
        kenar1 = scan.nextInt();
        System.out.print("2. kenar: ");
        kenar2 = scan.nextInt();
        System.out.print("3. kenar:  ");
        kenar3 = scan.nextInt();
        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = (int) Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Üçgenin alanı = " + alan);
    }
}

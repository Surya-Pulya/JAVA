import java.util.Scanner;
public class P11 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Month ");
        int m = num.nextInt();
        System.out.println("Enter Day ");
        int d = num.nextInt();
        System.out.println("Enter Year ");
        int y = num.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println(d0);
}
}

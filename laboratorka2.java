import java.util.Scanner;

public class laboratorka2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.println("\n №1");
        System.out.print("Введите значение x: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите значение a: ");
        double a1 = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b1 = scanner.nextDouble();

        double y1;
        if (x1 <= 3) {
            y1 = b1 + 2 * Math.log(Math.abs(x1));
        } else {
            y1 = (x1 * x1) / (x1 * x1 + a1);
        }
        System.out.println("Итого: y = " + y1);

        // 2
        System.out.println("\n №2");
        System.out.print("Введите значение x: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b2 = scanner.nextDouble();

        double y2;
        if (x2 > 0) {
            y2 = 1 / (Math.exp(-x2) + 2);
        } else {
            y2 = Math.cos(b2 * x2 + 1);
        }
        System.out.println("Итого: y = " + y2);

        // 3
        System.out.println("\n №3");
        System.out.print("Введите значение x: ");
        double x3 = scanner.nextDouble();
        System.out.print("Введите значение a: ");
        double a3 = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b3 = scanner.nextDouble();

        double y3;
        if (x3 <= 1) {
            y3 = 1 / (a3 * a3 + x3 * x3);
        } else {
            y3 = b3 * Math.log(Math.abs(x3));
        }
        System.out.println("Итого: y = " + y3);
        scanner.close(); 
    }
}

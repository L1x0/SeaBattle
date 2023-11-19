import java.util.Scanner;

public class Ship {
    protected int length;
    protected int rows, columns;
    protected String vector;

    Ship(int length) {
        Scanner scanner = new Scanner(System.in);

        if (length > 1) {

            System.out.print("\nДлина коробля равна: " + length);
            this.length = length;

            System.out.print("\nВведите одну,левую крайнюю или нижнюю крайнюю, координату (x;y)");
            columns = scanner.nextInt();
            rows = scanner.nextInt();

            System.out.print("\nВВедите направление коробля(right, up): ");
            vector = scanner.next();
        } else {
            vector = "one";

            System.out.print("\nДлина коробля равна: " + length);
            this.length = length;

            System.out.print("\nВведите координату (x;y)");
            columns = scanner.nextInt();
            rows = scanner.nextInt();
        }
    }
}

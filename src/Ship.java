import java.util.Scanner;

public class Ship {
    protected int length;
    protected int rows, columns;
    int choise;
    protected String vector;

    Ship(int length) {
        Scanner scanner = new Scanner(System.in);

        if (length > 1) {

            System.out.print("\nДлина коробля равна: " + length);
            this.length = length;

            System.out.print("\nВведите одну,левую крайнюю или нижнюю крайнюю, координату (x;y)");
            columns = scanner.nextInt();
            rows = scanner.nextInt();

            System.out.print("\nВВедите направление коробля(1 - right, 2 - up): ");
            boolean temp = false;
            loop: while (true) {
                choise = scanner.nextInt();

                switch (choise) {
                    case 1:
                        vector = "right";
                        temp = true;
                        break loop;
                    case 2:
                        vector = "up";
                        temp = true;
                        break loop;
                    default:
                        System.out.println("Вы ввели неправильное число! Введите заново");
                        break;
                }

            }
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

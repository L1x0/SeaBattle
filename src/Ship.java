import java.util.Scanner;

public class Ship {
    protected int length;


    Ship() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер корабля: ");
        length = scanner.nextInt();
        System.out.println("");
        System.out.print("Введите первую одну координату");
    }
}

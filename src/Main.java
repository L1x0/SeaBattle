import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstPlayerName, secondPlayerName;

        System.out.println("Первыйй игрок, введите свой ник: ");
        firstPlayerName = sc.nextLine();
        System.out.println("\nВторой игрок, введите свой ник: ");
        secondPlayerName = sc.nextLine();

        Sea firstPlayerOwnSea = new Sea();
        Sea firstPlayerTargetSea = new Sea();
        Sea secondPlayerOwnSea = new Sea();
        Sea secondPlayerTargetSea = new Sea();

        System.out.println("Игрок " + firstPlayerName + ", задайте свои корабли: ");
        firstPlayerOwnSea.addShip(4);
        firstPlayerOwnSea.addShip(3);
        firstPlayerOwnSea.addShip(3);
        firstPlayerOwnSea.addShip(2);
        firstPlayerOwnSea.addShip(2);
        firstPlayerOwnSea.addShip(2);
        firstPlayerOwnSea.addShip(1);
        firstPlayerOwnSea.addShip(1);
        firstPlayerOwnSea.addShip(1);
        firstPlayerOwnSea.addShip(1);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println("Игрок " + secondPlayerName + ", задайте свои корабли: ");
        secondPlayerOwnSea.addShip(4);
        secondPlayerOwnSea.addShip(3);
        secondPlayerOwnSea.addShip(3);
        secondPlayerOwnSea.addShip(2);
        secondPlayerOwnSea.addShip(2);
        secondPlayerOwnSea.addShip(2);
        secondPlayerOwnSea.addShip(1);
        secondPlayerOwnSea.addShip(1);
        secondPlayerOwnSea.addShip(1);
        secondPlayerOwnSea.addShip(1);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        while (!secondPlayerOwnSea.checkOfVictory() || !secondPlayerOwnSea.checkOfVictory()) {
            System.out.println(firstPlayerName);

            firstPlayerOwnSea.getSea();
            System.out.println("\n_____________________________________");
            firstPlayerTargetSea.getSea();

            Sea.attack(secondPlayerOwnSea, firstPlayerTargetSea);
            if (secondPlayerOwnSea.checkOfVictory()) {
                System.out.println("Игрок" + firstPlayerName + "победил!!!");
                break;
            }

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Передайте компьютер дргугому пользователю");
            System.out.println(secondPlayerName + " нажмите Enter");
            sc.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            System.out.println(secondPlayerName);

            secondPlayerOwnSea.getSea();
            System.out.println("\n_____________________________________");
            secondPlayerTargetSea.getSea();

            Sea.attack(firstPlayerOwnSea, secondPlayerTargetSea);

            if (firstPlayerOwnSea.checkOfVictory()) {
                System.out.println("Игрок" + secondPlayerName + "победил!!!");
                break;
            }

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Передайте компьютер дргугому пользователю");
            System.out.println(firstPlayerName + " нажмите Enter");
            sc.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
    }
}
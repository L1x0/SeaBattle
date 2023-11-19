import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Sea firstPersonSea = new Sea();

        firstPersonSea.getSea();
        firstPersonSea.addShip(4);
        firstPersonSea.addShip(3);
        firstPersonSea.addShip(3);
        firstPersonSea.addShip(2);
        firstPersonSea.addShip(2);
        firstPersonSea.addShip(2);
        firstPersonSea.addShip(1);
        firstPersonSea.addShip(1);
        firstPersonSea.addShip(1);
        firstPersonSea.addShip(1);

    }
}

/*TODO:

3) Создать принцип стрельбы
*/
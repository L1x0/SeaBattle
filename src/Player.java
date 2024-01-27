public class Player {
    Sea firstSea;
    Sea secondSea;
    int count = 20;
    public void Player() {
        firstSea = new Sea();
        secondSea = new Sea();
        firstSea.addShip(4);
        firstSea.addShip(3);
        firstSea.addShip(3);
        firstSea.addShip(2);
        firstSea.addShip(2);
        firstSea.addShip(2);
        firstSea.addShip(1);
        firstSea.addShip(1);
        firstSea.addShip(1);
        firstSea.addShip(1);


    }

}

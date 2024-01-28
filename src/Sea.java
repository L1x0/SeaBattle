import java.util.Arrays;
import java.util.Scanner;

public class Sea {
    private final String[][] sea = new String[10][10];

    Sea() {     //приравниваем каждый элемент к ~, как к пустому куску моря

        for (String[] e : sea) {
            Arrays.fill(e, "~");
        }
    }


    public void getSea() {      //Вывод поля
        System.out.println();

        System.out.print("   ");
        for (int i = 1; i <= 10; i++)
            System.out.print(i + " ");

        int i = 1;
        for (String[] e : sea) {
            System.out.println();
            System.out.print(i);
            if (i != 10)
                System.out.print("  ");
            else
                System.out.print(" ");
            for (String el : e) {
                System.out.print(el + " ");
            }
            i++;
        }
    }

    public void addShip(int length) {
        while (true) {
            boolean temp = false;
            int x, y, z;
            Ship ship = new Ship(length);

            if (ship.rows <= 10 && ship.rows >= 1 && ship.columns <= 10 && ship.columns >= 1) {

                if (ship.vector.equals("right")) {
                    int count = 0;

                    if (ship.rows == 1) {
                        x = 1;
                    } else {
                        x = 2;
                    }

                    if (ship.columns - 1 == 0) {
                        y = 0;
                    } else {
                        y = ship.columns - 2;
                    }

                    if (ship.columns + ship.length - 1 <= 10) { //проверка правильности координат
                        for (int i = ship.columns - 1; count < length; i++) {

                            if (i + 1 == 10) {
                                z = 9;
                            } else {
                                z = i + 1;
                            }

                            if (!sea[ship.rows - x][i].equals("~") | !sea[ship.rows == 10 ? ship.rows - 1 : ship.rows][i].equals("~")) {
                                temp = true;
                                break;
                            } else if (!sea[ship.rows - 1][y].equals("~") | !sea[ship.rows - 1][z].equals("~")) {
                                temp = true;
                                break;
                            }

                            count++;
                        }
                        count = 0;

                        if (!temp) {
                            for (int i = ship.columns - 1; count < length; i++) {
                                sea[ship.rows - 1][i] = sea[ship.rows - 1][i].replace("~", "К");
                                count++;
                            }
                            getSea();
                            break;
                        }
                    }
                    System.out.print("\nДанные введены неккоректно, введите их заново");
                }

                if (ship.vector.equals("up")) {
                    int count;
                    boolean allRight = true;

                    if (ship.rows - ship.length >= 0 && ship.rows <= 10
                            && ship.columns >= 1 && ship.columns <= 10) {
                        int posMin, posMax;
                        boolean right, left;
                        right = left = false;

                        if (ship.rows != 10) {
                            posMin = ship.rows;
                        } else {
                            posMin = ship.rows - 1;
                        }
                        if (ship.rows - 1 - ship.length >= 0) {
                            posMax = ship.rows - 1 - ship.length;
                        } else {
                            posMax = ship.rows - ship.length;
                        }
                        if (ship.columns == 1)
                            left = true;
                        else if (ship.columns == 10)
                            right = true;

                        for (int i = posMax; i <= posMin; i++) {
                            if (left && !right) {
                                if (!sea[i][ship.columns].equals("~")) {
                                    allRight = false;
                                    break;
                                }
                            }
                            if (right && !left) {
                                if (!sea[i][ship.columns - 2].equals("~")) {
                                    allRight = false;
                                    break;
                                }
                            }
                            if (!right && !left) {
                                if (!sea[i][ship.columns - 2].equals("~") || !sea[i][ship.columns + 1].equals("~")) {
                                    allRight = false;
                                    break;
                                }
                            }
                            if (!sea[i][ship.columns - 1].equals("~")) {
                                allRight = false;
                                break;
                            }
                        }
                    } else {
                        allRight = false;
                    }
                    if (allRight) {
                        count = 0;

                        for (int i = ship.rows - 1; count < ship.length; i--) {
                            sea[i][ship.columns - 1] = sea[i][ship.columns - 1].replace("~", "К");
                            count++;
                        }
                        getSea();
                        break;
                    } else {
                        System.out.println("Ваши координаты конфликтуют с расположением на поле");
                    }
                }
                if (ship.vector.equals("one")) {
                    int count, posMax, posMin;
                    boolean allRight = true;
                    boolean left, right;
                    left = right = false;

                    if (ship.rows >= 1 && ship.rows <= 10
                            && ship.columns >= 1 && ship.columns <= 10) {
                        if (ship.columns == 1)
                            left = true;
                        else if (ship.columns == 10)
                            right = true;
                        if (ship.rows > 1)
                            posMax = ship.rows - 2;
                        else posMax = 0;
                        if (ship.rows < 10)
                            posMin = ship.rows;
                        else posMin = ship.rows - 1;

                        for (int i = posMax; i <= posMin; i++) {
                            if (left) {
                                if (!sea[i][ship.columns].equals("~")) {
                                    allRight = false;
                                    break;
                                }
                            }
                            if (right) {
                                if (!sea[i][ship.columns - 2].equals("~")) {
                                    allRight = false;
                                    break;
                                }
                            }
                            if (!right && !left) {
                                if (!sea[i][ship.columns - 2].equals("~") || !sea[i][ship.columns].equals("~")) {
                                    allRight = false;
                                    break;
                                }
                            }
                            if (!sea[i][ship.columns - 1].equals("~")) {
                                allRight = false;
                                break;
                            }
                        }
                    } else {
                        allRight = false;
                    }
                    if (allRight) {
                        count = 0;

                        for (int i = ship.rows - 1; count < ship.length; i--) {
                            sea[i][ship.columns - 1] = sea[i][ship.columns - 1].replace("~", "К");
                            count++;
                        }
                        getSea();
                        break;
                    } else {
                        System.out.println("Ваши координаты конфликтуют с расположением на поле");
                    }
                }
            }
        }
    }

    public static void attack(Sea target, Sea ownSea) {
        int x, y;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nВведите пожалуйста координаты для атаки через пробел: ");
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;
            if (target.sea[x][y].equals("~")) {
                System.out.println("Вы промахнулись");
                target.sea[x][y] = target.sea[x][y].replace("~", "*");
                ownSea.sea[x][y] = ownSea.sea[x][y].replace("~", "*");
                ownSea.getSea();
                break;
            }
            if (target.sea[x][y].equals("К")) {
                System.out.println("Вы попали!");
                target.sea[x][y] = target.sea[x][y].replace("К", "П");
                ownSea.sea[x][y] = ownSea.sea[x][y].replace("~", "П");
                ownSea.getSea();
                if (target.checkOfVictory())
                    break;
            }
            if (target.sea[x][y].equals("*")) {
                System.out.println("Вы уже стреляли сюда");
            }
        }
    }

    public boolean checkOfVictory() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.sea[i][j].equals("К"))
                    return false;
            }
        }
        return true;
    }

    /*static public void stars(int x, int y, Sea target, Sea ownSea) {
        int xMin, yMin, xMax, yMax, x1Min, y1Min, x1Max, y1Max;
        boolean check = true;
        while (true) {
            if (x == 1)
                xMin = 1;
            else
                xMin = x - 1;

            if (x == 10)
                xMax = 10;
            else
                xMax = x + 1;

            if (y == 1)
                yMin = 1;
            else
                yMin = y - 1;

            if (y == 10)
                yMax = 10;
            else
                yMax = y + 1;

            for (int i = xMin; i <= xMax; i++) {
                for (int j = yMin; j <= yMax; j++) {
                    if (target.sea[i][j].equals("К")) {
                        check = false;
                        break;
                    }

                }

            for (int i = xMin; i <= xMax; i++) {
                for (int j = yMin; j <= yMax; j++) {
                    if (target.sea[i][j].equals("К")) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                for (int i = xMin; i <= xMax; i++) {
                    for (int j = yMin; j <= yMax; j++) {
                        if (i == x && j == y) {
                            ownSea.sea[i][j] = ownSea.sea[i][j].replace("~", "*");
                            continue;
                        } else {
                            ownSea.sea[i][j] = ownSea.sea[i][j].replace("~", "*");
                            target.sea[i][j] = target.sea[i][j].replace("~", "*");
                        }
                    }
                }
            }
        }
    }*/
}


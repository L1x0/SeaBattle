import java.util.Arrays;
public class Sea {
    private String[][] sea = new String[10][10];

    Sea() {     //приравниваем каждый элемент к _, как к пустому куску моря

        for (String[] e : sea) {
            Arrays.fill(e, "m");
        }
    }

    public void getSea() {//Вывод поля
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
}

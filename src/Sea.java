public class Sea {
    private char[][] sea = new char[10][10];

    Sea() {     //приравниваем каждый элемент к _, как к пустому куску моря

        for(char[] e : sea) {
            for(char el : e){
                el = '_';
            }
        }
    }

    public void getSea() {    //Вывод поля
        System.out.println("");
        for(char[] e : sea) {
            for(char el : e){
                System.out.print(el);
            }
        }
    }
}

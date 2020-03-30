package src;

import java.util.Scanner;

public class Main {

//1. Необходимо вывести последовательность: 3 9 15 21 27 33 39 45 51 57 63 69 (сделать через do/while и for)

    public static void main(String[] args) {

        doWhile();
        forMethod();
        //pyramide();
        grade();
        shopping();
    }

    public static void doWhile() {
        int i = 0;
        do {
            i = i + 3;
            System.out.print(i + " ");
        } while (i < 69);

        System.out.println();

    }

    public static void forMethod() {
        for (int i = 3; i <= 69; i = i + 3) {
            System.out.print(i + " ");
        }

        System.out.println();

    }

    /*2. a) Вывести последовательность:
     *
     **
     ***
     ****
    */
    /*public static void pyramide() {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" *");
            }
            System.out.println();
            System.out.print(" *" + " ");
            System.out.println(" *" + " *" + " ");
        }
    }
    */

    /*
    A) Универы выставляют оценки по такой шкале
    a. Ниже 25 - F
    b. 25 to 45 - E
    c. 45 to 50 - D
    d. 50 to 60 - C
    e. 60 to 80 - B
    f. Выше 80 - A
    Введите оценку и распечатайте ее grade (A, B. F …)*/

    public static void grade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of your grade:");

        int number = sc.nextInt();
        char symbol = ' ';

        if (number >= 80) {
            symbol = 'A';
        } else if (number >= 60) {
            symbol = 'B';
        } else if (number >= 50) {
            symbol = 'C';
        } else if (number >= 45) {
            symbol = 'D';
        } else if (number >= 25) {
            symbol = 'E';
        } else {
            symbol = 'F';
        }

        System.out.println("You've received " + number + " " + symbol);
    }

    /*
    3. Вы заходите в атб и у вас 200 грн.
         - вы набираете товар на 202 грн, и тогда выводе “не хватает 2 grn”,
         - вы набираете продуктов на 200 грн и в выводе "счастливчик",
         - набираете продуктов на 100 грн  и выводе "пойду возьму еще что то"
         - вводите другое число и выводите "что то пошло не так"
         Использовать оператор Switch, должно выводиться на экран только 1 сообщение,
         если нет совпадений, то сообщение по дефолту.
    */

    public static void shopping() {
        int shopping = 200;
        String shoppingString;
        switch (shopping) {
            case 202:
                shoppingString = "Не хватает 2 grn";
                break;
            case 200:
                shoppingString = "Счастливчик";
                break;
            case 100:
                shoppingString = "Пойду возьму еще что то";
                break;
            case 5:
                shoppingString = "Что-то пошло не так";
                break;
            default:
                shoppingString = "Попробуйте позже";
        }
        System.out.print(shoppingString);
    }
}
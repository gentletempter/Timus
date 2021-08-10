/*В первой строке записано целое число n — количество записей в блокноте (1 ≤ n ≤ 1000).
В каждой из следующих n строк записано по одному виду пингвинов.
Среди видов встречаются только «Emperor Penguin», «Little Penguin» и «Macaroni Penguin».
Выведите самый популярный вид пингвинов. Гарантируется, что такой вид только один.*/

import java.util.Scanner;

public class Task1585 {
    public static void main(String[] args) {
        short countOfEmperorPenguins = 0;
        short countOfLittlePenguins = 0;
        short countOfMacaroniPenguins = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 1; i <= n; i++) {
            switch (in.nextLine()) {
                case "Emperor Penguin":
                    countOfEmperorPenguins++;
                    break;
                case "Little Penguin":
                    countOfLittlePenguins++;
                    break;
                case "Macaroni Penguin":
                    countOfMacaroniPenguins++;
                    break;
            }
        }
        getMostPopularPenguin(countOfEmperorPenguins, countOfLittlePenguins, countOfMacaroniPenguins);
    }

    static void getMostPopularPenguin(short countOfEmperorPenguins, short countOfLittlePenguins, short countOfMacaroniPenguins) {
        if (countOfEmperorPenguins >= countOfLittlePenguins && countOfEmperorPenguins >= countOfMacaroniPenguins) {
            System.out.println("Emperor Penguin");
        } else if (countOfLittlePenguins >= countOfEmperorPenguins && countOfLittlePenguins >= countOfMacaroniPenguins) {
            System.out.println("Little Penguin");
        } else if (countOfMacaroniPenguins >= countOfLittlePenguins && countOfMacaroniPenguins >= countOfEmperorPenguins) {
            System.out.println("Macaroni Penguin");
        }
    }
}

import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        do {
            int count = 0;
            int guess = -1;
            int number = random.nextInt(10);
            while (count < 3 && guess != number) {
                System.out.print("Угадайте число от 1 до 10: ");
                guess = scanner.nextInt();
                if (number != guess) {
                    System.out.println("Ваше число " +
                            ((guess > number)? "больше " : "меньше "));
                    count++;
                }
            }
            System.out.println("Вы " +
                    ((guess == number)? "угадали!" : "проиграли: " + number));//comment



            System.out.println("Повторить игру? Да - 1, Нет - 0");
        }
            while (scanner.nextInt() == 1);
    }
}
import java.io.IOException;
import java.util.Scanner;

public class While8 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        while (count < 10) {
            count++;
            /*
            Если остаток от деления count !=0 (нечетное число)
            то continue - идем в начало while (итерация+1)
            Если четное число, то выполняется код после continue
            выводим на консоль значение count
            */
            if((count%2) != 0) continue;
            System.out.println("Сейчас число четное = " + count);
        }
        if(count == 10) {
            System.out.println("Это последняя станция " + count); }
        else if(count > 10) {
            System.out.println("Вы ввели большое число, прощайте"); }
    }
}
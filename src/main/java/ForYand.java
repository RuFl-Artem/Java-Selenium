import java.io.IOException;
import java.util.Scanner;

public class ForYand {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int freeHours = scanner.nextInt();
        checkReading(freeHours);
    }
    public static void checkReading(int freeHours) {
        if (freeHours >= 2) {
            for (int i = 1; i < 4; i++) {
                System.out.println("Прочитал " + i + "-ю главу");
            }
        } else {
            System.out.println("Не в этот раз");
        }
    }
}

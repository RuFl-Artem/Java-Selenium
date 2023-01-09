import java.io.IOException;
import java.util.Scanner;

public class switch6 {
    public static void main (String[] args) throws IOException {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String monthString;
        switch (month) {
            case 1: monthString = "Январь";
                break;
            case 2: monthString = "Февраль";
                break;
            case 3: monthString = "Март";
                break;
            case 4: monthString = "Апрель";
                break;
            case 5: monthString = "Май";
                break;
            case 6: monthString = "Июнь";
                break;
            default: monthString = "Не знаю таких";
                break;
        }
        System.out.println(monthString);
    }
}

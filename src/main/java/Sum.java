import java.io.IOException;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        short vvod1 = scanner.nextShort();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        short vvod2 = scanner2.nextShort();
        System.out.println(vvod1 + vvod2);
    }
}

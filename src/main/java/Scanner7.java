import java.util.Scanner;

public class Scanner7 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.print("Вы ввели число: "+ number);
    }
}

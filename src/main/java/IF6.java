import java.io.IOException;

public class IF6 {
    public static void main (String[] args) throws IOException {
        char ch;
        char answer = 'O';
        System.out.println("Какую букву я загадал?");
        System.out.print("Попытайся отгадать: ");
        ch = (char)System.in.read();
        if (ch == answer) {
            System.out.print("Поздравляю, угадал!");
        } else if (ch > answer) {
            System.out.print("Неа, слишком большое");
        }
        else {
            System.out.print("Нуу, маловато будет");
        }
    }

}

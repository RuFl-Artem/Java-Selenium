import java.util.Arrays;

public class MassivYand {
    public static void main(String[] args) {
        //Объявляем массив длинной 7
        int[] waterConsumption = new int[7];
        //Переменная со значением 1200
        int dailyConsumption = 1200;
        for (int i = 0; i < waterConsumption.length; i++) {
            //в массив записываем значение переменной с индекса i
            waterConsumption[i] = dailyConsumption;
            dailyConsumption = dailyConsumption + 100;
        }
        //Вывести элементы массива через строку
        System.out.println("Ошибок нет " + dailyConsumption + " " + Arrays.toString(waterConsumption));
        //Вывести элементы массива через цикл for
        for (int i = 0; i < waterConsumption.length; i++) {
            System.out.print(" Вывожу через for " + waterConsumption[i]);
        }
    }
}

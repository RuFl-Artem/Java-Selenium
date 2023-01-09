import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Date;

import static java.lang.System.out;

public class Random10 {
    public static void main(String[] args) {
        //Генерируем дробное число
        double numD = Math.random();
        out.println(numD);
        //Генерируем дробное *100
        double numD1 = (Math.random() * 100);
        out.println(numD1);
        //Генерируем целое число
        int numInt = (int)(Math.random() * 100);
        //Генерируем с текущей датой и временем
        Date date = new Date();
        out.println(date + " а число " + numInt);
        //Генерируем целое число через класс random от 0 до 500
        Random random = new Random();
        int numIntRand = random.nextInt(500);
        //Генерируем с текущей датой и временем в настроенном формате
        SimpleDateFormat formaterDate1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        out.println(formaterDate1.format(date));
        SimpleDateFormat formaterDate2 = new SimpleDateFormat("dd-MMMM-y G");
        out.println(formaterDate2.format(date));
    }
}

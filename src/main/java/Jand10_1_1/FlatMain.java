package Jand10_1_1;

public class FlatMain {
    int number;
    double area;
    int roomCount;
    //статическая переменная что бы инкрементировалась при использовании конструктора
    public static int numberOfFlats;
    static String company; // статическая переменная — управляющая компания
    // конструктор квартиры с изменяющимися полями в качестве параметров;
    // они разные у каждой квартиры
    public FlatMain(int number, double area, int roomCount) {
    this.number = number;
    this.area = area;
    this.roomCount = roomCount;
    numberOfFlats++;
    }
    void getFlat(){
        System.out.println(numberOfFlats + " Номер " + this.number + " Площадь " + this.area + " Комнаты " + this.roomCount + " УК " + company);
    }
}

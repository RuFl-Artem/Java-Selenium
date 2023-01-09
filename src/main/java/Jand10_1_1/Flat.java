package Jand10_1_1;
public class Flat {
    public static void main(String[] args) {
        FlatMain flat1 = new FlatMain(4, 56.5, 2); // создаём первую квартиру
        flat1.company = "ПИК"; // устанавливаем компанию для первой квартиры
        flat1.getFlat();
        FlatMain flat2 = new FlatMain(7, 81.6, 3); // создаём вторую квартиру
        flat2.getFlat();
        FlatMain flat3 = new FlatMain(66, 17.0, 7); // создаём третью квартиру
        flat3.getFlat();
    }
}

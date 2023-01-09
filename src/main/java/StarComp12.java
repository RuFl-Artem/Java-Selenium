public class StarComp12 {

    public static void main(String[] args) {
        Computer apple = new Computer(2400, 1300, "Macintosh");
        Computer ibm = new Computer(2200, 1867, "IBM-1");
        Computer lenovo = new Computer(2200, 1600, "Lenovo_2202");
        Computer huawei = new Computer(2500, 1666, "Oppo-x3");
        apple.getCpu();
        apple.getName();

        ibm.getCpu();
        ibm.getName();

        lenovo.getRam();
        lenovo.getName();

        huawei.getRam();
        huawei.getCpu();
        huawei.getName();

        Computer googl = new Computer(-1080, 200, "Googl");
        googl.getRam();
        googl.getCpu();
        googl.getName();
        //Используем пустой конструктор
        Computer ramG = new Computer();
        //Пробуем записать отрицательное значение в Ram
        ramG.setRam2(-20);
        ramG.setName("ramG");
        ramG.getName();
        ramG.getRam();
        ramG.setRam2(200);
        ramG.getRam();
        //Используем пустой конструктор
        Computer ramPolozh = new Computer();
        ramPolozh.setRam(-555);
        ramPolozh.getRam();

    }
}

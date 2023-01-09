public class Computer {
    private int ram;
    private int cpu;
    private String name;
    Computer() {};
    Computer(int ram, int cpu, String name) {
        this.ram = ram;
        this.cpu = cpu;
        this.name = name;
    }
    void getRam(){
        System.out.println("RAM " + ram);
    }
    void getCpu(){
        System.out.println("CPU "+cpu);
    }
    void getName(){
        System.out.println(name);
    }
    void setRam(int r){
        ram = r;
    }
    void setCpu(int c){
        cpu = c;
    }
    void setName(String n){
        name = n;
    }
    int getRam2(){
        return ram;
    }
    //Даем возможность записывать положительные значения в Ram
    public void setRam2(int newRam2) {
        if (newRam2 >= 0) {
            ram = newRam2;
        }
    }
}


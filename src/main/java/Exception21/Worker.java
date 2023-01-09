package Exception21;

public class Worker {
    String name;
    boolean isAtWork, isSober;

    void atWork() {
        isAtWork = true;
    }

    void sober() {
        isSober = true;
    }

    void work() throws WorkerIsNotReadyException {
        if (isAtWork && isSober) {
            System.out.println("Можно работать ");
        } else {
            throw new WorkerIsNotReadyException("Работник не готов");
        }
    }
    public Worker (String name) {
        this.name = name;
    }
}

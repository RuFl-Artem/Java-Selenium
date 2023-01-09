package Exception21;

public class App {
    public static void main(String[] args) {
        Worker worker = new Worker("IIgor");
        worker.atWork();

        try {
            worker.work();
        } catch (WorkerIsNotReadyException e) {
            e.printStackTrace();
        }
    }
}

public class NewWorker extends Worker{
    public NewWorker(int salary, int shift) {
        super(salary, shift);
    }
    public void New(){
        System.out.println("Customer was served by a new worker!");
    }
}

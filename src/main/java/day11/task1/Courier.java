package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;


    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Курьер:" + "\n" +
                "Зарплата - " + salary + "\n" +
                "Бонус - " + isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.increaseDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += 50000;
        isPayed = true;
    }
}

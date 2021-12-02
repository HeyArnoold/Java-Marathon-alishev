package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Склад:" + "\n" +
                "Кол-во собраных заказов - " + countPickedOrders + "\n" +
                "Кол-во доставленных заказов - " + countDeliveredOrders;
    }

    public void increasePickedOrders() {
        countPickedOrders++;
    }

    public void increaseDeliveredOrders() {
        countDeliveredOrders++;
    }
}

package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public List<Order> restaurantOrder = new ArrayList<>();

    public static void main(String[] args) {

        Main main = new Main();

        Item hamburger = new Item("Hamburger", 149);
        Item sausage = new Item("Klobása", 79);
        Item bread = new Item("Chleba", 5);
        Item roll = new Item("Rohlík", 5);
        Item pizza = new Item("Pizza", 99);

        Item beer = new Item("Pivo", 45);
        Item coke = new Item("Coca-cola", 29);
        Item wine = new Item("Víno", 59);
        Item juice = new Item("Džus", 39);

        List<Item> orderList1 = new ArrayList<>();
        orderList1.add(hamburger);
        orderList1.add(beer);

        List<Item> orderList2 = new ArrayList<>();
        orderList2.add(sausage);
        orderList2.add(roll);
        orderList2.add(roll);
        orderList2.add(beer);
        orderList2.add(beer);

        Order order1 = new Order(1, Table.TABLE_1, LocalDate.now(), Payment.CASH, orderList1);
        Order order2 = new Order(2, Table.TABLE_3, LocalDate.now(), Payment.CARD, orderList2);

        main.restaurantOrder.add(order1);
        main.restaurantOrder.add(order2);

//        System.out.println(main.howManyOrders());
//        System.out.println(main.totalSpent());
//        System.out.println(main.totalSpentOfTable(Table.TABLE_5));
//        System.out.println(main.totalSpentOfTable(Table.TABLE_1));
//        System.out.println(main.totalProfitFromItem("Hamburger"));
        main.writeOrder(order1);
        main.writeOrder(order2);

    }

    public int howManyOrders() {
        return restaurantOrder.size();
    }

    public int totalSpent() {
        int receipt = 0;
        for (Order order : restaurantOrder) {
            for (Item item : order.getOrderList()) {
                receipt += item.getPrice();
            }
        }
        return receipt;
    }

    public int totalSpentOfTable(Table table) {
        int receipt = 0;
        for (Order order : restaurantOrder) {
            if (order.getTableNumber().equals(table)) {
                for (Item item : order.getOrderList()) {
                    receipt += item.getPrice();
                }
            }
        }
        return receipt;

    }

    public int totalProfitFromItem(String name) {
        int profit = 0;
        for (Order order : restaurantOrder) {
            for (Item i : order.getOrderList()) {
                if (i.getName().equals(name)) {
                    profit += i.getPrice();
                }
            }
        }
        return profit;

    }

    public String writeOrderItem(Order order){
        String items = "";
            for (Item i : order.getOrderList()) {
                items += i.getName() + "\t" + i.getPrice() + " Kč\n";
            }
            return items;

    }

    public void writeOrder(Order order) {


        System.out.println("Objednávka: " + order.getOrderNumber() + "\n" +
                order.getTableNumber().getDescription() + "\n" +
                order.getDate() + "\n\n" +
                writeOrderItem(order) + "\n" +
                "Součet: " + totalSpentOfTable(order.getTableNumber()) + " Kč\n" +
                "Způsob platby: " + order.getPayment().getDescription() + "\n" +
                "____________________");


    }


}

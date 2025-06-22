package sortdata;

public class SortTest {
	public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Manoj", 3500.00),
            new Order(102, "Anjali", 1500.00),
            new Order(103, "Suresh", 5600.50),
            new Order(104, "Deepa", 1200.75),
        };
        System.out.println("🔹 Original Orders:");
        printOrders(orders);
        // Bubble Sort
        BubbleSort.sort(orders);
        System.out.println("\n🔹 After Bubble Sort (Ascending by totalPrice):");
        printOrders(orders);
        // Reset array for Quick Sort
        Order[] orders2 = {
            new Order(101, "Manoj", 3500.00),
            new Order(102, "Anjali", 1500.00),
            new Order(103, "Suresh", 5600.50),
            new Order(104, "Deepa", 1200.75),
        };

        QuickSort.sort(orders2, 0, orders2.length - 1);
        System.out.println("\n🔹 After Quick Sort (Ascending by totalPrice):");
        printOrders(orders2);
    }
    static void printOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}

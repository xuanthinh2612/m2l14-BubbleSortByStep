import java.util.Scanner;

public class BubbleSortByStep {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter your list size");
        int size = scanner.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter value: " + (i + 1));
            int temp = scanner.nextInt();
            list[i] = temp;
        }

        System.out.println("your input list is: ");
        for (int c : list) {
            System.out.print(c + "\t");
        }

        System.out.println();
        System.out.println("start sorting");
        bubbleSort(list);
        System.out.println("your list after sorted");
        for (int c : list) {
            System.out.print(c + "\t");
        }

    }

    public static void bubbleSort(int[] list) {
        for (int j = 0; j < list.length-1; j++) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] >= list[i + 1]) {
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }

            System.out.println("list after "+ j+1 +" times sorted");
            for (int c : list) {
                System.out.print(c + "\t");
            }
            System.out.println();

        }
    }
}

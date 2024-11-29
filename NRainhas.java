import java.util.Scanner;

public class NRainhas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to sort? ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        sortDescending(array);

        System.out.println("Numbers in descending order:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

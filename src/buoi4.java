import java.util.Scanner;

public class buoi4 {
    public static void main(String[] args) {
        //2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu:");
        printArray(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
        }
        System.out.println("Mảng sau khi thay đổi:");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

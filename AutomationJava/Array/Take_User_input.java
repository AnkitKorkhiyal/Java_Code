import java.util.Scanner;

public class Take_User_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Enter 6 numbers:");

        for (int i = 0; i < 6; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The elements from index 0 to 5 are:");

        for (int i = 0; i <= 5; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
}
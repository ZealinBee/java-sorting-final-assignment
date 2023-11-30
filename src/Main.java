import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            ShowMenu();
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }else if(userInput.equals("1")) {
                LinearSearch();
            }else if(userInput.equals("2")) {
                BinarySearch();
            }else if(userInput.equals("3")) {
                BubbleSort();
            }
        }

}

    private static void LinearSearch() {
        int[] array = {1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("In the list are values "  + array[0] + "..." + array[array.length - 1] + "; which value would you like to search?");
        int userInput = scanner.nextInt();
        boolean found = false;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == userInput) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("\nFound\n");
        }else {
            System.out.println("\nNot Found\n");
        }
    }

    public static void BinarySearch() {
        int[] array = {1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("In the list are values "  + array[0] + "..." + array[array.length - 1] + "; which value would you like to search?");
        int left = 0;
        int right = array.length - 1;
        boolean found = false;
        int userInput = scanner.nextInt();
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == userInput) {
                found = true;
                break;
            } else if (array[mid] < userInput) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(found) {
            System.out.println("\nFound\n");
        }else {
            System.out.println("\nNot Found\n");
        }

    }

    public static void BubbleSort() {
        // This sort is O(n^2)
        int[] randomNumbers = new int[10];
        Random random = new Random();

        for(int i = 0; i < randomNumbers.length; i++) {
            int randomNumber = random.nextInt(201) - 100;
            randomNumbers[i] = randomNumber;
        }

        System.out.println("Data set before insertion sorting: ");
        for(int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }

        for(int i = 0; i < randomNumbers.length - 1; i++) {
            for(int j = 0; j < randomNumbers.length - 1 - i; j++) {
                if(randomNumbers[j] > randomNumbers[j + 1]) {
                    int temp = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j + 1];
                    randomNumbers[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nData set after insertion sorting: ");
        for(int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }

        System.out.print("\n\n");

    }

    private static void ShowMenu() {
        System.out.println("Menu of Searching and Sorting Testbed.\n");
        System.out.println("1) Linear Searching");
        System.out.println("2) Binary Searching");
        System.out.println("3) O(n^2) type of sorting");
        System.out.println("4) O(n*log(n)) type of sorting");
        System.out.println("5) Sorting performance\n");
        System.out.println("q/Q) Quit\n");
        System.out.print("Your choice: ");
    }
}

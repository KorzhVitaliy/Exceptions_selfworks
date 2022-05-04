package task_2;

import java.util.Scanner;

public class ArrayException {

    public static void main(String[] args) {

        double[] priceArray = {22.37, 36.35, 20.15, 38.78, 18.16};
        System.out.println("Please, choose the number of the day from offered");
        for (int i = 0; i < priceArray.length; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        getUserInput(scanner, priceArray);

    }


    public static void getUserInput(Scanner scanner, double[] array) {
        boolean isEnabled = true;
        String userInputData;
        while (isEnabled) {
            try {
                userInputData = scanner.next();
                int data = Integer.parseInt(userInputData);
                System.out.println("The price is: " + array[data - 1] + "$");
                isEnabled = false;
            } catch (NumberFormatException exception) {
                System.out.println("Is not a number.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong number.");
                System.out.println("Please try again");
            }
        }

    }
}

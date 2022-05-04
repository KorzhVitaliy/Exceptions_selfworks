package task_2;

import java.util.Scanner;

public class ArrayException {

    public static void main(String[] args) {

        double[] priceArray = {22.37, 36.35, 20.15, 38.78, 18.16};
        System.out.println("Please, choose the number of the day from offered");
        Scanner scanner = new Scanner(System.in);
        int userData = getUserInput(scanner);

        System.out.println("Price is: " + priceArray[userData] + "$");
    }


    public static int getUserInput(Scanner scanner) {
        boolean isEnabled = true;
        String userInputData;
        while (isEnabled) {

            try {
                userInputData = scanner.next();
                Integer.parseInt(userInputData);
                isEnabled = false;
            } catch (NumberFormatException exception) {
                System.out.println();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong number.");
                System.out.println("Please try again");
            }
        }

        return 1;
    }


}

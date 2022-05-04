package task_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
       boolean isEnabled = true;
        while (isEnabled){
            try{
                String userInputData = scanner.next();
                Integer.parseInt(userInputData);
                isEnabled = false;
            }catch (NumberFormatException exception){
                System.out.println("Wrong number.");
                System.out.println("Please try again");
            }
        }



        scanner.close();
    }
}

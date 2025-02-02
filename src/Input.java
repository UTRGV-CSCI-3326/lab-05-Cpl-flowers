import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String patient;
        Integer age;
        Float weight;
        Boolean smoker = false;

        System.out.print("Enter Patient's name: ");
        patient = scanner.nextLine();

        System.out.print("Enter Patient's age: ");
        age = scanner.nextInt();

        System.out.print("Enter Patient's weight: ");
        weight = scanner.nextFloat();

        System.out.print("Enter if Patient smokes: ");
        smoker = scanner.nextBoolean();


        System.out.print("\n" + "Patient Information" + "\n" + "Patient's name: " + patient + "\n" + "Patient's age: " + age + "\n" + "Patient's weight: " + weight + "\n" + "Smoker? " + smoker + "\n");

    }
}
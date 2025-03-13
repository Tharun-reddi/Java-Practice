import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a index number: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);

            int[] arr = {1, 2, 3};
            System.out.println("Array element at index " + number + ": " + arr[number]);
        } 
        catch (NumberFormatException e) {
            System.out.println(" Invalid number format.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Array index out of bounds.");
        } 
        finally {
            scanner.close();
        }
    }
}



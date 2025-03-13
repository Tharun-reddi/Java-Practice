public class ExceptionHandling {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z;

        try{
            z = x / y;
            System.out.println(z);
        }
        catch( ArithmeticException e){
            System.out.println("Divide by Zero");
        }
        System.out.println("Program Over");
    }
}

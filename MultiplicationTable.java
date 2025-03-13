public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Multiplication table of " + n + ":");

        for(int i = 1; i<=10; i++){
            System.out.println(n + "x" + i+ "=" + (n*i) );
        }
    }
}

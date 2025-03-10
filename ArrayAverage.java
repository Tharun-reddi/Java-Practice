 public class ArrayAverage {
    public static void main(String[] args)
    {
        int[] array = { 10, 20, 30, 40, 50};
        int sum = 0;
        double average;

        for(int number : array){
            sum += number;
        }
        average = ((double)sum / (double)array.length);
        System.out.println("The sum is =" + sum);
        System.out.println("The average is =" + average);
    }
}

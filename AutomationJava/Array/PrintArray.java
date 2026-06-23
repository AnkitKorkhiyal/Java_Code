public class PrintArray {
    public static void main(String[] args){
        int [] numbers = {10, 20, 30, 40, 50};
        
        // To print all the elements of the array, you can use a loop. Here's an example using a for-each loop:
        // for(int number : numbers){
        //     System.out.println(number);

        // To print the first element of the array, you can access it using its index (0 for the first element):
       // System.out.println("The elements of the array are:"+ numbers[0]);

        // Tp print all the elements of the array, you can use a loop. Here's an example using a for loop;

        for (int i=0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);

        }
    }
}
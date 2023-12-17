import java.util.*;
public class largest_number {
    public static int greatest(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = in.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the element of array : ");
        for(int i = 0; i<size; i++){
            num[i]= in.nextInt();
        }
        int highest = greatest(num);
        System.out.println("Largest number is " + highest);
    }
}
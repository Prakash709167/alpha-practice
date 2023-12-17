import java.util.*;
public class smallest_number {
    public static int lowest(int num[]){
        int low = Integer.MAX_VALUE;
        for(int i = 0; i<num.length; i++){
            if(num[i]<low){
                low=num[i];
            }
        }
        return low;
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
        int small = lowest(num);
        System.out.println("smallest number is " + small);
    }
}
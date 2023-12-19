import java.util.*;
public class MaxSum {
    public static void maxsum(int n[]){
        int max =0;
        for(int i = 0; i<n.length; i++){
            for(int j = 0; j<n.length;j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum = sum+n[k];
                    if(max<sum){
                        max=sum;
                    }
                    System.out.print("{"+n[k]+"}");
                }
                System.out.print("  sum" +sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum sum of subarray is : "+max);
    }
    public static void main(String args []){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of an array : ");
       int size = in.nextInt();
       int []num = new int[size];
       System.out.println("Enter the element of array : ");
       for(int i = 0; i<size; i++){
        num[i]= in.nextInt();
       } 
       maxsum(num);
    }
}
import java.util.*;
public class Pairs_array {
    public static void pairs(int n[]){
        System.out.println("All possible pairs of given array are : ");
        for(int i = 0; i< n.length; i++){
            for(int j = i+1; j<n.length; j++){
                System.out.print("{"+n[i]+","+n[j]+"}");
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = in.nextInt();
        int n[] = new int[size];
        System.out.println("Enter the element of an array : ");
        for(int i = 0 ; i<size;i++){
            n[i]=in.nextInt();
        }
        // int n[] = {2,5,8,10,12,13};
        pairs(n);
    }
}
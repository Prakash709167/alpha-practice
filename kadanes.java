import java.util.*;
public class kadanes {
    public static void maxsum(int n[]){
        int max = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i<n.length;i++){
            cs = cs +n[i];
            if(cs<0){
                cs=0;
            }
            max = Math.max(cs,max);
        }
        System.out.println("Maxsum = "+max);
    }
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = in.nextInt();
        int []num = new int[size];
        System.out.println("Enter the element of an array : ");
        for(int i = 0; i<size; i++){
            num[i]=in.nextInt();
        }
        maxsum(num);
    }
    
}
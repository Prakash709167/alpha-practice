import java.util.*;
public class existsort {
    public static void main(String args []){
        int n[]={5,4,1,6,3,2};
        Arrays.sort(n);
        System.out.print(" { ");
        for(int i = 0; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
        System.out.print("}");
        System.out.println();
    }   
}
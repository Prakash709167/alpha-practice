import java.util.*;
public class array_creation {
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = in.nextInt();
        int marks[]=new int[size];
        System.out.println("Enter the marks : ");
        for(int i = 0; i<size; i++){
            marks[i]=in.nextInt();
        }
        for(int i = 0; i<size;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
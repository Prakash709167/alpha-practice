import java.util.*;
public class updation {
    public static void updated(int marks[]){
        for(int i = 0; i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = in.nextInt();
        int marks[]=new int[size];
        System.out.println("Enter the marks : ");
        for(int i = 0; i<size; i++){
            marks[i]=in.nextInt();
        }
        updated(marks);
        System.out.println("updated the marks is : ");
        for(int i = 0; i<size;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
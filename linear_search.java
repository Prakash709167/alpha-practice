import java.util.*;
public class linear_search {
    public static int searching(int marks[],int key){
        for(int i = 0; i<marks.length;i++){
            if(marks[i]==key)
            return i;
        }
        return -1;
    }
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = in.nextInt();
        int marks[]=new int[size];
        System.out.println("Enter the element of array : ");
        for(int i = 0; i<size; i++){
            marks[i]=in.nextInt();
        }
        System.out.println("Enter the searching element : ");
        int key = in.nextInt();
        int path = searching(marks,key);
        if(path==-1){
            System.out.println("Element not present");
        }
        else{
            System.out.println("your key is at position "+ (path+1));
        }
        
    }
}
import java.util.*;
public class Binary_search {
    public static int binser(int num[], int key){
        int start =0, last = num.length-1;
        while(start<=last){
            int mid = (start+last)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]>key){
                last = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = in.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the element in accending order : ");
        for(int i = 0; i< size; i++){
            num[i]= in.nextInt();
        }
        System.out.println("Enter the searching element : ");
        int key = in.nextInt();
        int path = binser(num , key);
        if(path == -1){
            System.out.println("Element not present");
        }
        else{
            System.out.println("your key is at position : "+(path+1));
        }

    }
}
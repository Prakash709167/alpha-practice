public class Reverse {
    public static void reverse_array(int n[]){
        int first = 0, last = n.length-1;
        while(first<last){
            int temp = n[first];
            n[first]= n[last];
            n[last]= temp;
            first++;
            last--;
        }
    }
    public static void print_array(int n[]){
        for(int i = 0; i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args []){
        int n[]={2,4,6,8,10};
        print_array(n);
        reverse_array(n);
        print_array(n);

    }
}
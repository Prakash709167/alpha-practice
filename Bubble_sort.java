public class Bubble_sort {
    public static void bs(int n[]){
        for(int i = 0;i<n.length-1;i++){
            for(int j = 0;j<n.length-1-i;j++){
                if(n[j]>n[j+1]){
                    int temp = n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        for(int i = 0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args []){
        int n[] = {5,4,1,3,2};
        bs(n);
    }

}
public class subarrays {
    public static void sa(int n[]){
        for(int i = 0;i<n.length;i++){
            for(int j= i;j<n.length;j++){
                for(int k= i;k<=j;k++){
                    System.out.print("{"+ n[k]+ "}");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        int n[]={2,5,8,12,15,17,19};
        sa(n);
    }

}
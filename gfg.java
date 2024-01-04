import java.util.*;
class gfg {
    public static int find(int n[],int m,int k){
        if(m==1){
          return 0;
        } 
        Arrays.sort(n);
        int diff = n[m-1]-n[0];
        System.out.println("difference will be : "+ diff);
        int min , max;
        for(int i = 1; i<m;i++){
            if(n[i]-k < 0){
                continue;
            }
            else{
                max = Math.max(n[i-1]+k,n[m-1]-k);
                min = Math.min(n[0]+k,n[i]-k);
                int updiff = max-min;
                System.out.println("updated difference : "+ updiff);
                diff = Math.min(diff,updiff);
            }
        }
        return diff;

    }
    public static void main(String args []){
        int n[] = {7,4,8,8,8,9};
        System.out.println(find(n,6,6));
    }
}
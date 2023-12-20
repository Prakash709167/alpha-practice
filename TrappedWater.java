import java.util.*;
public class TrappedWater {
    public static void trappingRainWater(int n[],int width){
        int array_length = n.length;
        // ++++++++++++ left maximum value +++++++++++++++++++++
        int leftmax[] = new int[array_length];
        leftmax[0]=n[0];
        for(int i = 1; i<array_length;i++){
            leftmax[i] = Math.max(n[i],leftmax[i-1]);
        }
        // +++++++++++++ Right maximum value +++++++++++++++++++
        int rightmax[]=new int[array_length];
        rightmax[array_length-1]=n[array_length-1];
        for(int i = array_length-2;i>=0;i--){
            rightmax[i]=Math.max(n[i],rightmax[i+1]);
        } 
        // +++++++++++++++ calculate trapwater +++++++++++++++++
        int trapwater1 = 0;
        for(int i = 0 ; i <array_length; i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trapwater1 += ((waterlevel-n[i])*width);
        }
        System.out.println("Total trapwater is : "+trapwater1);

    }
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = in.nextInt();
        int n[] = new int[size];
        System.out.println("Enter the element of array : ");
        for(int i = 0; i<n.length;i++){
            n[i]=in.nextInt();
        }
        trappingRainWater(n,1);
    }
}
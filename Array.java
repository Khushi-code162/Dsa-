import java.util.*;
public class Array{
    // find if any pair in a sorted  and rotated arraylist has a target sum
    // array sorted h or rotated h mtlb kisi pont is move kiya h ex 1,2 ,3 ,4,5 arr h pr roated hone pr 3,4,5,1,2 ho gya maan lo
    // toh breaking point ya pivot hoga jo like list(i)>list(i+1) aaasa ho;solving by two pointer approach lp=0;rp=n-1; larget =i=rp; lp=i+1;

    public static  boolean PairSum2(ArrayList<Integer>list,int target){
        int n=list.size();
        int bp=-1;
        for(int i=0; i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }

        int lp=bp+1;
        int rp=bp;

        while(lp !=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            // case 2
            if (list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
                
            }
            else{
                // case 3
                rp=(n+rp-1)%n;
            }
        }
        return false;
    
    }
    public static boolean PairSum(ArrayList<Integer>list,int target){
        int n = list.size();
        int lp=0;
        int rp=list.size()-1;

        while(lp !=rp){
            //case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case 2
            if(list.get(lp)+list.get(rp)>target){
                rp--;
            }
            else{
                lp++;
            }
        }
        return false;
    }
    //brute force of pair sum 

    public static boolean PairSumBrute(ArrayList<Integer>list,int target){
        for(int i=0; i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }

    // container with max water
    public static int Max(ArrayList<Integer>height){
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            //calculate water area
            int ht=Math.min(height.get(lp),height.get(rp));
            int width= rp-lp;
            int currwater= ht*width;
            maxwater= Math.max(maxwater,currwater);

            // update pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer>height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
    
        System.out.println(Max(height));



    }
}
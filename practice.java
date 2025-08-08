public class practice{
    public static int Find(int arr[], int tar){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={10,14,15,9,8,11};
        int tar=8;
        System.out.println(Find(arr,tar));
    }
}
import java.util.*;
public class Arraylist{
    // public static void main(String args[]){
    //     ArrayList<Integer> list=new ArrayList<>();
    //     list.add(1);
    //     list.add(2);
    //     list.add(3);
    //     list.add(4);

    //     // reverse an arraylist
    //     for(int i =list.size()-1;i>=0;i--){
    //         System.out.println(list.get(i));
    //     }

    // }
    // public static void main(String args[]){
    //     ArrayList<Integer>list = new ArrayList<>();
    //     list.add(2);
    //     list.add(3);
    //     list.add(8);
    //     list.add(9);

    //     int max = Integer.MIN_VALUE;
    //     for(int i=0; i<list.size();i++){
    //         if(max < list.get(i)){
    //             max= list.get(i);
    //         }
    //     }
    //     System.out.println("max is "+ max);
               

    // }
    // swap two no int arr[],i

    // 
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);


        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList= mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    
    System.out.println(mainList);
    }
}
import java.util.Arrays;
import java.util.ArrayList;

public class List{
  
    public static void main(String[]args){
        int[] somelist = {1,2,3,3,4,6,5,6,7,8,9,10,11,12,13,14};
        System.out.println(Arrays.toString(somelist));    
       ArrayList<Integer> newList = unitListDivByThree(somelist);
        for(int i = 0; i < newList.size(); i++){
            System.out.print(newList.get(i) + " ");
        }
    }
    public static ArrayList unitListDivByThree(int[] arr){
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 3 == 0){
                if(!myList.contains(arr[i])){
                    myList.add(arr[i]);
                }
            }
        }
        return myList;
    } 
}
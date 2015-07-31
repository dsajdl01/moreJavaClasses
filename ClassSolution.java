import java.util.Random;
import java.util.Arrays;

public class Solution{
    
    public static void main(String[]args){
        
        final int size = 15;
        final int size1 = 7;
        Solution sol = new Solution();
        boolean found = true;
        int index = 0;
        int[] arr = new int[size1];
        arr[0] = -7;
        arr[1] = 1;
        arr[2] = 5;
        arr[3] = 2;
        arr[4] = -4;
        arr[5] = 3;
        arr[6] = 0;
        int[] Ar = {-16440, 10064, -17842, -18461, 12960, 8609, -4534, 4804, 19642, -14403, 11741, -2818, 9002, -2324, 16313 };
        
        try {
            
            System.out.println("Equilibrium solution: " + sol.solution(arr, 3));
            System.out.println("Equilibrium solution: " + sol.solution(Ar, 14));
            int[] theArray;
            System.out.println("\nHOLD ON, THIS MAY TAKE A WHILE TO PROCESS");
             do{ 
                    theArray = sol.createElements(size);
                    for(int i = 0; i < theArray.length; i++){
                        if(sol.solution(theArray, i) == 0) {
                            found = false;
                            index = i;
                        }
                    }
             } while(found);
          
            System.out.println("Folloving array "+ Arrays.toString(theArray) + 
                                " \nhas an equilibrium index in " + index + 
                                ",\nin position " + (index + 1) + 
                                ",\nhold value: "+ theArray[index] );
        
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
   
    public int[] createElements(int size){
        Random rm = new Random();
        int[] Ar = new int[size];
        final int maximum = 10000;
        final int minimum = -10000;
        int n = maximum - minimum + 1;
        
        for(int i = 0; i < Ar.length; i++){
            Ar[i] = rm.nextInt() % n;
        }
        return Ar;
    }
    
    public int solution(int[] A, int N){
        
        if(N < 0 || A.length <= N){
            throw new IllegalArgumentException(" " + N + " is not a valid index of array A!");
        }
        
        int totalSumRight = 0;
        int totalSumLeft = 0;
        
        for(int i = 0; i < N; i++){
                totalSumRight = totalSumRight + A[i];
        }
        
        for(int j = N + 1; j < A.length; j++){
            totalSumLeft = totalSumLeft + A[j];
        }
        
       // System.out.println(totalSumRight + " :R and L: " + totalSumLeft);
        if(totalSumRight == totalSumLeft) return 0; else return -1;
    }

}

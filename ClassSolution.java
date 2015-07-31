public class Solution{
    
    public static void main(String[]args){
        
        int[] arr = new int[7];
        arr[0] = -7;
        arr[1] = 1;
        arr[2] = 5;
        arr[3] = 2;
        arr[4] = -4;
        arr[5] = 3;
        arr[6] = 0;
        
        try {
            Solution sol = new Solution();
            System.out.println("Equilibrium solution: " + sol.solution(arr, -2));
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        
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

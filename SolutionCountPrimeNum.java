
/**
 * class SolutionCountPrimeNum.
 * 
 * @author David Sajdl
 * @version  31/08/2015
 */
public class SolutionCountPrimeNum {
    
    public static void main(String[] args){
        int[] numbers = {6, 10, 120, 500, 1200, 1999, 24333};
        SolutionCountPrimeNum pm = new SolutionCountPrimeNum();
        for(int i = 0; i < numbers.length; i++){
            System.out.println("The number " + numbers[i] + " has " + pm.getPrimeNum(numbers[i]) + " prime numbers");
        }
    }
    public int getPrimeNum(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(isPrime(i)){
                count++;
            }
        }
       return count;
    }
    public boolean isPrime(int n){
       if(n <= 1) return false;
        if(n == 2) return true;
       if (n%2==0) return false;
    
       for(int i=3;i*i<=n;i+=2) {
           if(n%i==0) return false;
       }
       return true;
    }
    
}

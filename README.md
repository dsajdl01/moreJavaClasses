The moreJavaClasses repository contains clases base on the exercises below:  

---------------------------------------------------------------------------------------- 

1) Create class with main method that have a list of integers: 

Int[] someList = {1,2,3,3,4,6,5,6,7,8,9,10,11,12,13,14} 

How would you get a list of unique elements which are divisible by 3? 


refere to .java file: ClassList 

------------------------------------------------------------------------------------------ 

2) Create class that have a string: 

String text = "I am not a groovy developer" 

How would you transform this to set all "o" and "e" to uppercase? 

refere to .java file: ClassMyString


------------------------------------------------------------------------------------------  

3) Class that have a collection of product IDs in a set:  

String[] productIDsSet = {"114967","221722","114965","110722","525762","93649","93269","121892","121875","15001"} and we need to find out if any of these URLs: 

String[] imageUrlsSet = ["shop/media/catalog/product/cache/14/image/460x492/9df78eab33525d08d6e5fb8d27136e95/H/L/HL_Tor_0015_525762_20195_A.jpg", 
"shop/media/catalog/product/cache/14/image/460x492/asdfefa/35325/9df78eab33525d08d6e5fb8d27136e95/T/E/TEC_Tor_0015_221722_20187_A.jpg", 
"shop/media/catalog/product/A/C/ACC_Tor_1415_792680_15001_A.jpg"] corresponds to any of the product IDs.   


We know that all product IDs contain only numbers longer than 4 digits and shorter than 8 digits. 
A common practice of many e-commerce sites is to put the product ID somewhere in the URL. 
Write a small piece of code in Java which checks each of the product image URLs to see if it 
may correspond to a product in the set. Consider the efficiency of your solution and add 
comments relating to your thoughts while completing this problem. 

refere to .java file: ClassURL

-------------------------------------------------------------------------------------------


4) This is a demo task. You can read about this task and its solutions in this blog post. 
A zero-indexed array A consisting of N integers is given. An equilibrium index of this 
array is any integer P such that 0 ≤ P < N and the sum of elements of lower indices is 
equal to the sum of elements of higher indices, i.e. 

A[0] + A[1] + ... + A[P−1] = A[P+1] + ... + A[N−2] + A[N−1]. 
Sum of zero elements is assumed to be equal to 0. This can happen if P = 0 or if P = N−1.  
For example, consider the following array A consisting of N = 7 elements: 

A[0] = -7   A[1] =  1   A[2] = 5
A[3] =  2   A[4] = -4   A[5] = 3
A[6] =  0

P = 3 is an equilibrium index of this array, because: 
A[0] + A[1] + A[2] = A[4] + A[5] + A[6] 

P = 6 is also an equilibrium index, because: 
A[0] + A[1] + A[2] + A[3] + A[4] + A[5] = 0 
and there are no elements with indices greater than 6. 

P = 7 is not an equilibrium index, because it does not fulfill the condition 0 ≤ P < N. 

Write a function  
Class Solution { public int solution(int[] A, int N); } 

that, given a zero-indexed array A consisting of N integers, returns any of its equilibrium indices.  
The function should return −1 if no equilibrium index exists. 

Assume that:
N is an integer within the range [0..10,000,000]; 
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647]. 
For example, given array A such that 
A[0] = -7   A[1] =  1   A[2] = 5 
A[3] =  2   A[4] = -4   A[5] = 3 
A[6] =  0 

the function may return 3 or 6, as explained above. 

Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments). 
Elements of input arrays can be modified. 

refers to .java file: ClassSolution 

-------------------------------------------------------------------------------------------

5) Write a command line application which reads text from an input file, switches
the case of any vowels identified, and writes the resulting text to an output file. 

The user of the application must at least specify the paths to the input and output file. 
The output file may not currently exist.
The format of the file's content is unknown prior to running the application. 
The application may need, in future, to be modified to include additional characters whose cases need to be switched.

refers to .java file: FileReader
To use FileReader.java in terminal type 

$ cd toDirWhereFileReaderIS
$ javac FileReader.java			// to compile FileReader.java file
$ java FileReader README.md 		// or any txt file 


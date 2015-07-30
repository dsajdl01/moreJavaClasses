The moreJavaClasses repository contains clases base on the exercises below:  

---------------------------------------------------------------------------------------- 

1. Create class with main method that have a list of integers: 

Int[] someList = {1,2,3,3,4,6,5,6,7,8,9,10,11,12,13,14} 

How would you get a list of unique elements which are divisible by 3? 


refere to class; List 

------------------------------------------------------------------------------------------ 

2. Create class that have a string: 

String text = "I am not a groovy developer" 

How would you transform this to set all "o" and "e" to uppercase? 

------------------------------------------------------------------------------------------  

3. Class that have a collection of product IDs in a set:  

String[] productIDsSet = {"114967","221722","114965","110722","525762","93649","93269","121892","121875","15001"} and we need to find out if any of these URLs: 

String[] imageUrlsSet = ["shop/media/catalog/product/cache/14/image/460x492/9df78eab33525d08d6e5fb8d27136e95/H/L/HL_Tor_0015_525762_20195_A.jpg", 
"shop/media/catalog/product/cache/14/image/460x492/asdfefa/35325/9df78eab33525d08d6e5fb8d27136e95/T/E/TEC_Tor_0015_221722_20187_A.jpg", 
"shop/media/catalog/product/A/C/ACC_Tor_1415_792680_15001_A.jpg"] corresponds to any of the product IDs.   


We know that all product IDs contain only numbers longer than 4 digits and shorter than 8 digits. 
A common practice of many e-commerce sites is to put the product ID somewhere in the URL. 
Write a small piece of code in Java which checks each of the product image URLs to see if it 
may correspond to a product in the set. Consider the efficiency of your solution and add 
comments relating to your thoughts while completing this problem. 

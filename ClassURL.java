 
 public class URL{
 
    public static void main(String[]args){
        String[] productIDsSet = {"114967","221722","114965","110722","525762","93649","93269","121892","121875","15001"};
        String[] imageUrlsSet = { 
                "shop/media/catalog/product/cache/14/image/460x492/9df78eab33525d08d6e5fb8d27136e95/H/L/HL_Tor_0015_525762_20195_A.jpg",
				"shop/media/catalog/product/cache/14/image/460x492/asdfefa/35325/9df78eab33525d08d6e5fb8d27136e95/T/E/TEC_Tor_0015_221722_20187_A.jpg",
				"shop/media/catalog/product/A/C/ACC_Tor_1415_792680_15001_A.jpg"};
		// go through each URL  
		for(int j = 0; j < imageUrlsSet.length; j ++) {
			// go through each product ID
    		 for(int i = 0; i < productIDsSet.length; i++){
				// if product id is smaller than 4 and greater then 8 then go not go anything 
    		    if(productIDsSet[i].trim().length() > 4 && productIDsSet[i].trim().length() < 8){
					// if product ID is between 4 and 8 match to URL  
        		    if(checkMath(imageUrlsSet[j], productIDsSet[i])){
						// if match print it out
        		        System.out.println("index " + i + ", the prodece ID: " + productIDsSet[i] + " appears in index " + j + ", " + imageUrlsSet[j]);
        		      }
        		}
             }
        }
    }
	/*
	* checkMath method checks if product id appears in url string
	* 
	* @param string url that represent url 
	* @param String id that represent product id
	* @return boolean true if product id appears in the URL otherwise false
	*/
    public static boolean checkMath(String url, String id){
		// split url string (product always appears before and after underscore _ )
        String[] arrStr = url.split("_");
		// go through split array url
        for (int i =0; i < arrStr.length; i++){
			// if product id appears in URL then return true
            if(id.equals(arrStr[i])) return true;
        } 
        return false;
    }
}
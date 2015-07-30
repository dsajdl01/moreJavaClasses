public class MyString{
    
    public static void main(String[]args){
        String text = "I am not a groovy developer";
        String newtext = "";
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'o'){
                newtext = newtext + 'O';
            }
            else if(text.charAt(i) == 'e'){
                newtext = newtext + 'E';
            }
            else{
                newtext = newtext + text.charAt(i);
            }
        }
        System.out.println(newtext);
    }
}
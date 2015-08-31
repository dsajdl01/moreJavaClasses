
/**
 * class MyMatch
 * 
 * @author David Sajdl
 * @version  31/08/2015
 */
public class MyMatch {
    
    public static void main(String[] args){
        
        String text  = "Polly put the kettle on, polly put the kettle on, polly put the kettle on we'll all have tea";
        String subtext = "Polly";
        System.out.println("Text:\n"+text);
        MyMatch m = new MyMatch();
        System.out.println("Substring: " + subtext + " appears in the text on the positions");
       m.getPositionOfSubtext(text, subtext);
        System.out.println("Substring: lL appears in the text on the positions");
       m.getPositionOfSubtext(text, "lL");
        System.out.println("Substring: X appears in the text on the positions");
       m.getPositionOfSubtext(text, "X");
    }
    
    public void getPositionOfSubtext(String text, String str){
        int n = str.length();
        int tn = text.length();
        if(n == 0 || tn < n){
            System.out.println("Zero");
            return;
        }
        boolean found = false;
        int end = tn - n + 1;
        int subEnd = n;
        for(int i = 0; i < end; i++){
            if(text.substring(i,subEnd).toLowerCase().equals(str.toLowerCase())) {
                found = true;
                System.out.println(text.substring(i,subEnd) + " in position: " + (i + 1));
            }
            subEnd++;
        }
        if(!found) System.out.println("Zero");
        System.out.println();
    }
}

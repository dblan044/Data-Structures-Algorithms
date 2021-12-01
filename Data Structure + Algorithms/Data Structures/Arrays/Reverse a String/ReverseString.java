//create a function the reverses a String
//example string to reverse "Hello my name is Diana" becomes "anaiD si eman ym iH"

//using a for loop
public class ReverseString {
    public String reverse(String str){
        String output = "";
        
        for(int i = str.length() - 1; i >= 0; i--){
            output += str.charAt(i);
        }
        return output;
    }
    
    //using StringBuilder reverse() method
    public String reverse2(String str){
        return new StringBuilder(str).reverse().toString();
    }
}

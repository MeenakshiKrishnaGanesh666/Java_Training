public class StringReverse{
   public static void main(String[] args){
   String str = "abc";
   System.out.println(reverse(str)); 
    }
public static String reverse(String in){
    if(in == null){
        throw new IllegalArgumentException("Null is an invalid input");
    }
    StringBuilder out = new StringBuilder();
    char[] chars = in.toCharArray();
    for(int i=chars.length-1; i>=0; i--){
        out.append(chars[i]);
    }
    return out.toString();
}
}
public class Cast3{
    public static void main(String[] args) {
        String value = "cat";
        Object temp = value;//implicitly cast to object.
        String value2 = (String)temp;//Cast to String.
        System.out.println(value2);
    }
}
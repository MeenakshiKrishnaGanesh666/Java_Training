import java.util.Scanner;
public class gettinguserinput{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a floating point value please:");
        double value = input.nextDouble();
        System.out.print("You entered:"+value);
    }

}
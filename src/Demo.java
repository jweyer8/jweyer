import java.util.*;


public class Demo {
    public static void main(String[] args){
        System.out.println("Hello World");
        int[] a = {1,2,3,4,5,6,7,8,9};
        for(int num : a){
            System.out.println(num);
        }
        System.out.println("...");
        Scanner in = new Scanner(System.in);
        System.out.print("what is your name");
        String reply = in.nextLine();
        String add = "your name is " + reply;

        System.out.println(add);
    }
}

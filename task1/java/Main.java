import java.util.*;

public class Main {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(10,10);
        Rectangle b = new Rectangle(5,60);
        Rectangle c = new Rectangle(5,7);
        Rectangle d = new Rectangle(10,14);
        Rectangle i = new Rectangle(21,2);
        Rectangle[] arr = {a,b,c,d,i};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

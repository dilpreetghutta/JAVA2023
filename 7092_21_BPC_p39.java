import java.util.*;
import java.io.*;
public class p9{

    static public void main(String arg[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of radius : ");
        int r = obj.nextInt();
        System.out.println("Enter value of height : ");
        int h = obj.nextInt();
        int res = 3.14 * 2 * (r * h);
        System.out.println("Surface area of Cylinder : "+res);
    }
}

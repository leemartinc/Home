/**
 * Created by mobee on 3/11/2016.
 */
public class Homework4 {

    public static void main (String[] args){
        writeSequence(9);
    }

    public static void writeSequence(int n) {
        if (n == 1) {
            System.out.print("1");
        } else if (n == 2) {
            System.out.print("1 1");
        } else {
            int m = (n+1) / 2;
            System.out.print(m + " ");
            writeSequence(n - 2);
            System.out.print(" " + m);
        }
    }

}

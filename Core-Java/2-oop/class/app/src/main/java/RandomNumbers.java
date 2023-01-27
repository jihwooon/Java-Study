import java.io.PrintStream;
import java.util.Random;

public class RandomNumbers {

    private static Random generator = new Random();

    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }

    public static void main(String[] args) {

        int dieToss = RandomNumbers.nextInt(1, 6);
        System.out.println(dieToss);
    }


}

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] array = {1, 10, 50, 37, 19, 61};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int pos1 = Arrays.binarySearch(array, 50);
        System.out.println(pos1);
    }
}

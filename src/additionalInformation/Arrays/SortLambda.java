package additionalInformation.Arrays;

import java.util.Arrays;

public class SortLambda {
    public static void main(String[] args) {
    Integer[] arr = {1, 0, -50, 75, 21, -60, 12, 100, 1000, -10000};
    Arrays.sort(arr, (s1, t1) -> Integer.compare(t1, s1));
    }

}

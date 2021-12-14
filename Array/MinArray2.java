// To Find Min Value from the Array using array method

/**
 * TestArray2
 */
public class MinArray2 {
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (min > arr[0])
                min = arr[i];

        System.out.println(min);
    }

    public static void main(String[] args) {
        int a[] = { 2, 4, 5, 21,};
        min(a);

    }
}
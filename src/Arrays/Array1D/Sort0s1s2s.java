package Arrays.Array1D;

public class Sort0s1s2s {
    static void sort0s1s2s(int[] arr) {

        int i = 0;
        int temp = 0;
        int j = arr.length - 1;
        while (temp < j) {
            if (arr[i] > 0) {
                if (arr[j] < arr[i]) {
                    int n = arr[i];
                    arr[i] = arr[j];
                    arr[j] = n;
                } else {
                    j--;
                }
            } else {
                i++;
            }

        }
    }


    static void main() {
        int[] arr={1,2,0,0,2,2,1,1,2,1,0};
        sort0s1s2s(arr);
        PrintArray.printArray(arr);
    }
}

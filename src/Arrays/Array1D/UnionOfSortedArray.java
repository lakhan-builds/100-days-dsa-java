package Arrays.Array1D;

import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArray {

//    Given two sorted arrays of size n and m respectively, find their union. The Union of two
//    arrays can be defined as the common and distinct elements in the two arrays.
//    Return the elements in sorted order. Example:-
//    n = 5, nums1[ ] = {2, 2, 3, 4, 5}
//    m = 5, nums2[ ] = {1, 1, 2, 3, 4}
//    Output: 1 2 3 4 5
//    Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.


    static List<Integer> getUnion(int[] a,int[] b){
        ArrayList list = new ArrayList<>();
        int m = a.length; // Length of the first array
        int n = b.length; // Length of the second array

        int i = 0; // Pointer for the first array
        int j = 0; // Pointer for the second array

        // Traverse both arrays
        while (i < m && j < n) {
            // Skip duplicates in `a` and `b`
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            // Add smaller element to the list
            if (a[i] < b[j]) {
                list.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                list.add(b[j]);
                j++;
            } else {
                // If both elements are the same, add one and move both pointers
                list.add(a[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from the first array
        while (i < m) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            list.add(a[i]);
            i++;
        }

        // Add remaining elements from the second array
        while (j < n) {
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            list.add(b[j]);
            j++;
        }

        return list;
    }

    //https://leetcode.com/discuss/post/5083102/linkedin-phone-screen-union-of-two-sorte-d9uu/

    static void main() {
        int arr1[]={2,2,3,4,5};
        int arr2[]={1,1,2,3,4};
        System.out.println(getUnion(arr1,arr2));
    }
}

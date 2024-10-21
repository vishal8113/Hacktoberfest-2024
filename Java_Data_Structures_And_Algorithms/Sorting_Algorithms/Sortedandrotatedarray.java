public class Sortedandrotatedarray {
    public static int sorting(int arr[], int target, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }

        // work
        int mid = si + (ei - si) / 2;
        // case FOUND
        if (arr[mid] == target) {
            return mid;
        }

        // mid lie on L1
        if (arr[si] <= arr[mid]) {
            // case a (searching in left part):
            if (arr[si] <= target && target <= arr[mid]) {
                return sorting(arr, target, si, mid);
            }
            // case b (searching in right part):
            else {
                return sorting(arr, target, mid + 1, ei);
            }
        }
        // mid lie on L2
        else {
            // case c (searching in the right part):
            if (arr[mid] <= target && target <= arr[ei]) {
                return sorting(arr, target, mid + 1, ei);
            }
            // case d(searching in the left part):
            else {
                return sorting(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int tarIdx = sorting(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
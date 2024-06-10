public class THtimgiatrinhonhattrongmang {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5, 6, 7};
        int x = min(arr);
        System.out.println("min = " + min(arr));
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }return min;
    }
}

import java.util.Scanner;

public class BTxoaphantukhoimang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("nhap phan tu can xoa: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] newarr = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                index = i;
                break;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j < index) {
                newarr[j] = arr[j];
            } else if (j == index) {
                continue;
            } else {
                newarr[j - 1] = arr[j];
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}

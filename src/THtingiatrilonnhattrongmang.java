import java.util.Scanner;

public class THtingiatrilonnhattrongmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int[] arr;
        do {
            System.out.println("nhap so luong phan tu trong mang: ");
            a = sc.nextInt();
            if (a > 20) {
                System.out.println("khong duoc lon hon 20");
            }
        } while (a > 20);
        arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("nhap vao gia tri thu : " + (i +1));
            arr[i] = sc.nextInt();
        }
        System.out.println("mang ban dau: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("gia tri lon nhat trong mang la: " + max);
    }
}

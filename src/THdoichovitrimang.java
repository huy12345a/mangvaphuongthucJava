import java.util.Scanner;

public class THdoichovitrimang {
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
        }while (a>20);
        arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("nhap phan tu thu: " + (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("mang ban dau: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println("mang sau khi doi: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}

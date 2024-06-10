import java.util.Scanner;

public class BtGopMang {
    public static void main(String[] args) {
        System.out.println("nhap so phan tu mang 1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("pt thu " + (i+1)+ " : ");
            int x = sc.nextInt();
            arr1[i] = x;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("nhap so phan tu mang 2: ");
        int b = sc.nextInt();
        int[] arr2 = new int[a];
        for (int i = 0; i < b; i++) {
            System.out.println("pt thu " + (i+1)+ " : ");
            int y = sc.nextInt();
            arr2[i] = y;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        int[] arr3 = new int[a+b];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr3.length-arr1.length; i <arr3.length ; i++) {
            arr3[i] = arr2[i-arr1.length];
        }
        System.out.print("mang moi la : ");
        for (int i = 0; i <arr3.length ; i++) {
            System.out.print(arr3[i] + " ");

        }

    }
}

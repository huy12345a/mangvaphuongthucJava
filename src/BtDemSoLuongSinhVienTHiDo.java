import java.util.Scanner;

public class BtDemSoLuongSinhVienTHiDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien");
        int n = sc.nextInt();
        System.out.println("nhap diem sinh vien: ");
        double[] array =new double[n];
        int i=0;
        do {
            System.out.println("diem sv " + (i+1) + ": ");
            double diem = sc.nextDouble();
            array[i]=diem;
            i++;
        }while (i<n);
        int dem= 0;
        for (int j = 0; j <array.length ; j++) {
            if (array[j]>5) {
                dem++;
            }

        }
        System.out.println("so luong sinh vien do: "+ dem);

    }
}

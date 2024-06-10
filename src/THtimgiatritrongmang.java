import java.util.Scanner;

public class THtimgiatritrongmang {
    public static void main(String[] args) {
        String[] a= {"Huy", "Manh", "Hien"," Trang", "Khoi"};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten hoc sinh: ");
        String ten = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(ten)) {
                check = true;
                System.out.println("hoc sinh o vi tri thu : " + (i+1));
                break;
            }
        }
        if (!check) {
            System.out.println("khong co hoc sinh nay");
        }

    }
}

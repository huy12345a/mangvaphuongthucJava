import java.util.Scanner;

public class THchuyendoinhietdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("xin moi chon che do: ");
        System.out.println(" 1 : chuyen tu C sang F");
        System.out.println(" 2 : chuyen tu F sang C");
        int x = sc.nextInt();
        if(x == 1){
            System.out.println("moi ban nhap do C: ");
            double a = sc.nextDouble();
            System.out.println("ket qua : " + CsangF(a)+ " doF");
        }
        if(x == 2){
            System.out.println("moi ban nhap do F: ");
            double b = sc.nextDouble();
            System.out.println("ket qua :" + FsangC(b)+ "doC");
        }
    }
    public static double CsangF(double c){
        double f = (9.0 / 5) * c + 32;
        return f;
    }
    public static double FsangC(double f){
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}

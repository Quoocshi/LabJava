import java.util.Scanner;

public class Bai4 {
    public static void main(String args[]) {
        String x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi x: ");
        x = input.nextLine();
        System.out.print("Nhap chuoi y: ");
        y = input.nextLine();
        int lenX = x.length();
        System.out.println("Chieu dai chuoi x:" + lenX);
        String subFirst3X = x.substring(0, 3);
        System.out.println("3 ky tu dau cua chuoi x:" + subFirst3X);
        String subLast3X = x.substring(lenX - 3, lenX);
        System.out.println("3 ky tu cuoi cua chuoi x:" + subLast3X);
        char SixthX = x.charAt(5);
        System.out.println("Ky tu thu 6 cua chuoi x:" + SixthX);
        int lenY = y.length();
        String subLast3Y = y.substring(lenY - 3, lenY);
        String xy = subFirst3X + subLast3Y;
        System.out.println("Chuoi moi gom 3 ky tu dau chuoi x va 3 ky tu cuoi chuoi y la " + xy);
        boolean checkXequalsY = x.equals(y);
        System.out.println(checkXequalsY ? "Chuoi x bang chuoi y" : "Chuoi x khac chuoi y\n");
        boolean checkXequalsYIgnoreCase = x.equalsIgnoreCase(y);
        System.out.println(checkXequalsYIgnoreCase ? "Chuoi x bang chuoi y (ko phan biet hoa, thuong)"
                : "Chuoi x khac chuoi y (ko phan biet hoa, thuong)\n");
        int YinX = x.indexOf(y);
        System.out.println(YinX == -1 ? "Chuoi y khong xuat hien trong chuoi x"
                : "Chuoi y xuat hien trong chuoi x tai vi tri" + YinX);
        input.close();
    }
}

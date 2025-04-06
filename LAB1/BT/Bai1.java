import java.util.Scanner;

public class Bai1 {
    public static void main(String[] arr) {
        double R, P;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap R (phai la so duong): ");
            if (input.hasNextDouble()) {
                R = input.nextDouble();
                if (R >= 0) {
                    break;
                } else {
                    System.out.println("Vui long nhap so duong.");
                }
            } else {
                System.out.println("Gia tri nhap vao khong hop le, vui long nhap mot so.");
                input.next();
            }
        }

        P = 2 * Math.PI * R;
        System.out.print("Chu vi duong tron la: " + P);
        input.close();
    }
}

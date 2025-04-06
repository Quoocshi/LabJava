import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        double a = 0, b = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap a (phai la so): ");
            if (input.hasNextDouble()) {
                a = input.nextDouble();
                break;
            } else {
                System.out.println("Gia tri nhap vao khong hop le. Vui long nhap mot so.");
                input.next();
            }
        }

        while (true) {
            System.out.print("Nhap b (phai la so khac 0): ");
            if (input.hasNextDouble()) {
                b = input.nextDouble();
                if (b != 0) {
                    break;
                } else {
                    System.out.println("Vui long nhap so khac 0.");
                }
            } else {
                System.out.println("Gia tri nhap vao khong hop le. Vui long nhap mot so.");
                input.next();
            }
        }

        double c = (a / b);
        System.out.printf("a/b = %.3f", c);
        input.close();
    }
}

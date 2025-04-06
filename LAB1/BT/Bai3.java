import java.util.Scanner;

public class Bai3 {
    public static class JPhanSo {
        int tu, mau;

        public JPhanSo(int tuA, int mauA) {
            if (mauA == 0) {
                throw new ArithmeticException("Mau khong the bang 0");
            }
            if (mauA < 0) {
                tuA = -tuA;
                mauA = -mauA;
            }
            int gcd = USCLN(Math.abs(tuA), Math.abs(mauA));
            this.tu = tuA / gcd;
            this.mau = mauA / gcd;
        }

        public static int USCLN(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public JPhanSo Tong(JPhanSo b) {
            return new JPhanSo(this.tu * b.mau + b.tu * this.mau, this.mau * b.mau);
        }

        public JPhanSo Hieu(JPhanSo b) {
            return new JPhanSo(this.tu * b.mau - b.tu * this.mau, this.mau * b.mau);
        }

        public JPhanSo Tich(JPhanSo b) {
            return new JPhanSo(this.tu * b.tu, this.mau * b.mau);
        }

        public JPhanSo Thuong(JPhanSo b) {
            if (b.tu == 0) {
                throw new ArithmeticException("Khong the chia cho 0");
            }
            return new JPhanSo(this.tu * b.mau, this.mau * b.tu);
        }

        @Override
        public String toString() {
            return tu + (mau == 1 ? "" : "/" + mau);
        }
    }

    public static int NhapTuSo(String message, Scanner scanner) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Vui long nhap so nguyen hop le");
                scanner.next();
            }
        }
    }

    public static int NhapMauSo(String message, Scanner scanner) {
        int mau;
        do {
            mau = NhapTuSo(message, scanner);
            if (mau == 0) {
                System.out.println("Mau khong duoc bang 0, nhap lai!");
            }
        } while (mau == 0);
        return mau;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tuA = NhapTuSo("Nhap tu so a: ", input);
        int mauA = NhapMauSo("Nhap mau so a (khac 0): ", input);

        int tuB = NhapTuSo("Nhap tu so b: ", input);
        int mauB = NhapMauSo("Nhap mau so b (khac 0): ", input);

        try {
            JPhanSo a = new JPhanSo(tuA, mauA);
            JPhanSo b = new JPhanSo(tuB, mauB);

            System.out.println("Tong a + b = " + a.Tong(b));
            System.out.println("Hieu a - b = " + a.Hieu(b));
            System.out.println("Tich a * b = " + a.Tich(b));
            System.out.println("Thuong a / b = " + a.Thuong(b));
        } catch (ArithmeticException e) {
            System.out.println("Loi: " + e.getMessage());
        }

        input.close();
    }
}

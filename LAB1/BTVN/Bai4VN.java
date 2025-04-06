import java.util.Scanner;

public class Bai4VN {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so di: ");
        num = sc.nextInt();
        if (isPerfectNum(num))
            System.out.print(num + " la so hoan hao");
        else
            System.out.print(num + " khong phai so hoan hao");
        sc.close();
    }

    private static boolean isPerfectNum(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum == num;
    }
}

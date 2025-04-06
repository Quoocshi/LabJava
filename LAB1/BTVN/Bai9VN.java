import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Bai9VN {
    public static void main(String[] args) {
        File file = new File("D:\\Chuyên ngành\\Java\\LAB1\\BTVN\\Palindromes.txt");
        try (Scanner sc = new Scanner(System.in);
                FileWriter fw = new FileWriter(file)) {

            inputToFile(sc, fw);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        outPutFromFile(file);
    }

    private static void inputToFile(Scanner sc, FileWriter fw) throws IOException {
        System.out.println("Nhap noi dung file (nhap '0' de ket thuc): ");

        while (true) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("0")) {
                break;
            }
            fw.write(line + "\n");
        }
    }

    private static void outPutFromFile(File file) {
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (isPalindrome(line)) {
                    System.out.println(line + " la chuoi doi xung \n");
                } else {
                    System.out.println(line + " khong phai chuoi doi xung \n");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static boolean isPalindrome(String p) {
        String t = p.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int n = t.length();
        for (int i = 0; i < n / 2; i++) {
            if (t.charAt(i) != t.charAt(n - i - 1))
                return false;
        }
        return true;
    }

}

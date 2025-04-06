import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai8VN {
    public static void main(String[] args) {
        String s1 = "D:\\Chuyên ngành\\Java\\LAB1\\BTVN\\input8.1.txt";
        String s2 = "D:\\Chuyên ngành\\Java\\LAB1\\BTVN\\input8.2.txt";
        comparefiles(s1, s2);
    }

    private static void comparefiles(String s1, String s2) {
        try (Scanner sc1 = new Scanner(new File(s1));
                Scanner sc2 = new Scanner(new File(s2))) {
            int lineNumber = 1;
            while (sc1.hasNextLine() || sc2.hasNextLine()) {
                String line1 = sc1.hasNextLine() ? sc1.nextLine() : "";
                String line2 = sc2.hasNextLine() ? sc2.nextLine() : "";
                if (!line1.equals(line2)) {
                    System.out.println(lineNumber + "//" + line1);
                    System.out.println(lineNumber + "\\\\" + line2);
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

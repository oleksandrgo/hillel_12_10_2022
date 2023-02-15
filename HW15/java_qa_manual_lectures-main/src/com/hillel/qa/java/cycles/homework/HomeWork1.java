import java.util.Scanner;

public class HomeWork1 {
    /**
     * <p style="font-size:12px">
     *     Ввести з клавіатури марку авто, використовуючи цикл while, 10 разів вивести: <марка> найкраще авто.
     * </p>
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String brand = console.nextLine();

        int count = 0;
        while (count < 10)
        {
            System.out.println(brand + " найкраще авто");
            count++;
    }
}
}
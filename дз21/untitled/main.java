
    public class Main {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            double average = (double) sum / 100;
            System.out.println("Середнє арифметичне суми чисел від 1 до 100: " + average);
        }
    }
}

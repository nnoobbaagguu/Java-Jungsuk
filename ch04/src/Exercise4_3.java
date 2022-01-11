public class Exercise4_3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += sum + i;
        }

        System.out.println(sum);
    }
}

//답은 2036.
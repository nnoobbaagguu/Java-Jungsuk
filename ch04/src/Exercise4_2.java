//구하는 것은
public class Exercise4_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0 || i % 3 == 0) continue;
            sum += i;
        }
        System.out.println(sum);
    }
}
// 답은 73.
public class Exercise6_2 {
    public static void main(String[] args) {
        SutdaCard2 card1 = new SutdaCard2(3, false);
        SutdaCard2 card2 = new SutdaCard2();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    String info() {
        if (isKwang) return "" + num + "K";
        else return "" + num;
    }
}
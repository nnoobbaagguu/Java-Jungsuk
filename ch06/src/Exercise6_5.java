public class Exercise6_5 {
    public static void main(String[] args) {
        Student3 s = new Student3("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}

class Student3 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student3(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        int sum = getTotal();
        float average = sum / 3f + 0.05f;
        average = (int)(average * 10) / 10.f;
        return average;
    }

    String info() {
        return name + ", " + ban + ", " + no + ", " + kor
                + ", " + eng + ", " + math + ", " + getTotal()
                + ", " + getAverage();
    }
}
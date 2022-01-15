public class Exercise6_4 {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름: " + s.name);
        System.out.println("총점: " + s.getTotal());
        System.out.println("평균: " + s.getAverage());
    }
}

class Student2 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        int sum = getTotal();
        float average = sum / 3f + 0.05f;
        average = (int)(average * 10) / 10.f;
        return average;
    }
}
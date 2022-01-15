public class Exercise6_22 {
    static boolean isNumber(String str) {
        if (str == null || str.length() == 0) return false;
        for(int i = 0; i < str.length(); i++) {
            char tempChar = str.charAt(i);
            if (!(tempChar >= '0' && tempChar <= '9')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));


    }
}
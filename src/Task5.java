public class Task5 {
    public static void main(String[] args) {
        System.out.println(repFirstChar("test"));
    }
    public static String repFirstChar(String s) {
        char c = s.charAt(0);
        if (c >= 65 && c <= 90) {
            return "upper";
        } else if (c >= 97 && c <= 122) {
            return "lower";
        } else if (c >= 48 && c <= 57) {
            return "digit";
        } else {
            return "other";
        }
    }
}

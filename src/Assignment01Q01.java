public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String string : args) {
            if ((int)string.charAt(0) % 5 == 0)
                System.out.println(string.charAt(0));
        }
    }
}

public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        
        int numOdd = 0;
        int f1=1, f2 = 1;
        
        for (int i = 0; i < x-1; i++) {
            if (f1 % 2 == 1)
                numOdd ++;
            System.out.print(f1);

            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
            int tmp = f2;
            f2 = f2 + f1;
            f1 = tmp;

        }
        if (f1 % 2 == 1)
                numOdd ++;
        System.out.println(f1);
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}

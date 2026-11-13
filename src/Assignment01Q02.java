public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int numberOfSummands = Integer.parseInt(args[0]);
        for (int i=0; i<numberOfSummands; i++){
            double divisor = i*2+1;
            if (i%2 == 1)
                divisor = -divisor;
            approxPi = approxPi + 1/divisor;
        }
        approxPi = 4*approxPi;
        // TODO: Fill in the Pi approxiamtion here
        /////////////////////////////////////////////
        /// ...
        
        
        /////////////////////////////////////////////
        
        System.out.println(approxPi + " " + actualPi);
    }
}

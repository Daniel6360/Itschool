public class NumberSum {

    public static int calculate(int a) {
        int b = 0;
        while (a > 0) {
            int rem= a%10;
            a =a/10;

            if (rem % 2 == 0) {
                b = b + rem;
            }


        }

        return b;
    }
}




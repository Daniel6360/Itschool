public class NumberSum {

    public static void main(String[] args) {
        System.out.println(calculate( 20));
    }

    public static int calculate(int a){
        int b=0;
        for (int i=0; i<=a; i++){
            if (i%2==0){
                b=b+i;
            }

        }
        return b;

    }


}

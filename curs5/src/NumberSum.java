public class NumberSum {

    public static int calculate(int a){
        int b=0;
        for (int i=0; i<=a; i++){
            if (a%2==0){
                b=b+i;
            }

        }
        return b;

    }

    public static void main(String[] args) {
        System.out.println(calculate(10));
    }
}

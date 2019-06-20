public class Tema {
    public static int [] toArray(int n,int k){
        int [] myArray=new int[300];
        for (int i=0; i<n; i++){
            if (i%k==0){
                int result=i%k;
                myArray[i]=result;

            }

        }
        return myArray;
    }
}

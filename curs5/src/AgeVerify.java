public class AgeVerify {

    public static void verify(int age){
        if (age<16){
            System.out.println("You can't drive.");
        }else if (age >=16 && age <=17){
            System.out.println("You can drive bot not vote.");
        }else if(age >=18 && age <=24){
            System.out.println("You can vote but can't rent a car.");
        }else if(age >=25){
            System.out.println("You can do pretty much anything.");

        }


    }

}

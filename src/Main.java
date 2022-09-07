public class Main {
    public static void main(String[] args) {
        System.out.println(home(22,33));
        System.out.println(home(312,11));
        System.out.println(home(44,55));
        System.out.println(home(123,23));
        System.out.println(home(32,312));
        System.out.println(home(generateRandomAge(),22));
    }
    public static String home (int age , int temperature){

        String home1 = "Можно идти гулять";
        String home2 = ("Оставайтесь дома");

        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 35){
            return home1;
        }else if (age < 20 && temperature >= 0 && temperature <= 28 ){
            return home1;
        }else if (age > 45 && temperature >= -10 && temperature <= 25){
            return home1;
        }else
            return home2;



    }
    public static int generateRandomAge(){
        int ageRandom=0+(int)(Math.random()*100);
        return ageRandom;

    }
}
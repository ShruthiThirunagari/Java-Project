package loopsconditions;

public class Age {
    public static void main(String [] args){
        int age=18;
        if(age>13 && age<19){
            System.out.println("Teen");
        }
        else if (age<13 && age>1) {
            System.out.println("Kid");
        }
        else if (age>19){
            System.out.println("Adult");
        }
        else
            System.out.println("Invalid");
    }
}

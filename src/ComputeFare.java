import java.util.Scanner;
public class ComputeFare {

    public static void main(String[]args) {
        
        System.out.print("Enter the age: \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        int fare;
        
        if(age<11){
            System.out.println("A tarifa sera e: 3" );
        }else if(age>11 && age<65){
            System.out.println("A tarifa sera = 5");
        } else{
            System.out.println("A tarifa sera = 3");
        }

    }
}

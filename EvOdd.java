import java.util.Scanner;
public class EvOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int even=0,odd=0;
        for(int i=1;i<11;i++){
            System.out.println("Enter your no."+i);
            int n= sc.nextInt();

        if(n%2==0) {

            even++;
//            System.out.println("The number of even numbers is" + even);
        }
        else{
            odd++;
//                    System.out.println("The number of odd numbers is "+odd);
        }
            System.out.println("The number of even numbers is" + even);
            System.out.println("The number of odd numbers is "+odd);
        }
    }
}

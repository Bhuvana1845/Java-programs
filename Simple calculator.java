import java.util.Scanner;
public class calci{
    public static void main(String[] args){
        System.out.println("Enter two numbers:");
        int n1,n2,choice;
        Scanner sc=new Scanner(System.in);
       
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Select an operator:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
        choice = sc.nextInt();
        switch(choice){
        case 1: System.out.println(n1+n2);
        break;
        case 2: System.out.println(n1-n2);
        break;
        case 3: System.out.println(n1*n2);
        break;
        case 4: System.out.println(n1/n2);
        break;
        default:System.out.println("Invalid option!");
        }

    }
}

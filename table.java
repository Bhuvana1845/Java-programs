import java.util.*;
public class table {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n=input.nextInt();
        for(int i=1;i<11;i++){
            int mult=n*i;
            System.out.printf("%d * %d = %d\n",n,i,mult);
        }
        
    }
}

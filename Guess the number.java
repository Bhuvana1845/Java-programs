import java.util.*;
public class numberguess{
        public static void main(String[] args){
        System.out.println("Guess the number from 1 to 100 or press 0 to quit: ");
        int num=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        int guessnum=sc.nextInt();
        do{
            if(num == guessnum){
               System.out.println("Wow your guess is correct it's "+guessnum+":)");
               break;
            }
            else if(guessnum > num){
               System.out.println("your guess was high! enter another number\n");
               guessnum=sc.nextInt();
            }
            else{
               System.out.println("Your guess was low! enter another number\n");
               guessnum=sc.nextInt();
            }
        }while(guessnum>=0);  
    }
}

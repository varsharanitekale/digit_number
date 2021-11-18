
import java.util.Scanner; 
class digit_number {
    private static int i;

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int count=0;
    while(number>0){
        number=number/10;
        count++;
    }
    if(count>=1 && count<4){
        System.out.println("digit of the number " +count);
    }
    else{
        System.out.println("The number is  so big");
    }
    }
    
}

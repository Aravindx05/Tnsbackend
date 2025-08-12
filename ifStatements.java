import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
         int per=sc.nextInt();
         if(per<101&&per>90){
            System.out.println("A Grade");
         }else if(per<90&&per>80){
            System.out.println("B Grade");
         }else if(per<80&&per>70){
            System.out.println("C Grade");
         }else if(per<70&&per>60){
            System.out.println("D Grade");
         }else if(0<=per&&per<60){
            System.out.println("Fail");
         }else{
            System.err.println("PLease enter between 0 to 100");
         }
         sc.close();

    }
}

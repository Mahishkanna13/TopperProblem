// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int oddSum=0,evenSum=0,index=1;
        while(number>0){
            if(index%2!=0){
                oddSum+=number%10;
            }
            else{
                evenSum+=number%10;
            }
            number/=10;
            index++;
        }
        if(oddSum==evenSum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
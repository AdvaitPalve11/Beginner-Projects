package Bin2Dec;
import java.util.Scanner;
class Convert{
    int dec;

    Convert()
{
    dec = 0 ;
}

Convert(int num){
    this.dec = num;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice = -1;
    while (1) {
        System.out.println("1: Convert Decimal to Binary \n 2: Convert Binary to Decimal \n Exit");
        sc.nextInt();

        switch (choice) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
}
}
package BinToDec;
import java.util.Scanner;
class Convert{

static String decToBin (int dec){
    if(dec==0)
        return "0";
    if(dec == 1)
            return "1";
    return decToBin(dec/2) + (dec%2);
}

static int binToDec(int num){
        if(num == 1)
            return 1;
        if (num == 0)
            return 0;

        return (num % 10 ) + 2*binToDec(num/10);
    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int choice;
    while (true) {
        System.out.println("1: Convert Decimal to Binary\n2:Convert Binary to Decimal\n3:Exit");
       choice =  sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Decimal Number: ");
                 num = sc.nextInt();
                System.out.println(decToBin(num));
                break;
            case 2:
                System.out.println("Enter Binary Number ");
                 num = sc.nextInt();
                System.out.println(binToDec(num));
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
   
}
}
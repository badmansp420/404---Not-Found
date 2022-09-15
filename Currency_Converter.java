import java.util.*;
public class Currency_Converter {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("       MENU");
        System.out.println("------------------");
        System.out.println("1 FOR USD");
        System.out.println("2 FOR EURO");
        System.out.println("3 FOR POUND");
        System.out.println("4 FOR WON");
        System.out.println("5 FOR THAI BAHT");
        System.out.println("6 FOR DIRHAM");
        System.out.println("7 FOR YEN");
        System.out.println("8 FOR SAUDI RIYAL");
        System.out.println("9 FOR YUAN");
        System.out.println("10 FOR RUPIAH");

        System.out.println("------------------");
        System.out.print("Enter Your Choice: ");
        int num=sc.nextInt();

        System.out.println("------------------");
        if(num>10)
        {
            System.out.println("Please Enter Valid Input...");
        }
        else {
            System.out.print("Enter Amount: ");
            double amount=sc.nextDouble();
            System.out.println("------------------");

            System.out.print("Your INR Is: ");
            switch(num){
                case 1:
                    System.out.print(amount*79.50);
                    break;
                case 2:
                    System.out.print(amount*79.35);
                    break;
                case 3:
                    System.out.print(amount*91.73);
                    break;
                case 4:
                    System.out.print(amount*0.057);
                    break;
                case 5:
                    System.out.print(amount*2.17);
                    break;
                case 6:
                    System.out.print(amount*21.63);
                    break;
                case 7:
                    System.out.print(amount*0.56);
                    break;
                case 8:
                    System.out.print(amount*21.13);
                    break;
                case 9:
                    System.out.print(amount*11.42);
                    break;
                case 10:
                    System.out.print(amount*0.0053);
                    break;
                default:
                    System.out.println("");

            }

            System.out.println("");
        }

        System.out.println("------------------");

    }

}

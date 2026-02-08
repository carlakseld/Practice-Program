import java.util.*;
class OddEven{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String aksel[]){
        int N=0;
        int ctr = 0, ectr=0, octr=0;
        int arrN[];
        System.out.print("How many number?: ");
        ctr = scanner.nextInt();
        arrN = new int[ctr];
        int i = 1; 
            do{
            System.out.print("Enter an integer number: ");
            N = scanner.nextInt();
            arrN[i-1] = N;
            System.out.println("You entered "+chkEO(N)+ " number.");
            ++i;
            }while(i<=ctr);
             for(int x = 0; x<arrN.length; ++x){
                if(arrN[x]%2==0) ++ectr; else ++octr;

             }         
                System.out.println("Total no. of Even: " + ectr);
                System.out.println("Total no. of Odd: " + octr);





        }
        static boolean checkEven(int N){
            if (N%2==0)
                return true;
            else
                return false;
        }
        static String chkEO(int x){
            if (x%2==0)
                return "Even";
            else
                return "Odd";

	}

}
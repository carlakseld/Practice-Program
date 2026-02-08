import java.util.*;

public class GradeAnalyzer{
	public static void main(String aksel[]){
	Scanner scanner = new Scanner(System.in);
	char choice;
	do{
		System.out.print("Enter grade: ");
		int grade = scanner.nextInt();

		if(grade >= 95)
			System.out.println("Excellent!");
		else if(grade >= 90)
			System.out.println("Very Good!");
		else if(grade >= 75)
			System.out.println("Good!");
		else
			System.out.print("Failed!");
		System.out.print("Do you want to analyze another grade(Y/N)? ");
		choice = scanner.next().charAt(0);


		}while(choice == 'Y');

	}
}
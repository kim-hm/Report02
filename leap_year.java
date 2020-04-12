import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int year;
		year = sc.nextInt();

		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
					System.out.println("윤년");
				else
					System.out.println("평년");
			}
			else
				System.out.println("윤년");
		}
		else
			System.out.println("평년");
	}
}

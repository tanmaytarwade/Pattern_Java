package module5;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		String Choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("ICIC bank");
			System.out.println("1.accept details");
			System.out.println("2. display details");
			System.out.println("3.withdraw amount");
			System.out.println("4.Deposit the amount");
			System.out.println("5.Transfer amount");
			System.out.println("6. check the balance");
			System.out.println("7.update the balance");
			System.out.println("8.Exit");

			System.out.println("enter the choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("accepting details");
				break;

			case 2:
				System.out.println("displaying details");
				break;

			case 3:
				System.out.println("withdrawing amount");
				break;
			case 4:
				System.out.println("Depositing the amount");
				break;
			case 5:
				System.out.println("Transfering amount");
				break;
			case 6:
				System.out.println("check the balance");
				break;
			case 7:
				System.out.println("update the balance");
				break;
			case 8:
				System.out.println("thanks for visiting");
				System.exit(0);

			}
			System.out.println("do you want to continue?(y/n");
			Choice = sc.next();
		} while (Choice.equalsIgnoreCase("Y"));
		{
			System.out.println("thanks for visiting");
		}
	}
}

package by.jonline.simpleclasses.task03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student[] list_of_stud = new Student[10];

		for (int i = 0; i < list_of_stud.length; i++) {

			list_of_stud[i] = CreateStudent(i);

		}
		;

		HonorsStudents(list_of_stud);

	};

	public static Student CreateStudent(int i) {

		System.out.println("The " + (i + 1) + " student: ");

		System.out.print("Enter surname: \n >> ");
		@SuppressWarnings("resource")
		Scanner surname = new Scanner(System.in);
		String sname;
		sname = surname.nextLine();

		System.out.print("Enter initials (like A.A.): \n >> ");
		@SuppressWarnings("resource")
		Scanner initials = new Scanner(System.in);
		String init;
		init = initials.nextLine();

		System.out.print("Enter nummer of group: \n >> ");
		@SuppressWarnings("resource")
		Scanner group = new Scanner(System.in);
		int num;
		while(!group.hasNextInt()) {
			group.nextLine();
			System.out.print(">> ");
		}
		
		num = group.nextInt();

		System.out.print("Enter academic performance (5 grades): \n");
		int[] progr = new int[5];
		for (int j = 0; j < progr.length; j++) {
			System.out.print((j + 1) + ") ");
			@SuppressWarnings("resource")
			Scanner progress = new Scanner(System.in);
			while(!progress.hasNextInt()) {
				progress.nextLine();
				System.out.print(">> ");
			}
			progr[j] = progress.nextInt();
		}
		;

		return new Student(sname, init, num, progr);
	};

	public static void HonorsStudents(Student[] list_of_stud) {

		System.out.println("The honor students: ");

		for (int i = 0; i < list_of_stud.length; i++) {

			int sch = 0;

			for (int j = 0; j < list_of_stud[i].progress.length; j++) {

				if (list_of_stud[i].progress[j] >= 9) {
					sch += 1;
				}
				;

			}
			;

			if (sch == 5) {
				System.out.println(list_of_stud[i].getSurname() + " (" + list_of_stud[i].getGroup() + " group)");
			}
			;

		}
		;

	};

}

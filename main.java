package Quiz7;
import java.util.Scanner;

class Person {
	String name;
	String born_date;
	
	public Person(String name, int date, int month, int year) {
		this.name = name;
		this.born_date = date + "/" + month + "/" + year;
	}
	
	public void sleep() {
		System.out.println("Bro is sleeping\n");
	}
}

class Mahasiswa extends Person {
	String student_id;
	int point = 0;
	
	public Mahasiswa(String name, int date, int month, int year, String student_id) {
		super(name, date, month, year);
		this.student_id = student_id;
	}
	
	public void helpingDosen() {
		this.point += 10;
	}
}

class Dosen extends Person {
	String code_dosen;
	int point = 0;
	
	public Dosen(String name, int date, int month, int year, String code_dosen) {
		super(name, date, month, year);
		this.code_dosen = code_dosen;
	}
	
	public void selfDev() {
		this.point += 10;
	}
	
	public void teach() {
		this.point += 5;
	}
	
	public void p2m() {
		this.point += 5;
	}
	
	public void research() {
		this.point += 20;
	}
	
	public void otherWorks() {
		this.point += 5;
	}
}

public class main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int menunum = 0;
		while(menunum != 4) {
			System.out.println("Welcome!");
			System.out.println("1. New Person");
			System.out.println("2. New Mahasiswa");
			System.out.println("3. New Dosen");
			System.out.println("4. Exit");
			System.out.print(">> ");
			menunum = input.nextInt(); input.nextLine();
			System.out.println("");
			if(menunum == 1) {
				newPerson();
			}
			else if (menunum == 2) {
				newMahasiswa();
			}
			else if (menunum == 3) {
				newDosen();
			}
		}
	}
	
	static void printPerson(String name, String date) {
		System.out.println("Name: " + name);
		System.out.println("DoB: " + date + "\n");
	}
	
	static void newPerson() {
		System.out.print("Input Name: ");
		String person_name = input.nextLine();
		System.out.print("Input Birth Date: ");
		int person_date = input.nextInt();
		System.out.print("Input Birth Month: ");
		int person_month = input.nextInt();
		System.out.print("Input Birth Year: ");
		int person_year = input.nextInt(); input.nextLine();
		Person p1 = new Person(person_name, person_date, person_month, person_year);
		System.out.println("\nORANG BARU:");
		printPerson(p1.name, p1.born_date);
		int personnum = 0;
		while(personnum != 2) {
			System.out.println("Choose an Action");
			System.out.println("1. Sleep");
			System.out.println("2. Exit");
			System.out.print(">> ");
			personnum = input.nextInt();
			System.out.println("");
			if(personnum == 1) {
				p1.sleep();
				System.out.println("UPDATE:");
				printPerson(p1.name, p1.born_date);
			}
		}
	}
	
	static void printMahasiswa(String name, String date, String code, int point) {
		System.out.println("Name: " + name);
		System.out.println("DoB: " + date);
		System.out.println("NIM: " + code);
		System.out.println("Point: " + point + "\n");
	}
	
	static void newMahasiswa() {
		System.out.print("Input Name: ");
		String mahasiswa_name = input.nextLine();
		System.out.print("Input Birth Date: ");
		int mahasiswa_date = input.nextInt();
		System.out.print("Input Birth Month: ");
		int mahasiswa_month = input.nextInt();
		System.out.print("Input Birth Year: ");
		int mahasiswa_year = input.nextInt(); input.nextLine();
		System.out.print("Input NIM: ");
		String mahasiswa_id = input.nextLine();
		Mahasiswa m1 = new Mahasiswa(mahasiswa_name, mahasiswa_date, mahasiswa_month, mahasiswa_year, mahasiswa_id);
		System.out.println("\nMAHASISWA BARU:");
		printMahasiswa(m1.name, m1.born_date, m1.student_id, m1.point);
		int mahasiswanum = 0;
		while(mahasiswanum != 2) {
			System.out.println("Choose an Action");
			System.out.println("1. Help Dosen :D");
			System.out.println("2. Exit");
			System.out.print(">> ");
			mahasiswanum = input.nextInt();
			System.out.println("");
			if(mahasiswanum == 1) {
				m1.helpingDosen();
				System.out.println("UPDATE:");
				printMahasiswa(m1.name, m1.born_date, m1.student_id, m1.point);
			}
		}
	}

	
	static void printDosen(String name, String date, String code, int point) {
		System.out.println("Name: " + name);
		System.out.println("DoB: " + date);
		System.out.println("Dosen Code: " + code);
		System.out.println("Point: " + point + "\n");
	}
	
	static void newDosen() {
		System.out.print("Input Name: ");
		String dosen_name = input.nextLine();
		System.out.print("Input Birth Date: ");
		int dosen_date = input.nextInt();
		System.out.print("Input Birth Month: ");
		int dosen_month = input.nextInt();
		System.out.print("Input Birth Year: ");
		int dosen_year = input.nextInt(); input.nextLine();
		System.out.print("Input Dosen Code: ");
		String dosen_code = input.nextLine();
		Dosen d1 = new Dosen(dosen_name, dosen_date, dosen_month, dosen_year, dosen_code);
		System.out.println("\nDOSEN BARU:");
		printDosen(d1.name, d1.born_date, d1.code_dosen, d1.point);
		int dosennum = 0;
		while(dosennum != 6) {
			System.out.println("Choose an Action");
			System.out.println("1. Self Development");
			System.out.println("2. Teach");
			System.out.println("3. P2M");
			System.out.println("4. Research");
			System.out.println("5. Other Work");
			System.out.println("6. Exit");
			System.out.print(">> ");
			dosennum = input.nextInt();
			System.out.println("");
			if(dosennum == 1) {
				d1.selfDev();
				System.out.println("UPDATE:");
				printDosen(d1.name, d1.born_date, d1.code_dosen, d1.point);
			}
			else if (dosennum == 2) {
				d1.teach();
				System.out.println("UPDATE:");
				printDosen(d1.name, d1.born_date, d1.code_dosen, d1.point);
			}
			else if (dosennum == 3) {
				d1.p2m();
				System.out.println("UPDATE:");
				printDosen(d1.name, d1.born_date, d1.code_dosen, d1.point);
			}
			else if (dosennum == 4) {
				d1.research();
				System.out.println("UPDATE:");
				printDosen(d1.name, d1.born_date, d1.code_dosen, d1.point);
			}
			else if (dosennum == 5) {
				d1.otherWorks();
				System.out.println("UPDATE:");
				printDosen(d1.name, d1.born_date, d1.code_dosen, d1.point);
			}
		}
	}
}

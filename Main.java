package employee;

import java.util.*;  // Importing package to use java scanner class.

// This is a Main Class .Its has objects of child class.

public class Main {

	// private static final double Basic_pay= 10000;

	public static void main(String[] args) {

		// Creating Objects of all Childs Classes.
		
		Professor prof = new Professor();                           // object of Professer class.
		Scanner sc = new Scanner(System.in);                        // object of scanner class.
		Assistant_Professer assispro = new Assistant_Professer();   // Object of Assistant_Professer class.
		Programer programer = new Programer();                      // object of programer class.
		Associate_Professer associate = new Associate_Professer();  // object of Associate_professer class.

		// Using While Loop And sets as true for continnues looping the options till user selects exit.
		
		while (true) {
			System.out.println();
			System.out.println(" == Choose Your Profession == ");
			System.out.println();
			System.out.println("Enter 1 For Professer.");
			System.out.println("Enter 2 For Assistant Professer.");
			System.out.println("Enter 3 For Programer.");
			System.out.println("Enter 4 For Associate Proffesser. ");
			System.out.println("Enter 5 For Exit ");

			int type = sc.nextInt();    // Creating type variable to store the user selescted options.

			if (type == 1)    // Professer Field selected.
			{
				prof.empName = "Ayush";
				prof.empId = 1;
				prof.email_id = "ayush@gmail.com";
				prof.empAddress = "Goregaon";
				double bp1 = prof.Basic_pay = 10000;
				double da = prof.calculateDA(bp1);
				double hra = prof.calculateHRA(bp1);
				double pf = prof.calculatePF(bp1);
				double scf = prof.calculateSCF(bp1);
				double gs = prof.calculateGS(bp1, da, hra);
				double ns = prof.calculateNS(gs, pf, scf);

				System.out.println("Professer Name : " + prof.empName);
				System.out.println("Professer " + prof.empName+ " ID : " + prof.empId);
				System.out.println("Professer Email Id : " + prof.email_id);
				System.out.println("Professer Address : " + prof.empAddress);
				System.out.println("Professer Basic Pay is : " + bp1);
				System.out.println("Professer DA is : " + da);
				System.out.println("Professer HRA is : " + hra);
				System.out.println("Professer PF = " + pf);
				System.out.println("Professer SCF = " + scf);
				System.out.println("Professer Gross Salary = " + gs);
				System.out.println("Professer Net Salary = " + ns);
				System.out.println();
				
				System.out.println("===================================================");
				System.out.println();

			}

			else if (type == 2)   // Assistant Professer Field Selected.
			{
				assispro.empName = "Amit";
				assispro.empId = 2;
				assispro.email_id = "amit@gmail.com";
				assispro.empAddress = "Goregaon";
				double bp2 = assispro.Basic_pay = 20000;
				double da1 = assispro.calculateDA(bp2);
				double hra1 = assispro.calculateHRA(bp2);
				double pf1 = assispro.calculatePF(bp2);
				double scf1 = assispro.calculateSCF(bp2);
				double gs1 = assispro.calculateGS(bp2, da1, hra1);
				double ns1 = assispro.calculateNS(gs1, pf1, scf1);

				System.out.println("Assistant_Professer name : " + assispro.empName);
				System.out.println("Assistant_Professer ID : " + assispro.empId);
				System.out.println("Assistant_Professer Email Id : " + assispro.email_id);
				System.out.println("Assistant_Professer Address : " + assispro.empAddress);
				System.out.println("Basic Pay = " + bp2);
				System.out.println("Assistant_Professer DA = " + da1);
				System.out.println("Assistant_Professer HRA = " + hra1);
				System.out.println("Assistant_Professer PF = " + pf1);
				System.out.println("Assistant_Professer SCF = " + scf1);
				System.out.println("Assistant_Professer Gross Salary = " + gs1);
				System.out.println("Assistant_Professer Net Salary = " + ns1);
				System.out.println();
				System.out.println("===================================================");
				System.out.println();

			}

			else if (type == 3)    // Programer Field Selected.
			{
				programer.empName = "shubham";
				programer.empId = 3;
				programer.email_id = "shubham@gmail.com";
				programer.empAddress = "Goregaon";
				double bp3 = programer.Basic_pay = 30000;
				double da2 = programer.calculateDA(bp3);
				double hra2 = programer.calculateHRA(bp3);
				double pf2 = programer.calculatePF(bp3);
				double scf2 = programer.calculateSCF(bp3);
				double gs2 = programer.calculateGS(bp3, da2, hra2);
				double ns2 = programer.calculateNS(gs2, pf2, scf2);

				System.out.println("Programer name : " + programer.empName);
				System.out.println("Programer ID : " + programer.empId);
				System.out.println("Programer Email Id : " + programer.email_id);
				System.out.println("Programer Address : " + programer.empAddress);
				System.out.println("Basic Pay = " + bp3);
				System.out.println("Programer DA = " + da2);
				System.out.println("Programer HRA = " + hra2);
				System.out.println("Programer PF = " + pf2);
				System.out.println("Programer SCF = " + scf2);
				System.out.println("Programer Gross Salary = " + gs2);
				System.out.println("Programer Net Salary = " + ns2);
				System.out.println();
				System.out.println("===================================================");
				System.out.println();

			}

			else if (type == 4)  // Associate Professer field Selected.
			{
				associate.empName = "shashikant";
				associate.empId = 4;
				associate.email_id = "shashi@gmail.com";
				associate.empAddress = "malad";
				double bp4 = associate.Basic_pay = 40000;
				double da4 = associate.calculateDA(bp4);
				double hra4 = associate.calculateHRA(bp4);
				double pf4 = associate.calculatePF(bp4);
				double scf4 = associate.calculateSCF(bp4);
				double gs4 = associate.calculateGS(bp4, da4, hra4);
				double ns4 = associate.calculateNS(gs4, pf4, scf4);

				System.out.println("Associate_Professer name : " + associate.empName);
				System.out.println("Associate_Professer ID : " + associate.empId);
				System.out.println("Associate_Professer Email Id : " + associate.email_id);
				System.out.println("Associate_Professer Address : " + associate.empAddress);
				System.out.println("Basic Pay = " + bp4);
				System.out.println("Associate_Professer DA = " + da4);
				System.out.println("Associate_Professer HRA = " + hra4);
				System.out.println("Associate_Professer PF = " + pf4);
				System.out.println("Associate_Professer SCF = " + scf4);
				System.out.println("Associate_Professer Gross Salary = " + gs4);
				System.out.println("Associate_Professer Net Salary = " + ns4);
				System.out.println();
				System.out.println("===================================================");
				System.out.println();

			}

			else if (type == 5)  // Exit Field Selected.
			{
				System.out.println("Thanks For Visiting");
				break;

			} else 
			{
				System.out.println("Invalid Proffession Selescted ");
				
			}
		}

	}

}

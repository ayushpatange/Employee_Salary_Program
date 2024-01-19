package employee;

//This is child class named as AssociateProfessor. It has Abstract methods inherited from Employee.

public class Associate_Professer extends Employee{

	// Method To calculate DA its takes Basic_pay as a input paramter.
	
	public double calculateDA(double Basic_pay) {
		double DA = Basic_pay * 97/100;
		return DA;
	}

	// Method To calculate HRA its takes Basic_pay as a input paramter.
	
	public double calculateHRA(double Basic_pay) {
		double HRA = Basic_pay * 10/100;
		return HRA;
	}

	// Method To calculate PF its takes Basic_pay as a input paramter.
	
	public double calculatePF(double Basic_pay) {
		double PF = Basic_pay * 12/100;
		return PF;
	}

	// Method To calculate SCF its takes Basic_pay as a input paramter.
	
	public double calculateSCF(double Basic_pay) {
		double PF = Basic_pay * 0.1/100;
		return PF;
	}

	// Method To calculate Gross Salary its takes Basic_pay as a input paramter.
	
	public double calculateGS(double bp4, double da4, double hra4) {
		double GS = bp4 + da4 + hra4;
		return GS;
	}

	// Method To calculate Net Salary its takes Basic_pay as a input paramter.
	
	public double calculateNS(double gs4, double pf4, double scf4) {
		double NS = gs4- pf4- scf4;
		return NS;
	}

	@Override
	public double calculateDA() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateHRA() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculatePF() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateSCF() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double calculateGS() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateNS() {
		// TODO Auto-generated method stub
		return 0;
	}


	

	

	

}

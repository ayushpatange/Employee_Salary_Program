package employee;

//This is child class named as Professor. It has Abstract methods inherited from Employee.

class Professor extends Employee {

	// Method to calculate DA its take Basic pay parameter.
	
	public double calculateDA(double Basic_pay) {
		double DA = Basic_pay * 97/100;
		return DA;
	}

	// Method to calculate HRA its take Basic pay parameter.
	
	public double calculateHRA(double Basic_pay) {
		double HRA = Basic_pay * 10/100;
		return HRA;
	}

	// Method to calculate PF its take Basic pay parameter.
	
	public double calculatePF(double Basic_pay) {
		double PF = Basic_pay * 12/100;
		return PF;
	}

	// Method to calculate SCF its take Basic pay parameter.
	
	public double calculateSCF(double Basic_pay) {
		double scf = Basic_pay * 0.1/100;
		return scf;
	}

	// Method to calculate Gross Salary its take Basic pay parameter.
	
	public double calculateGS(double Basic_pay, double DA, double HRA) {
		double GS = Basic_pay + DA + HRA;
		return GS;
	}

	// Method to calculate Net Salary its take Basic pay parameter.
	
	public double calculateNS(double Gross_Salary, double Pf, double Scf) {
		double NS = Gross_Salary- Pf- Scf;
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

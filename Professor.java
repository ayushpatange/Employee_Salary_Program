package employee;

class Professor extends Employee {
	
	 //final double Basic_pay = 1000;
	
	public double calculateDA(double Basic_pay) {
		double DA = Basic_pay * 97/100;
		return DA;
	}
	
	public double calculateHRA(double Basic_pay) {
		double HRA = Basic_pay * 10/100;
		return HRA;
	}
	
	public double calculatePF(double Basic_pay) {
		double PF = Basic_pay * 12/100;
		return PF;
	}
	
	public double calculateSCF(double Basic_pay) {
		double scf = Basic_pay * 0.1/100;
		return scf;
	}
	
	public double calculateGS(double Basic_pay, double DA, double HRA) {
		double GS = Basic_pay + DA + HRA;
		return GS;
	}
	
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

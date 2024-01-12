package employee;

public class Associate_Professer extends Employee{
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
		double PF = Basic_pay * 0.1/100;
		return PF;
	}
	
	public double calculateGS(double bp4, double da4, double hra4) {
		double GS = bp4 + da4 + hra4;
		return GS;
	}
	
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

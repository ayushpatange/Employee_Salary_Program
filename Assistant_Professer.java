package employee;

public class Assistant_Professer extends Employee {

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
	
	public double calculateGS(double bp2, double da1, double hra1) {
		double GS = bp2 + da1 + hra1;
		return GS;
	}
	
	public double calculateNS(double gs2, double pf2, double scf2) {
		double NS = gs2- pf2- scf2;
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

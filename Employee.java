package employee;

public abstract class Employee {
	
	protected String empName;
	protected int empId;
	protected String empAddress;
	protected String email_id;
	protected double Basic_pay;
	protected double DA;
	protected double HRA;
	protected double Pf;
	protected double Scf;
	protected double Gross_Salary;
	protected double Net_Salary;
	
	
	public abstract double calculateDA();
	public abstract double calculateHRA();
	public abstract double calculatePF();
	public abstract double calculateSCF();
	public abstract double calculateGS();
	public abstract double calculateNS();
	
	
	

}

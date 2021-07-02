package ClassMethodObj;

public class EmpWageBuilder {

	public static final int IS_EMP_PRESENT = 1;
	public static final int IS_PART_TIME= 2;
	private int numOfCompany=0;
	private Company[] companyArray;

	
	public EmpWageBuilder() {
		companyArray= new Company[5];
	}
	
	private void addCompanyEmpWage (int wAGE_PER_HOUR, int mAX_HRS_ALLOWED, int nUM_OF_WROKING_DAY, String company) {
		companyArray[numOfCompany] = new Company(wAGE_PER_HOUR, mAX_HRS_ALLOWED, nUM_OF_WROKING_DAY, company);
		numOfCompany++;
	}
	
	private void calculateEmpWage() {
		for (int i=0; 0<numOfCompany; i ++) {
			companyArray[i].setTotalEmpWage(this.calculateEmpWage(companyArray[i]));
		}
	}
	
	private static int calculateEmpWage(Company company) {
		int monthlyEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;		
		while (totalEmpHrs <= company.MAX_HRS_ALLOWED && totalWorkingDays <= company.NUM_OF_WROKING_DAY)
		{
			totalWorkingDays++ ;
			int dailywage = 0;
			int empHrs = 0;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int) empCheck) {
			case IS_EMP_PRESENT:
				empHrs= 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
			}
			totalEmpHrs = totalEmpHrs + empHrs;
			dailywage = company.WAGE_PER_HOUR * empHrs ;
			monthlyEmpWage = monthlyEmpWage + dailywage ;			
		}
		System.out.println("monthly wage : " +monthlyEmpWage+" of "+company.company);
		System.out.println("total Hrs : " +totalEmpHrs);
		return monthlyEmpWage;
	}
	
	public static void main(String[] args) 
	{
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage(20, 50, 10, "LTI");
		empWageBuilder.addCompanyEmpWage(30, 45, 10, "TATA");
	}
}
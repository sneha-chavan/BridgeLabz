package ClassMethodObj;

public class Company {
	public final int WAGE_PER_HOUR;
	public final int MAX_HRS_ALLOWED;
	public final int NUM_OF_WROKING_DAY;
	public final String company;
	public int totalEmpWage;
	
	public Company(int wAGE_PER_HOUR, int mAX_HRS_ALLOWED, int nUM_OF_WROKING_DAY, String company) {
		super();
		WAGE_PER_HOUR = wAGE_PER_HOUR;
		MAX_HRS_ALLOWED = mAX_HRS_ALLOWED;
		NUM_OF_WROKING_DAY = nUM_OF_WROKING_DAY;
		this.company = company;
	}


	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}


	@Override
	public String toString() {
		return "Contact [WAGE_PER_HOUR=" + WAGE_PER_HOUR + ", MAX_HRS_ALLOWED=" + MAX_HRS_ALLOWED
				+ ", NUM_OF_WROKING_DAY=" + NUM_OF_WROKING_DAY + ", company=" + company + ", totalEmpWage="
				+ totalEmpWage + "]";
	}
	
	

}

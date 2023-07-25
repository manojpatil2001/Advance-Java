package Demo3;

public class Bank {
	int Ac_no;
	String Bank_name;
	String Branch;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int ac_no, String bank_name, String branch) {
		super();
		Ac_no = ac_no;
		Bank_name = bank_name;
		Branch = branch;
	}
	public int getAc_no() {
		return Ac_no;
	}
	public void setAc_no(int ac_no) {
		Ac_no = ac_no;
	}
	public String getBank_name() {
		return Bank_name;
	}
	public void setBank_name(String bank_name) {
		Bank_name = bank_name;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	@Override
	public String toString() {
		return "Bank [Ac_no=" + Ac_no + ", Bank_name=" + Bank_name + ", Branch=" + Branch + "]";
	}
	

}

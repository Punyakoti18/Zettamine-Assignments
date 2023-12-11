package Assignement;

import java.util.Objects;

public class RegularEmployee extends Employee {

	private String pfNo;
	RegularEmployee(int emp, String empName, int dno,String pfNo) {
		super(emp, empName, dno);
		this.pfNo=pfNo;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(pfNo);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegularEmployee other = (RegularEmployee) obj;
		return Objects.equals(pfNo, other.pfNo);
	}
	
	public String getPfNo() {
		return pfNo;
	}
	
	public void setPfNo(String pfNo) {
		this.pfNo = pfNo;
	}
	
	

}

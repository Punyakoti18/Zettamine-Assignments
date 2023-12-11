package Assignement;

import java.util.Objects;

public class ContractEmployee extends Employee {
	private int contractRegId;
	
	
ContractEmployee(int emp, String empName, int dno,int contactRegId) {
		super(emp, empName, dno);
		this.contractRegId=contactRegId;
}

public int getContractRegId() {
	return contractRegId;
}

public void setContractRegId(int contactRegId) {
	this.contractRegId = contactRegId;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(contractRegId);
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
	ContractEmployee other = (ContractEmployee) obj;
	return contractRegId == other.contractRegId;
}

@Override
public String toString() {
	return super.toString();
}
		


}

package Assignement;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Comparable<Employee>,Serializable{
private int empId;
private String empName;
private int dno;

Employee(int emp,String empName,int dno)
{
	this.empId=emp;
	this.empName=empName;
	this.dno=dno;
	
}


@Override
public String toString() {
	return empName ;
}

@Override
public int hashCode() {
	return Objects.hash(dno, empId, empName);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return dno == other.dno && empId == other.empId && Objects.equals(empName, other.empName);
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public int getDno() {
	return dno;
}

public void setDno(int dno) {
	this.dno = dno;
}

@Override
public int compareTo(Employee o) 
{
	
	return o.getEmpId()-this.getEmpId();
	
}

}

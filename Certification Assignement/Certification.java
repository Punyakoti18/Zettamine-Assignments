package Assignement;

import java.io.Serializable;

public class Certification implements Comparable<Certification>,Serializable {
	private int certID;
	private String title;
	private int rank;
	Certification(int certID,String title,int rank)
	{
		this.certID=certID;
		this.title=title;
		this.rank=rank;
	}
	@Override
	public String toString() {
		return  title ;
	}
	public int getCertID() {
		return certID;
	}
	public void setCertID(int certID) {
		this.certID = certID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public int compareTo(Certification  o) {
		
		
		return this.getRank()-o.getRank();
	}
	

}

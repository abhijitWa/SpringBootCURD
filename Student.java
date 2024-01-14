package SpringBoot_CURDoperation.SpringBoot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	int id;
	String name;
	String branch;
	String addr;
	long number;
	
	
	public Student() {
		System.out.println("Default constructor");
		
	}


	public Student(int id, String name, String branch, String addr, long number) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.addr = addr;
		this.number = number;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public long getNumber() {
		return number;
	}


	public void setNumber(long number) {
		this.number = number;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", addr=" + addr + ", number=" + number
				+ "]";
	}
	
	
	
	
	
}

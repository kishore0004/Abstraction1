package org.sample;

public class Employee implements Bank,Student {
	@Override
	public void bankName() {
		System.out.println("Bank name is KVB");
		}

	@Override
	public void bankLocation() {
		System.out.println("Bank location is OMR");
		
		
	}

	@Override
	public void stuId() {
		System.out.println("student id is 113");
		
	}

	@Override
	public void StuName() {
		System.out.println("student name is kishore ");
		
	}

	@Override
	public void stuAddress() {
		System.out.println("student address is chennai");
		
	}
	private void empName() {
		System.out.println("employee name is abi");

	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.bankName();
		e.bankLocation();
		e.stuId();
		e.StuName();
		e.stuAddress();
		e.empName();
	}

}

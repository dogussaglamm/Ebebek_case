package core;

public class Employee {
	
	public String name;
	public double salary;
	public double workHours;
	public int hireYear;
	
	public Employee(String name, int salary, int workHours, int hireYear) {
		
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	// tax() : Maaşa uygulanan vergiyi hesaplayacaktır
	
	public double tax() {
		if (salary < 1000) {
			return 0;
		} else {
			return salary * 0.03;
		}
	}
	
	// bonus() : Maasa uygulanan bonus'u hesaplayacaktır.
	
	public double bonus() {
		if (workHours > 40) {
			return (workHours - 40) * 30;
		} else {
			return 0;
		}
		
	}
	
	// newSalary(): vergi ve bonuslarla birlikte maaşı hesaplar
	
	public double newSalary() {
		double salary3 = 0;
		salary3 = ((salary + bonus()) - tax());
		return salary3;
	}
	
	// raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını
	// hesaplayacaktır.
	
	public double raiseSalary() {
		
		if ((2021 - hireYear) < 10) {
			return (newSalary() * 0.05);
		} else if ((2021 - hireYear) > 9 && (2021 - hireYear) < 20) {
			return (newSalary() * 0.10);
		} else if ((2021 - hireYear) > 19) {
			return (newSalary() * 0.15);
		} else {
			return 0;
		}
		
	}
	
	// totalSalary() : Çalışanın maaşının en son halini hesaplayacaktır
	
	public double totalSalary() {
		return ((newSalary() + bonus() + raiseSalary()) - tax());
	}
	
	// finalStep() : Çalışana ait bilgileri ekrana bastıracaktır.
	
	public void finalStep() {
		
		System.out.println("Name Surname : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Work Hours: " + workHours);
		System.out.println("Hire Year : " + hireYear);
		System.out.println("Tax : " + tax() + " TL");
		System.out.println("Bonus : " + bonus() + " TL");
		System.out.println("Raise Salary : " + raiseSalary() + " TL");
		System.out.println("Tax and Bonus : " + newSalary() + "TL");
		System.out.println("Total Salary : " + totalSalary() + "TL");
		
	}
	
}

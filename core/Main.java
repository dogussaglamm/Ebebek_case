package core;

public class Main {
	
	public static void main(String[] args) {
		Employee employee1 = new Employee("Dogus Saglam", 900, 38, 2020);
		Employee employee2 = new Employee("Onur Terzioglu", 1500, 45, 2009);
		Employee employee3 = new Employee("Anıl Can Mutlu", 2000, 30, 2002);
		
		employee1.finalStep();
		
		System.out.println("***********************************");
		
		employee2.finalStep();
		
		System.out.println("***********************************");
		
		employee3.finalStep();
		
	}
	
}

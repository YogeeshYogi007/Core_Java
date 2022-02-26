package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(1001,"martin",90000.00,"martin@gmail.com"));
		emp.add(new Employee(1001,"martin1",30000.00,"martin1@gmail.com"));
		emp.add(new Employee(1001,"martin2",50000.00,"martin2@gmail.com"));
		emp.add(new Employee(1001,"martin3",40000.00,"martin3@gmail.com"));
		
		iterateListUsingListIterator(emp);
		addElementsInListUsingListIterator(emp);
		deleteElementsInListUsingListIterator(emp);
		replaceElementsInListUsingListIterator(emp);
		
		
	}
	private static void iterateListUsingListIterator(List<Employee> emp) {
		ListIterator<Employee> listIterator=emp.listIterator();
		System.out.println("Forward Direction:");
		while (listIterator.hasNext()) {
		Employee employee =listIterator.next();
		System.out.println(employee);
}
		System.out.println("Backward Direction:");
	while (listIterator.hasPrevious()) {
		Employee employee = (Employee)listIterator.previous();
		System.out.println(employee);
	}
	}
	
	private static void addElementsInListUsingListIterator(List<Employee> emp) {
		ListIterator<Employee> listIterator=emp.listIterator();
		while (listIterator.hasNext()) {
			Employee employee =listIterator.next();
			if(employee.getName().equalsIgnoreCase("KK")) {
				listIterator.add(new Employee(1001,"martin5",90000.00,"martin@gmail.com"));
				break;
			}
		
		}
		for(Employee employee : emp) {
			System.out.println(employee);
		}

	}
	private static void deleteElementsInListUsingListIterator(List<Employee> emp) {
		ListIterator<Employee> listIterator=emp.listIterator();
		while (listIterator.hasNext()) {
			Employee employee =listIterator.next();
			if(employee.getName().equalsIgnoreCase("martin1")) {
				listIterator.remove();
			}

	}
		for(Employee employee : emp) {
			System.out.println(employee);
		}

	}
		
	private static void replaceElementsInListUsingListIterator(List<Employee> emp) {
		ListIterator<Employee> listIterator=emp.listIterator();
		while (listIterator.hasNext()) {
			Employee employee =listIterator.next();
			if(employee.getName().equalsIgnoreCase("martin1")) {
				employee.setName("Martianee");
				listIterator.set(employee);
			}

	}
		for(Employee employee : emp) {
			System.out.println(employee);
		}

	}
	

	}



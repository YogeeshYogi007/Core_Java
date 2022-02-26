package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class IteratorTest {

	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(1001,"martin",90000.00,"martin@gmail.com"));
		emp.add(new Employee(1001,"martin1",30000.00,"martin1@gmail.com"));
		emp.add(new Employee(1001,"martin2",50000.00,"martin2@gmail.com"));
		emp.add(new Employee(1001,"martin3",40000.00,"martin3@gmail.com"));
		
		Iterator<Employee> iterator=emp.iterator();
		while (iterator.hasNext()) {
			Employee employee =iterator.next();
			if(employee.getSalary()<=40000.00) {
				iterator.remove();
		}
		}
		
			Iterator<Employee> iterator2=emp.iterator();
			while (iterator2.hasNext()) {
				Employee employee =iterator2.next();
				System.out.println(employee);
			}	
			
			System.out.println("---------------");
			Iterator<Employee> iterator3=emp.iterator();
			iterator3.forEachRemaining(System.out::println);
			
		}
		
	
		
		
	}



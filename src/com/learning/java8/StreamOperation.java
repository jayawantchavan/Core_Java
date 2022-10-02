package com.learning.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {

	public static void main(String[] args) {

		// interMediateOperation();
		terminalOperation();

	}

	public static void interMediateOperation() {

		// filter()
		List<Employee> filterList = getEmployeeDetails().stream().filter(obj -> obj.getSalary() > 8000)
				.collect(Collectors.toList());
		System.out.println("Filter Ouput : " + filterList.toString());

		// map, distinct, sorted
		List<Integer> mapList = getEmployeeDetails().stream().map(x -> x.getSalary()).distinct()
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("map Ouput : " + mapList.toString());

		// limit(n) - access first n number of element
		List<Integer> mapListWithLimit = getEmployeeDetails().stream().map(x -> x.getSalary()).distinct()
				.sorted(Collections.reverseOrder()).limit(2).collect(Collectors.toList());
		System.out.println("map Ouput with limit : " + mapListWithLimit.toString());

		// skip(n) - skip first n number of element
		List<Integer> mapListWithSkip = getEmployeeDetails().stream().map(x -> x.getSalary()).distinct()
				.sorted(Collections.reverseOrder()).skip(3).collect(Collectors.toList());
		System.out.println("map Ouput with skip : " + mapListWithSkip.toString());

		// peek - return stream consisting element of current stream
		List<Integer> mapListWithPeek = getEmployeeDetails().stream().map(x -> x.getSalary()).distinct()
				.sorted(Collections.reverseOrder()).limit(2).peek(x -> System.out.print(x + " "))
				.collect(Collectors.toList());
		System.out.println();
		System.out.println("map Ouput with peek : " + mapListWithPeek.toString());

		// flatmap - flatten stream of collections to stream of objects
		List<Employee> list1 = getEmployeeDetails();
		List<Employee> list2 = getEmployeeDetails();
		List<Employee> list3 = getEmployeeDetails();
		List<List<Employee>> listOfCollections = Arrays.asList(list1, list2, list3);
		List<Employee> empList = listOfCollections.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(empList.toString());

	}

	public static void terminalOperation() {

		// min max findFirst findLast return optional
		
		// for each - in parallel sort of parallelism
		getEmployeeDetails().stream().map(x -> x.getSalary()).parallel().sorted()
				.forEach(x -> System.out.print(x + " "));
		System.out.println();

		// for each ordered- in parallel sort of parallelism
		getEmployeeDetails().stream().map(x -> x.getSalary()).parallel().sorted()
				.forEachOrdered(x -> System.out.print(x + " "));
		System.out.println();
		
		// min - return optional so need to use .get
		System.out.println(getEmployeeDetails().stream().map(x -> x.getSalary()).parallel().sorted()
				.min((x, y) -> x.compareTo(y)).get());
		
		// max - return optional so need to use .get
		System.out.println(getEmployeeDetails().stream().map(x -> x.getSalary()).parallel().sorted()
				.max((x, y) -> x.compareTo(y)).get());
		
		// max - return optional
		System.out.println(getEmployeeDetails().stream().map(x -> x.getSalary()).sorted()
				.count());
		
		// anyMatch
		System.out.println(getEmployeeDetails().stream().map(x -> x.getSalary()).anyMatch(x->x>100));
		
		// allMatch
		System.out.println(getEmployeeDetails().stream().map(x -> x.getSalary()).allMatch(x->x>100));
		
		// allMatch
		System.out.println(getEmployeeDetails().stream().map(x -> x.getSalary()).noneMatch(x->x>1000));
		
		// allMatch
		System.out.println(getEmployeeDetails().stream().findFirst().get());
	}

	public static List<Employee> getEmployeeDetails() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Jay", "IT", 10000));
		list.add(new Employee(2, "Shital", "Civil", 5000));
		list.add(new Employee(3, "Pnkaj", "IT", 20000));
		list.add(new Employee(4, "Namrata", "ENTC", 6000));
		list.add(new Employee(5, "Pratik", "ENTC", 10000));
		list.add(new Employee(6, "Pravin", "MECH", 5000));
		return list;

	}

}

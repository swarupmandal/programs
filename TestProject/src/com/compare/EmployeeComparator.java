package com.compare;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	private final boolean isNew;
	
	public EmployeeComparator(boolean isNew) {
		this.isNew = isNew;
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.isNew() ^ o2.isNew()) ? ((o1.isNew() ^ this.isNew) ? 1 : -1) : 0;
	}

}

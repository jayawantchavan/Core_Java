package com.learning.garbage.collector;

public class Program {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1 = null;
		Employee e2 = new Employee();
		e2 = null;
		System.gc(); // System.gc run garbage collector which will call finalize method of Employee
						// class before employee object is being garbage collected
		System.out.println("System gc called");
		
		Program p = new Program();
		p =null;
		
		// if this not called then above System.gc will work only for Employee garbage as e1 = null
		System.gc(); // better to call this at last so it will call all class finalize methods
		
	}

	// This method will called when object of Program class is going to reclaim
	@Override
	protected void finalize() throws Throwable {
		System.out.println("test");
	}
}

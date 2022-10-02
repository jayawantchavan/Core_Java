package com.learning.exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestExceptions {

	// try block must be used with catch or finally or try with resource
	// we cant throw execption directly from catch block. if thrown then cant
	// handle. need to throw from try
	// if exception throw from try then only catch will execute else not.
	public static void main(String[] args) {
		// callCustomExecption();
		// handleParticularExecpion();
		// doNotHandleParticularExecpion();
		// handleExctionByRootException();
		// exceptionHandleInCatch();
		// inexceptionHandleInCatch();
		// exceptionChaining();
	}

	public static void callCustomExecption() {
		try {
			throw new DBExeption.NoData("No row found for id : x");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void handleParticularExecpion() {
		try {
			throw new NumberFormatException();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally");
		}
	}

	// At the last after finally block, default JVM exception handler will handle
	// this exception
	public static void doNotHandleParticularExecpion() {
		try {
			throw new NumberFormatException();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally");
		}
	}

	public static void handleExctionByRootException() {
		try {
			throw new NumberFormatException();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Inside Execption");
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally");
		}
	}

	public static void exceptionHandleInCatch() {
		try {
			throw new NumberFormatException();
		} catch (NumberFormatException e) {
			try {
				new IndexOutOfBoundsException();
			} catch (IndexOutOfBoundsException ex) {
				ex.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("Inside Execption");
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally");
		}
	}

	// we cant throw exception directly from catch block. if thrown then cant
	// handle. need to throw from try
	public static void inexceptionHandleInCatch() {
		try {
			throw new NumberFormatException();
		} catch (NumberFormatException e) {
			throw new IndexOutOfBoundsException();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Inside IndexOutOfBoundsException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Inside Execption");
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally");
		}
	}

	// calling one exception from another exception
	public static void exceptionChaining() {
		try {
			// Creating an exception
			NumberFormatException ex = new NumberFormatException("Exception");

			// Setting a cause of the exception
			ex.initCause(new NullPointerException("This is actual cause of the exception"));

			// Throwing an exception with cause.
			throw ex;
		}

		catch (NumberFormatException ex) {
			// displaying the exception
			System.out.println(ex);

			// Getting the actual cause of the exception
			System.out.println(ex.getCause());
		}
	}

	// We can write try with resource without catch/finally. then need to throws
	// exception at method level
	public static void tryWithResourceWithoutCatch() throws IOException {
		try (FileOutputStream fileOutputStream = new FileOutputStream("/abc.txt")) {

			String msg = "Welcome to javaTpoint!";
			byte byteArray[] = msg.getBytes(); // Converting string into byte array
			fileOutputStream.write(byteArray); // Writing data into file
			System.out.println("Data written successfully!");
		}

	}

	// If try with resource and catch/ finally then no need to throws.
	public static void tryWithResourceWithCatchANdFinally() {
		try (FileOutputStream fileOutputStream = new FileOutputStream("/abc.txt")) {

			String msg = "Welcome to javaTpoint!";
			byte byteArray[] = msg.getBytes(); // Converting string into byte array
			fileOutputStream.write(byteArray); // Writing data into file
			System.out.println("Data written successfully!");
		} catch (Exception exception) {
			System.out.println(exception);
		} finally {
			System.out.println("Finally executes after closing of declared resources.");
		}

	}

}

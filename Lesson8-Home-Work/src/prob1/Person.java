package prob1;

class Person {
	private String lastName;
	private String firstName;
	private int age;

	// --------------------------------------------------------------
	public Person(String last, String first, int a) {
		// constructor
		lastName = last;
		firstName = first;
		age = a;
	}

	// --------------------------------------------------------------
	public String getLastName() {
	// get last name
			return lastName;
	}

	@Override
	public String toString() {
		return lastName + " " + firstName + " " + age;
	}
	// end class Person
}

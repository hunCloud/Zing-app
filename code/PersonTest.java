// import Person;

public class PersonTest {
	public static void main(String[] args) {
		Person edison = new Person("Thomas Edison");
		String name = edison.getName();
		System.out.println("Person 1: " + name);

		Person billGate = new Person("Bill Gates");
		String name2 = billGate.getName();

		System.out.println("Person 2: " + name2);

	}
}
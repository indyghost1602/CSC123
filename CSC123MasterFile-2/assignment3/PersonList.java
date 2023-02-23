import java.util.ArrayList;

public class PersonList {

	private ArrayList<Object> people;

	public PersonList() {
		people =new ArrayList<>();
	}
	
	public void addPerson(PersonCode person) {
		people.add(person);
		System.out.println("Thank you, user "+person.toString()+" has been registered");
	}
		
	public void listPeople() {
		people.forEach(System.out::println);
		//another way to print
		//for(Account a:accounts);
		//System.out.println(a);
		
	}
	
	}
	


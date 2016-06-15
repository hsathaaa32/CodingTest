import java.util.HashSet;
import java.util.Set;

public class Problem4_Match {
	public boolean doTheyMatch(Person p1, Person p2) {
		if(!p1.equals(p2))
		  return false;
		
		//If I add both to a Set does it enforce uniqueness?
		Set<Person> setPerson = new HashSet<Person>();
		setPerson.add(p1);
		setPerson.add(p2);
		
		if(setPerson.size()!=1)
		  return false;
		
		//If both conditions above are true, then return true, else false;
		return true;
	}
}

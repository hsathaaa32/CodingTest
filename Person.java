
public class Person {
	
	public Person(String name, byte age, String address, String city,
			String state, short zip) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	String name;
	byte age;
	String address;
	String city;
	String state;
	short zip;

        public boolean equals(Object obj) {
        	if(obj==this)
        	   return true;
        	if(!(obj instanceof Person)) {
        		return false;
        	}
        	Person p = (Person) obj;
        	return ( ((name!=null) && name.equals(p.name)) || (name==null&&p.name==null) )
        		&& age = p.age
        		&& ( ((address!=null) && address.equals(p.address)) || (address==null&&p.address==null) )
        		&& ( ((city!=null) && city.equals(p.city)) || (city==null&&p.city==null) )
        		&& ( ((state!=null) && state.equals(p.state)) || (state==null&&p.state==null) )
        		&& zip = p.zip;
        }
}

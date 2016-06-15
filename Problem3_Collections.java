
public class Problem3_Collections {
	public void collectionFun() {
		//Requirements: Generate 100 random numbers between 1-1000.
		//	Put the numbers into a Map.  Then move them to a Set.
		//  Then move the numbers into a List.  Then sort the numbers.
		//	Finally output the numbers, with one number on every row
		
		Map map = new HashMap();
		Random rand = new Random();
		for(int i=0; i<100; i++)
		  map.put(rand.nextInt(999)+1,0);
		Set set = new HashSet();
		set.add(map.keySet());
		
		List list = new ArrayList();
		list.add(Collections.getList(set));
		
		list = Arrays.asList(Arrays.sort(list.toArray()));
		
		for(int i=0; i<list.size(); i++) {
			System.out.prinln(list.get(i));
		}

	}
}

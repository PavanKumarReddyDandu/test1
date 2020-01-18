Map<String,String> classList = new HashMap<String,String>();
public ClassGrades(){
	classList.put("Bob","A"); 
	classList.put("Mary","C"); 
	classList.put("Sarah","B");
	classList.put("Philip","A");
	classList.put("Greg","F");
}

public void printClassList(){
	Iterator<Entry<String,String>>entries = classList.entrySet().iterator();
	while(entries.hasNext()){
		Entry<String, String> entry = entries.next();
		System.out.println("key = "+entry.getKey() + ",Value = " + entry.getValue());
	}
}

public void printClassList2(){
	for(Map.Entry<String, String> entry : classList.entryset()){
		System.out.println("key = "+entry.getKey() + ",Value = " + entry.getValue());
	}
	//iterating over keys 
	for(String Key : classList.KeySet()){
		System.out.println("key = "+ key);
	}  
	//iterating over values
	for(String value : classList.values()){
		System.out.println("Value = " +value);
	}
}
public static void main(String[] args) {
	ClassGrades myClassList = new ClassGrades();
	myClassList.printClassList();
}
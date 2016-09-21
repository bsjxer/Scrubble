package clasS.abstracT;

public abstract class Person extends Animal {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void feel();

	public Person(){
		
	}

	public Person(String name) {
		this.name = name;
	}

}

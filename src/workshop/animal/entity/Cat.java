package workshop.animal.entity;

public class Cat extends Animal implements Pet{
	private String name;

	public Cat(String name) {
		super(4);
		this.name = name;
	}
	public Cat() {
		this("");
	}
	
	
}

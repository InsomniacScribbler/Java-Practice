package Annotaions;

public class Animal {
	void display(){
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		monkey m = new monkey();
		m.display();

	}
}
class monkey extends Animal{
	@Override
	void display(){
		System.out.println("Not hello");
	}
}

package written_Constructor5;

public class Apple {    //Copy Constructor
	int id;
	String name;

	Apple(int id, String name) {  
		this.id = id;
		this.name = name;
	}

	Apple(Apple s) {
		id = s.id;
		name = s.name;
		
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Apple S1 = new Apple(101, "Omkar");
		Apple S2 = new Apple(S1);
		S1.display();
		S2.display();
	}

}

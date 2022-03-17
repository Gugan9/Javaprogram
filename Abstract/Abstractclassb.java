package buffer;

public abstract class Abstractclassb {
	Abstractclassb() {
		System.out.println("no argument constructor 1");
	}

	Abstractclassb(String a) {
		this();
		System.out.println("argument constructor 2");
	}

	static {
		System.out.println("multiline static intilizer");
	}
	
	{
		System.out.println("non static  ");
	}

	public abstract void met();
}

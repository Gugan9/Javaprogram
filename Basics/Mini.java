package static9;

public class Mini {
	int a = 9;
	int b = 99;
	{
		System.out.println("non static multiline excueted");
	}

	public Mini() {
		System.out.println("programmer written intructions excueted");
	}

	public Mini(int ccc) {
		this();
		this.a = ccc;
		System.out.println("programmer written instruction in mini(int a) constructor");
	}

	public Mini(int a, int b) {
		this(a);
		this.b = b;
		System.out.println("programmer written instruction in mini(int a,int b) constructor");
	}

	public static void main(String[] args) {
		System.out.println("main string method got excueted");
		Mini mini = new Mini(1,999);
		System.out.println(mini.a);
		System.out.println(mini.b);
	}

}

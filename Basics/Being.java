package static9;

public class Being {
public static void main(String[]args) {
Human hu =new Human();
hu.setName("Gugan");
hu.setAge(99);
hu.setHeight(99);
hu.setAddress(hu.createAddressObj());
System.out.println(hu.getName());
System.out.println(hu.getAge());
System.out.println(hu.getHeight());
System.out.println(hu.getAddress());
}
}

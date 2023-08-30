package literals;

public class eg5 {
	{
		int a= 10;
		int b= 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println("instance Block");
	}
	//static block has high preority
	static {
		int a =10;
		int b =20;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		new eg5();
		
	}

}

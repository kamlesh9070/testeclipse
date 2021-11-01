package JavaDemo;

import java.util.ArrayList;

public class CollectionsDemo {
	
	static public class test {
		
	}
	
	CollectionsDemo() {
		System.out.println("sdsd");
	}
	{
		System.out.println("KK");
	}

	static {
		System.out.println("1212");
	}
	public static void main(String arg[]) {
		
		CollectionsDemo c = new CollectionsDemo();
		CollectionsDemo.test t = new CollectionsDemo.test();
		/*ArrayList<Integer> list = new ArrayList<>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		for (Integer value : list) {
		   if (value.equals(3))  
		      list.remove(value);  
		}
		System.out.println("List Values:" + list); */
	}
}

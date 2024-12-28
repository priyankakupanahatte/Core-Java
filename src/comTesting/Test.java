package comTesting;

import com.Controller.Controll;
import com.entity.Employee;
public class Test {
	public static void main(String[] args) {
		Controll c1 = new Controll();
		Controll c2 = new Controll();
		System.out.println(c1.control());
		Employee e1[] =c2.control1();
		System.out.println(e1);

		//		for(int i=0;i<e1.length;i++);
//		{
//			int i = 0;
//			System.out.println(e1[i]);
//		}
		for(Employee e:e1)
		{
			System.out.println(e.getSal());
		}
	}

}

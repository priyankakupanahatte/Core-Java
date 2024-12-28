package com.Service;

import com.Dao.Daoo;
import com.entity.Employee;

public class Servicee {
	Daoo o1;
	Daoo o2;
	public Employee s1()
	{
		o1=new Daoo();
		Employee e1=o1.oneEmployee();
		return e1;
	}
	public Employee[] s2()
	{
		o2=new Daoo();
		Employee[] e1=o2.manyEmployee(5);
		return e1;

	}

}

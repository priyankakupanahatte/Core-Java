package com.Controller;



import com.Service.Servicee;
import com.entity.Employee;

public class Controll {
	Servicee service;
	Servicee service1;
	public Employee control()
	{
		service=new Servicee();
		Employee e1=service.s1();
		return e1;
		
	}
	public Employee[] control1()
	{
		service1=new Servicee();
		Employee[] e1=service1.s2();
		return e1;
		
	}

}

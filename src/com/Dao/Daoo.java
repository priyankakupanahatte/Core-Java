package com.Dao;

import com.entity.Employee;

public class Daoo {
	
	public Employee oneEmployee()
	{
		Employee e1=new Employee(101,"priyanka",30000,"dev");
		return e1;
	}
	public Employee[] manyEmployee(int size)
	{
		Employee[]db=new Employee[size];
		db[0]=  new Employee(102,"jay",25000,"test");
		db[1]=  new Employee(103,"abc",30000,"test");
		db[2]=  new Employee(104,"cdf",25000,"dev");
		db[3]=  new Employee(105,"aboli",35000,"test");
		db[4]=  new Employee(106,"harshada",35000,"dev");
		return db;
	}

}

package com.geek;

public class LambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalcImp calc = new CalcImp();
		float res = calc.add(6.5f, 0.0f);
		System.out.println("Sum is : "+res);
		
		// Lambda
		Calculator c = (x,y)->{
			return x+y;
			};
		
			float fc = c.add(10, 9);
			System.out.println("In Lambda, Sum is : "+fc);
	}

}

interface Calculator{
	float add(float x,float y);
	
}

class CalcImp implements Calculator{
	public float add(float x, float y) {	
		return x+y;
	}	
}
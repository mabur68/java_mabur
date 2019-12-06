package ru.stqa.pft.sandbox;

public class MyFirstProgram {


	public static void main(String[] args){
		for(int i=0; i<10; i++) {
			if(i%2!=0){
                System.out.println("hai");
			    continue;
            }
			System.out.println("hello, world");
		}
	}
	}
	
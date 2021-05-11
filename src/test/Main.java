package test;


//Online IDE - Code Editor, Compiler, Interpreter
import java.util.*;
public class Main
{
 public static void main(String[] args) {
	 Main x = new Main();
     List<Emp> list = new ArrayList<>();
     list.add(x.new Emp("venkat",25.3));
    // List list = Arrays.asList(new Emp("venkat",25.3),new Emp("raj",28.0));
     System.out.println("Welcome to Online IDE!! Happy Coding :)"+list);
 }
  class Emp{
 private String name;
 private Double age;
 
 public Emp(String name, Double age){
     this.name = name;
     this.age = age;
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Double getAge() {
	return age;
}

public void setAge(Double age) {
	this.age = age;
}
 
 
}
}



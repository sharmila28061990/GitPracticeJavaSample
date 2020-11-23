package org.cts;

public class SuperConstr extends ParentSuper {
public SuperConstr() {
	super(10);
	System.out.println("Default");
}
public SuperConstr(int a) {
	super("Java");
	System.out.println("int para");
}
public SuperConstr(String s) {
	System.out.println("String para");
}

public static void main(String[] args) {
	SuperConstr sc = new SuperConstr();
	SuperConstr sc1 = new SuperConstr(100);
}
}

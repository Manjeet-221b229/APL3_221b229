/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Mother m1 =new Child();
		m1.show();
	}
}
//No static method-->child class show method executed
//Mother class show method made static-->error - show() in Child cannot override show() in Mother
//Child class show method made static-->error - show() in Child cannot override show() in Mother
//both class show method made static-->Mother class show method executed
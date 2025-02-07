/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Duck
{
    void swim();
}

interface Squeak {
    void squeak();
}

interface Quack {
    void quack();
}

interface Fly {
    void fly();
}

interface Mute {
    void mute();
}

    
public class Main
{
	public static void main(String[] args) {
	    RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();
        
		rubberDuck.swim();
        rubberDuck.squeak();
        System.out.println();
        woodenDuck.swim();
        woodenDuck.mute();
        System.out.println();
        redHeadDuck.swim();
        redHeadDuck.quack();
        System.out.println();
        lakeDuck.swim();
        lakeDuck.quack();
        
        
        
	}
}

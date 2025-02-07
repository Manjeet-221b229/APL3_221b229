/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        Kaurav[] k = new Kaurav[99];
        Pandav[] p = new Pandav[4];
        Vikarn v = new Vikarn();
        Bheem b = new Bheem();

        for (int i = 0; i < 99; i++) {
            k[i] = new Kaurav();
        }

        for (int j = 0; j < 4; j++) {
            p[j] = new Pandav();
        }

        k[0].fight();
        k[0].obedience();
        k[0].kindness();
        
        System.out.println();
        
        p[0].fight();
        p[0].obedience();
        p[0].kindness();

        System.out.println();
        v.fight();
        v.obedience();
        v.kindness();
        System.out.println();

        b.fight();
        b.obedience();
        b.kindness();
    }
}

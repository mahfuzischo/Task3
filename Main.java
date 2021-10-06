/*
Mahfuzul Islam Chowdhury
ID:2012020111
Section:C
E-mail:cse_2012020111@lus.ac.bd
Date of submission: 11 September 2021
 */
package mahfuz;

public class Main {

    public static void main(String[] args) {
	 Player player = new Player( "Shakib",75);
	 Cricket cricket = new Cricket( "International match",20,player);

	 cricket.display();
	 Football football = new Football();
    }
}

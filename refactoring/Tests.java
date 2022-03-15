import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Tests {
  @Test
	public void testStatement() {
       Movie titanic = new Movie("Titanic", Movie.REGULAR);
		   Movie xmen = new Movie("X-men", Movie.NEW_RELEASE);

		   Rental rent1 = new Rental(titanic, 1);
		   Rental rent2 = new Rental(xmen, 2);

		   Customer client = new Customer("Fernanda");
		   client.addRental(rent1);
		   client.addRental(rent2);

		   assertEquals("Rental Record for Fernanda\n" +
		   		"	Titanic	2.0\n" +
		   		"	X-men	6.0\n" +
		   		"Amount owed is 8.0\n" +
		   		"You earned 3 frequent renter points", client.statement());
	}
}

package refactoring;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestCustomer {

	@Test
	public void test() {
		//PELICULAS DE ALQUILER
		Movie movie1=new Movie("Titanic",2);
		Movie movie2=new Movie("Diario de Noa",0);
		Movie movie3=new Movie("Sherlock Holmes",1);
		
		//ALQUILERES
		Rental rental1=new Rental(movie1,4);
		Rental rental2=new Rental(movie2,2);
		Rental rental3=new Rental(movie3,2);
		
		//CLIENTES
		Customer customer1=new Customer("Jose");
		Customer customer2=new Customer("Gema");
		
		customer1.addRental(rental1);
		customer2.addRental(rental2);
		customer2.addRental(rental3);
		
		
		assertEquals(customer2.statement(),"Rental Record for Jose"+"\n"+"	Titanic"+"\n"+"	Diario de Noa	6.0"+"\n"+"Amount owed is 8.0"+"\n"+"You earned 3 frequent renter points");
		assertEquals(customer1.statement(),"Rental Record for Gema"+"\n"+"	Titanic	3.0"+"\n"+"Amount owed is 3.0"+"\n"+"You earned 1 frequent renter points");
	}

}
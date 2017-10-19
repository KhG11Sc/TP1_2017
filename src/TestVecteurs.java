import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class TestVecteurs {

	@Test
    public void testmin(){
		ArrayList <Long> tab= new ArrayList (){{add((long)19);add((long)1);add((long)88);add((long)12);add((long)3);}};
		Vecteurs test = new Vecteurs(tab);
		long resultat = test.Min(tab);
		assertEquals(1,resultat);
	}
	/**
	 * testMax :est une méthode qui fait le teste unitaire de la methode Max.
	 */
	@Test
    public void testmax(){
		ArrayList <Long> tab= new ArrayList (){{add((long)19);add((long)1);add((long)88);add((long)12);add((long)3);}};
		Vecteurs test = new Vecteurs(tab);
		long resultat = test.Max(tab);
		assertEquals(88,resultat);
	}

	
	
	
}

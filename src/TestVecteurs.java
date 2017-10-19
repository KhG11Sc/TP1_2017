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

	/**
	 * testinverse :est une méthode qui fait le teste unitaire de la methode inverse.
	 */

	@Test
    public void testfacto_tab(){
		ArrayList <Long> tab= new ArrayList (){{add((long)2);add((long)0);add((long)3);add((long)4);add((long)5);}};
		ArrayList <Long> tab2= new ArrayList (){{add((long)2);add((long)1);add((long)6);add((long)24);add((long)120);}};
	    ArrayList <Long> result = new ArrayList <Long>();
		Vecteurs test = new Vecteurs(tab) ;
		result = test.facto_tab(tab);
		Object[] resulttest = result.toArray();
		Object[] tab2test = tab2.toArray();
		Assert.assertArrayEquals(tab2test,resulttest);		
    }
	
	
}

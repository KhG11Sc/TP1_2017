import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class TestVecteurs {
	/**
	 * testtritab :est une méthode qui fait le teste unitaire de la methode tritab.
	 */

	@Test
	public void testtritab() {
	    ArrayList <Long> tab= new ArrayList (){{add((long)19);add((long)1);add((long)88);add((long)12);add((long)3);}};
	    ArrayList <Long> tab2= new ArrayList (){{add((long)1);add((long)3);add((long)12);add((long)19);add((long)88);}};
	    ArrayList <Long> result = new ArrayList <Long>();
		Vecteurs test = new Vecteurs(tab) ;
		result = test.triTab(tab);
		Object[] resulttest = result.toArray();
		Object[] tab2test = tab2.toArray();
		Assert.assertArrayEquals(tab2test,resulttest);		
	}
}
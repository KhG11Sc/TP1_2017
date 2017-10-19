import java.util.ArrayList;
import java.util.Collections;
public class Vecteurs {
		private ArrayList<Long> vecteur;
		/**
		 * Vecteurs est un constructeur.
		 * Il construit un vecteur qui contient des nombres entiers (Long)
		 * @param vecteur c'est un tableau dynamique (vecteur)qui va contenir les valeurs 
		 */
		
		public Vecteurs (ArrayList<Long> vecteur){
			this.vecteur=vecteur;
			
		}
		/**
		 * getVecteur :est une m�thode qui retourne le vecteur de la classe (getter).
		 * @return vecteur le tableau dynamique.
		 */
		public ArrayList<Long> getVecteur() {
			return vecteur;
		}
		public Long Min (ArrayList<Long> tab) {
			long k = Collections.min(tab);
		    return k;
		}
		/**
		 *Max (ArrayList(Long) tab): est une m�thode (long) Max a pour r�le d'extraire l'�lement maximum du vecteur tab donn� en entr�e
		 * cela en incluant encore une fois la structure Collections et la m�thode max . 
		 * @param tab est le vecteur en entr�e lequel on veut extraire son MAX  .
		 * @return le Max du tableau dynamique en entr�e.
		 */
		public Long Max (ArrayList<Long> tab) {
		    long j = Collections.max(tab);
		    return j;
		}
		/**
		 * facto_tab(ArrayListr(Long) tab): est une m�thode qui sert � appliquer la fonction factorielle � tous les �lements du tableau tab.
		 * @param tab est le vecteur en entr�e lequel on veut appliquer la fonction FACTORIELLE.
		 * @return un tableau dynamique dont ses �lements sont la factorielle des �lements du tableau en entr�e.
		 */
		

}

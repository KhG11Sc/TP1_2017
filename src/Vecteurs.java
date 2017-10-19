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
		 * getVecteur :est une méthode qui retourne le vecteur de la classe (getter).
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
		 *Max (ArrayList(Long) tab): est une méthode (long) Max a pour rôle d'extraire l'élement maximum du vecteur tab donné en entrée
		 * cela en incluant encore une fois la structure Collections et la méthode max . 
		 * @param tab est le vecteur en entrée lequel on veut extraire son MAX  .
		 * @return le Max du tableau dynamique en entrée.
		 */
		public Long Max (ArrayList<Long> tab) {
		    long j = Collections.max(tab);
		    return j;
		}
		/**
		 * facto_tab(ArrayListr(Long) tab): est une méthode qui sert à appliquer la fonction factorielle à tous les élements du tableau tab.
		 * @param tab est le vecteur en entrée lequel on veut appliquer la fonction FACTORIELLE.
		 * @return un tableau dynamique dont ses élements sont la factorielle des élements du tableau en entrée.
		 */
		public ArrayList<Long> facto_tab(ArrayList<Long> tab){
			ArrayList<Long> tab3=new ArrayList<Long> ();
			for(int i=0;i<tab.size();i++)
			{
				tab3.add(tab.get(i));
			}
			for(int i=0;i<tab3.size();i++)
			{
				tab3.set(i, fact(tab3.get(i)));
				
			}
			return tab3 ;
			}
		/**
		 * 
		 * @param n représente le nombre à calculer sa factorielle.
		 * @return Elle retourne la factorielle d' l'entier donné n!
		 */
		public long fact (long n){
			long inter=1 ;
			long facto=0;
			for (int i =2 ;i<=n;i++)
			{
				inter = inter*i;
				
			}
			facto=inter;
			return facto;
		}

}

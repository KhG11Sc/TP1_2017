import java.util.ArrayList;
import java.util.Collections;
/**
 * Cette classe consiste � r�aliser quelques applications 
 * sur les vecteurs telles que le tri des vecteurs, la somme de
 * deux vecteurs de meme taille bien �videmment , g�n�rer l'inverse
 * d'un vecteur, fournir une formule pour les �lements d'un vecteur et
 * extraire du vecteur la valeur maximale et minimale.
 *@author MEDKOUR Kheir Eddine et ZINE Hocine.
 *@version 1.0
 */
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
	/**
	 *setVecteur :(ArrayList(long)) est une m�thode qui affecteur un vecteur � celui de la classe(setter).
	 * @param vecteur est un tableau dynamique.
	 */
	public void setVecteur(ArrayList<Long> vecteur) {
		this.vecteur = vecteur;
	}
	/**
	 *triTab :(ArrayList(long)) est m�thode qui sert � trier un tableau dynamique
	 * en faisant des permutations entre les �lements du tableau
	 * cela en incluant la structure Collections et la m�thode sort qui trie le vecteur.
	 * @param tab est un tableau dynamique(ArrayList).
	 */
	public ArrayList<Long>  triTab(ArrayList<Long> tab){
		ArrayList<Long> tab3=new ArrayList<Long> (); 
		for(int i=0;i<tab.size();i++)
		{
			tab3.add(tab.get(i));
		}
	Collections.sort(tab3);
	return tab3 ;
	}
}
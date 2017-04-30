package devoir;

//question 4
public class Groupe {
	public static void main(String[] agrs){
		
		/*i.*/ Personne med = new Personne("Mohamed","Diallo",25);
		/*ii.*/ Personne sidi = new Personne("Sid","Abdallah");
		
		System.out.println(med.sePresenter());
		System.out.println(sidi.sePresenter());
		
		/*question 5
		 * on ne peut pas afficher le nom  seul sans utiliser 
		 * la methode sePeresenter() car il est declare privete.
		 * la methode getNom() est cree dans la classe Personne
		 * */
		
		System.out.println(med.getNom());
		
		//Exercie 3
		//question 3
		Professeur prof = new Professeur("Diakite","Med Liman",53);
		System.out.println(prof.sePresenter());//ici la methode sePresenter() est ce lui de la class Professeur
		
		Personne p = prof;
		System.out.println(p.sePresenter());//ici la methode sePresenter() est ce lui de la class Personne
		
		//question 4
		System.out.println(prof.getNom());
		/*
		 * on a pas besion de redefinir la mothode
		 * getNom() dans la class professeur car elle joue le meme role que celle de la classe Personne*/
		
		/*question 6
		 * on ne peut pas afficher l'etablissement de la personne p,
		 * car la classe personne n'a pas l'attribut Etablissement
		 * */
	}
	
}






















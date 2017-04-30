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
	}
}

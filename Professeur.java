package devoir;

public class Professeur extends Personne{
	
	//question 5, partie 1
	private String EtablissementAffiliation;
	
	//question 1
	//les constructeurs
	public Professeur(String prenom, String nom, int age){
		super(prenom,nom,age,"Professeur");
	}
	
	//question 5, partie 2 get et set
	public void setEtablisssement(String ets){
		this.EtablissementAffiliation = ets;//this ici n'est pas obligatoire 
	}
	
	public String getEtablissement(){
		return EtablissementAffiliation;
	}
	
	//question 2
	public String sePresenter(){
		return super.sePresenter() + " et je suis Professeur";
	}
}

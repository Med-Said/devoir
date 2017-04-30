package devoir;

public class Personne {
	//question 1
	//les attribut
	private String prenom, nom,profession;
	private int age;
	
	//question 2
	//les constructeurs
	public Personne(String prenom,String nom, int age){
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.profession = "";
	}
	
	public Personne(String prenom, String nom){
		this.prenom = prenom;
		this.nom = nom;
		this.age = -1;
		this.profession = "";
	}
	
	public Personne(String prenom,String nom, int age,String profession){
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.profession = profession;
	}
	
	//question 3
	//la methode sePresenter()
	public String sePresenter(){
		if(this.age != -1){
			return "Je m'appelle " + prenom + " " + nom + ", j'ai " + age + " ans";
		}
		else{
			return "Je m'appelle " + prenom + " " + nom;
		}
	}
	
	//question 5
	public String getNom(){
		return nom;
	}
}
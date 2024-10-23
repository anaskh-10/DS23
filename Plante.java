package DS;

public class Plante {
	public String nom;
	public double hauteur;
	public int age;
	public double prix;
	public Plante(String nom,double hauteur,int age,double prix) {
		this.nom=nom;
		this.hauteur=hauteur;
		this.age=age;
		this.prix=prix;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return "votre nom est : "+nom+"l'hauteur : "+hauteur+"l'age : "+age+"et le prix: "+prix;
	}
	public void description() {
		System.out.println(this.toString());
	}
	public double absorptionCO2() {
		return 0.0;
	}
}

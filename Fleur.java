package DS;

public class Fleur extends Plante {
	public String couleur;
	public int moisF;
	public Fleur(String nom,double hauteur,int age,double prix,String couleur,int moisF) {
		super(nom,hauteur,age,prix);
		this.couleur=couleur;
		this.moisF=moisF;
	}
	public void description() {
		System.out.println(this.toString()+"couleur: "+couleur+"mois de la fleur: "+moisF);
	}
	public void fleurir() {
		switch(this.moisF) {
		case 4:
			System.out.println("La fleur est en fleurs");
			break;
		case 5:
			System.out.println("La fleur est en fleurs");
			break;
		case 6:
			System.out.println("La fleur est en fleurs");
			break;
		default:
			System.out.println("la fleur ne devient pas en fleurs");
		}
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
}

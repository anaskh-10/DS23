package DS;

public class Pépinière {
	public Plante[]inventaire;
	public static final int MAX_PLANTES=1000;
	public int nombreDePlantes;
	public Pépinière() {
		this.inventaire=new Plante[MAX_PLANTES];
		this.nombreDePlantes=0;
	}
	public void ajoutPlante(Plante plante) {
		if(nombreDePlantes>MAX_PLANTES) {
			System.out.println("la Pépinière est complet .\n");
		}else {
			inventaire[nombreDePlantes]=plante;
			nombreDePlantes++;
			System.out.println("Plante ajoutee: "+plante.nom);
		}
	}
	public void afficherInventaire() {
		if(nombreDePlantes==0) {
			System.out.println("l'inventaire est vide .");
		}else {
			System.out.println("Inventaire des plantes:");
			for(int i=0;i<nombreDePlantes;i++) {
				inventaire[i].description();
			}
		}
	}
	public double totalAbsorptionTotaleCO2(){
		double tot=0;
		for(int i=0;i<nombreDePlantes;i++) {
			tot+=inventaire[i].absorptionCO2();
		}
		return tot;
	}
	public static void main(String[] args) {
		System.out.println("        Pépinière GREEN HANDS");
        Pépinière pépinière = new Pépinière();
        Fleur rose = new Fleur(null, 30, 12, 15.99, "Rouge", 2);
        Fleur tulipe = new Fleur("Tulipe", 20, 8, 12.99, "Jaune", 4);
        Arbre chêne = new Arbre("Chêne", 200, 60, 89.99, "Caduque");
        Arbre sapin = new Arbre("Sapin", 150, 30, 59.99, "Persistant");
        rose.setNom("Rose");
        System.out.println("la "+rose.getNom()+" a le couleur "+rose.getCouleur());
        pépinière.ajoutPlante(rose);
        pépinière.ajoutPlante(tulipe);
        pépinière.ajoutPlante(chêne);
        pépinière.ajoutPlante(sapin);
        pépinière.afficherInventaire();
        System.out.println("Total Aborption CO2        "+   pépinière.totalAbsorptionTotaleCO2());
  	}
}

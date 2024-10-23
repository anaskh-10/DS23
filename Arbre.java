package DS;

public class Arbre extends Plante{
	public String type_Feuillage;
	public final double AbsorMoyenne=22;
	public Arbre(String nom,double hauteur,int age,double prix,String type_Feuillage) {
		super(nom,hauteur,age,prix);
		this.type_Feuillage=type_Feuillage;
	}
	public void description() {
		System.out.println(this.toString()+"type de Feuillage: "+type_Feuillage+"M d'absorbation CO2: "+AbsorMoyenne);
	}
	public double absorptionCO2() {
		if(this.hauteur>5000) {
			return this.AbsorMoyenne+3;
		}else
			return this.AbsorMoyenne;
	}
}


package operations1;

// Classe Nombre1
public class Nombre1 {
    private int valeurNombre;
    
    public Nombre1(int valeur) {
        this.valeurNombre = valeur;
    }
    
    public int valeur() {
        return valeurNombre;
    }
    
    @Override
    public String toString() {
        return String.valueOf(valeurNombre);
    }
}
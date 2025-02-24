package operations2;

// Classe Nombre modifiée pour hériter d'Expression
public class Nombre2 extends Expression {
    private int valeurNombre;
    
    public Nombre2(int valeur) {
        this.valeurNombre = valeur;
    }
    
    @Override
    public int valeur() {
        return valeurNombre;
    }
    
    @Override
    public String toString() {
        return String.valueOf(valeurNombre);
    }
}
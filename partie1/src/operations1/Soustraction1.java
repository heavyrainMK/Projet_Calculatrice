package operations1;

// Classe Soustraction1
public class Soustraction1 extends Operation1 {
    public Soustraction1(Nombre1 op1, Nombre1 op2) {
        super(op1, op2);
    }
    
    @Override
    public int valeur() {
        return getOperande1().valeur() - getOperande2().valeur();
    }
    
    @Override
    public String toString() {
        return "(" + getOperande1() + " - " + getOperande2() + ")";
    }
}
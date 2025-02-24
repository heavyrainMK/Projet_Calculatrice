package operations1;

// Classe Division1
public class Division1 extends Operation1 {
    public Division1(Nombre1 op1, Nombre1 op2) {
        super(op1, op2);
    }
    
    @Override
    public int valeur() {
        if (getOperande2().valeur() == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return getOperande1().valeur() / getOperande2().valeur();
    }
    
    @Override
    public String toString() {
        return "(" + getOperande1() + " / " + getOperande2() + ")";
    }
}
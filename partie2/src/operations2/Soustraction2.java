package operations2;

// Classe de Soustraction modifiée pour utiliser Expression
public class Soustraction2 extends Operation2 {
    public Soustraction2(Expression op1, Expression op2) {
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
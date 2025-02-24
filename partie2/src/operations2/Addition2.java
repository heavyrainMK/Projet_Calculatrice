package operations2;

// Classe d'Addition modifiée pour utiliser Expression
public class Addition2 extends Operation2 {
    public Addition2(Expression op1, Expression op2) {
        super(op1, op2);
    }
    
    @Override
    public int valeur() {
        return getOperande1().valeur() + getOperande2().valeur();
    }
    
    @Override
    public String toString() {
        return "(" + getOperande1() + " + " + getOperande2() + ")";
    }
}
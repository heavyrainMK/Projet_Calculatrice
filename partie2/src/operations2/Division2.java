package operations2;

// Classe de Division modifiée pour utiliser Expression
public class Division2 extends Operation2 {
    public Division2(Expression op1, Expression op2) {
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
package operations2;

// Classe de Multiplication modifiée pour utiliser Expression
public class Multiplication2 extends Operation2 {
    public Multiplication2(Expression op1, Expression op2) {
        super(op1, op2);
    }
    
    @Override
    public int valeur() {
        return getOperande1().valeur() * getOperande2().valeur();
    }
    
    @Override
    public String toString() {
        return "(" + getOperande1() + " * " + getOperande2() + ")";
    }
}
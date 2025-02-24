package operations2;

// Classe abstraite Operation modifiée
public abstract class Operation2 extends Expression {
    private Expression operande1;
    private Expression operande2;
    
    public Operation2(Expression op1, Expression op2) {
        this.operande1 = op1;
        this.operande2 = op2;
    }
    
    public Expression getOperande1() {
        return operande1;
    }
    
    public Expression getOperande2() {
        return operande2;
    }
}
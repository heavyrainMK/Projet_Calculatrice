package operations1;

// Classe abstraite Operation1
public abstract class Operation1 {
    private Nombre1 operande1;
    private Nombre1 operande2;
    
    public Operation1(Nombre1 op1, Nombre1 op2) {
        this.operande1 = op1;
        this.operande2 = op2;
    }
    
    public abstract int valeur();
    
    public Nombre1 getOperande1() {
        return operande1;
    }
    
    public Nombre1 getOperande2() {
        return operande2;
    }
}
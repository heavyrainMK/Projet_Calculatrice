package test1;

import operations1.*;

// Classe de test pour la partie 1
public class TestPartie1 {
    public static void main(String[] args) {
        // Test des opérations simples
        Nombre1 six = new Nombre1(6);
        Nombre1 dix = new Nombre1(10);
        
        Operation1 s = new Soustraction1(dix, six);
        System.out.println(s + " = " + s.valeur()); // doit afficher : (10 - 6) = 4
        
        Operation1 a = new Addition1(dix, six);
        System.out.println(a + " = " + a.valeur());
        
        Operation1 m = new Multiplication1(dix, six);
        System.out.println(m + " = " + m.valeur());
        
        Operation1 d = new Division1(dix, six);
        System.out.println(d + " = " + d.valeur());
    }
}
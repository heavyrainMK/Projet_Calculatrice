package test2;

import operations2.*;

// Classe de test pour la partie 2
public class TestPartie2 {
    public static void main(String[] args) {
        // Test de l'exemple donné : (17-2)/(2+3)
        Expression deux = new Nombre2(2);
        Expression trois = new Nombre2(3);
        Expression dixSept = new Nombre2(17);
        Expression s = new Soustraction2(dixSept, deux);
        Expression a = new Addition2(deux, trois);
        Expression d = new Division2(s, a);
        System.out.println(d + " = " + d.valeur()); // affiche ((17 - 2) / (2 + 3)) = 3
        
        // Test supplémentaire avec une expression plus complexe
        // ((4 * 2) + (10 - 3)) * 2
        Expression quatre = new Nombre2(4);
        Expression dix = new Nombre2(10);
        Expression mult = new Multiplication2(quatre, deux);
        Expression sous = new Soustraction2(dix, trois);
        Expression add = new Addition2(mult, sous);
        Expression resultat = new Multiplication2(add, deux);
        System.out.println(resultat + " = " + resultat.valeur());
        
        // Test 3: Expression avec plusieurs opérations différentes
        // ((5 + 7) * (20 / 4)) - 6
        Expression cinq = new Nombre2(5);
        Expression sept = new Nombre2(7);
        Expression vingt = new Nombre2(20);
        Expression six = new Nombre2(6);
        
        Expression add1 = new Addition2(cinq, sept);
        Expression div1 = new Division2(vingt, quatre);
        Expression mult1 = new Multiplication2(add1, div1);
        Expression resultat3 = new Soustraction2(mult1, six);
        System.out.println(resultat3 + " = " + resultat3.valeur()); // ((5 + 7) * (20 / 4)) - 6 = 24
        
        // Test 4: Expression avec opérations imbriquées profondes
        // (3 + ((8 - 2) * (12 / (3 + 1))))
        Expression huit = new Nombre2(8);
        Expression douze = new Nombre2(12);
        Expression un = new Nombre2(1);
        
        Expression add2 = new Addition2(trois, un);
        Expression div2 = new Division2(douze, add2);
        Expression sous2 = new Soustraction2(huit, deux);
        Expression mult2 = new Multiplication2(sous2, div2);
        Expression resultat4 = new Addition2(trois, mult2);
        System.out.println(resultat4 + " = " + resultat4.valeur()); // (3 + ((8 - 2) * (12 / (3 + 1)))) = 21
        
        // Test 5: Expression avec division qui donne un résultat à virgule (tronquée en entier)
        // (100 / 30) + 2
        Expression cent = new Nombre2(100);
        Expression trente = new Nombre2(30);
        Expression div3 = new Division2(cent, trente);
        Expression resultat5 = new Addition2(div3, deux);
        System.out.println(resultat5 + " = " + resultat5.valeur()); // (3 + 2) = 5
        
        // Test 6: Test avec valeurs négatives
        // (-5 * 4) + (10 / 2)
        Expression negCinq = new Nombre2(-5);
        Expression mult3 = new Multiplication2(negCinq, quatre);
        Expression div4 = new Division2(dix, deux);
        Expression resultat6 = new Addition2(mult3, div4);
        System.out.println(resultat6 + " = " + resultat6.valeur()); // ((-5 * 4) + (10 / 2)) = -15
    }
}
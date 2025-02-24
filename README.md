# Ma Calculatrice - Projet POO L2 IED

## À propos
- **Auteur :** Maxim Khomenko (23008213)
- **Formation :** L2 Informatique - IED Paris 8
- **Module :** Programmation Orientée Objet
- **Date :** Février 2025

## Description
Ce projet implémente une calculatrice en Java permettant d'effectuer des opérations arithmétiques sur des nombres entiers. Il est divisé en deux parties :
- **Partie 1 :** Calculatrice basique pour opérations simples (addition, soustraction, multiplication, division)
- **Partie 2 :** Version avancée utilisant la récursivité pour évaluer des expressions composées comme `(5 + 3) * (10 - 2)`. Chaque opération peut contenir d'autres opérations comme opérandes, créant ainsi une structure d'arbre qui est évaluée récursivement.

## Prérequis
Vérifiez que vous avez Java 11 ou supérieur installé :
```bash
java -version  # Doit afficher Java 11 ou supérieur
```

## Installation et Utilisation

### Option 1 : Utilisation avec les fichiers précompilés
1. Téléchargez le fichier Projet_Calculatrice-main.zip
2. Décompressez l'archive dans le dossier de votre choix
3. Si vous êtes sous Linux/Mac, donnez les droits d'exécution :
   ```bash
   chmod +x partie1/bin/operations1/*.class partie1/bin/test1/*.class
   chmod +x partie2/bin/operations2/*.class partie2/bin/test2/*.class
   ```
4. Pour exécuter la Partie 1 :
   ```bash
   cd partie1/bin
   java test1.TestPartie1
   ```
5. Pour exécuter la Partie 2 :
   ```bash
   cd partie2/bin
   java test2.TestPartie2
   ```

### Option 2 : Compilation depuis les sources
1. Décompressez l'archive
2. Ouvrez un terminal à la racine du projet
3. Compilez la Partie 1 :
   ```bash
   mkdir -p partie1/bin
   javac -d partie1/bin partie1/src/operations1/*.java partie1/src/test1/*.java
   ```
   Aucun message d'erreur ne devrait apparaître.
4. Compilez la Partie 2 :
   ```bash
   mkdir -p partie2/bin
   javac -d partie2/bin partie2/src/operations2/*.java partie2/src/test2/*.java
   ```
   Aucun message d'erreur ne devrait apparaître.
5. Exécutez les tests comme dans l'Option 1

## Exemples d'utilisation

### Partie 1 : Opérations Simples
```java
Nombre1 six = new Nombre1(6);
Nombre1 dix = new Nombre1(10);
Operation1 s = new Soustraction1(dix, six);
System.out.println(s + " = " + s.valeur()); // Affiche : (10 - 6) = 4
```

### Partie 2 : Expressions Composées avec Évaluation Récursive
```java
Expression dixSept = new Nombre2(17);
Expression deux = new Nombre2(2);
Expression trois = new Nombre2(3);
Expression s = new Soustraction2(dixSept, deux);    // Premier niveau de récursion
Expression a = new Addition2(deux, trois);          // Premier niveau de récursion
Expression d = new Division2(s, a);                 // Second niveau de récursion
System.out.println(d + " = " + d.valeur());       // Affiche : ((17 - 2) / (2 + 3)) = 3
```

## Implémentation de la Récursivité
Dans la Partie 2, la méthode `valeur()` est implémentée de manière récursive :
- Chaque opération appelle `valeur()` sur ses opérandes
- Si un opérande est un nombre, la récursion s'arrête et renvoie sa valeur
- Si un opérande est une opération, `valeur()` est appelée récursivement sur cette opération
- Cette structure permet d'évaluer des expressions arbitrairement complexes

## Structure du Projet
```
Projet_Calculatrice/
├── partie1/
│   ├── src/    # Fichiers sources Java (.java)
│   │   ├── operations1/
│   │   └── test1/
│   └── bin/    # Fichiers compilés (.class)
│       ├── operations1/
│       └── test1/
├── partie2/
│   ├── src/    # Fichiers sources Java (.java)
│   │   ├── operations2/
│   │   └── test2/
│   └── bin/    # Fichiers compilés (.class)
│       ├── operations2/
│       └── test2/
├── diagrams/
│   ├── Diagramme_UML1.png
│   └── Diagramme_UML2.png
└── README.md
```

## Fonctionnalités
- Opérations basiques : +, -, *, /
- Support des expressions composées avec évaluation récursive (Partie 2)
- Division entière
- Affichage formaté des expressions

## Limitations
- Gère uniquement les nombres entiers
- Division entière uniquement
- Pas d'interface graphique

## Contact
Pour toute question ou suggestion : maxim.khomenko@etud.univ-paris8.fr

## Licence
Ce projet est réalisé dans le cadre d'un cours universitaire. Tous droits réservés.

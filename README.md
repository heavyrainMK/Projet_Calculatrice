# Ma Calculatrice - Projet POO L2 IED

## À propos
- **Auteur :** Maxim Khomenko (23008213)
- **Formation :** L2 Informatique - IED Paris 8
- **Module :** Programmation Orientée Objet
- **Date :** Février 2025

## Description
Ce projet implémente une calculatrice en Java permettant d'effectuer des opérations arithmétiques sur des nombres entiers. Il est divisé en deux parties :
- **Partie 1 :** Calculatrice basique pour opérations simples (addition, soustraction, multiplication, division)
- **Partie 2 :** Version avancée supportant des expressions composées comme `(5 + 3) * (10 - 2)`

## Prérequis
- Java JDK 11 ou supérieur

## Installation et Utilisation

### Option 1 : Utilisation avec les fichiers précompilés
1. Téléchargez le fichier PROJET_CALCULATRICE.zip
2. Décompressez l'archive dans le dossier de votre choix
3. Pour exécuter la Partie 1 :
   ```bash
   cd partie1/bin
   java test.TestPartie1
   ```
4. Pour exécuter la Partie 2 :
   ```bash
   cd partie2/bin
   java test.TestPartie2
   ```

### Option 2 : Compilation depuis les sources
1. Décompressez l'archive
2. Ouvrez un terminal dans le dossier du projet
3. Compilez la Partie 1 :
   ```bash
   mkdir -p partie1/bin
   javac -d partie1/bin partie1/src/operations/*.java partie1/src/test/*.java
   ```
4. Compilez la Partie 2 :
   ```bash
   mkdir -p partie2/bin
   javac -d partie2/bin partie2/src/operations/*.java partie2/src/test/*.java
   ```

## Exemples d'utilisation

### Partie 1 : Opérations Simples
```java
Nombre six = new Nombre(6);
Nombre dix = new Nombre(10);
Operation s = new Soustraction(dix, six);
System.out.println(s + " = " + s.valeur()); // Affiche : (10 - 6) = 4
```

### Partie 2 : Expressions Composées
```java
Expression dixSept = new Nombre(17);
Expression deux = new Nombre(2);
Expression trois = new Nombre(3);
Expression s = new Soustraction(dixSept, deux);
Expression a = new Addition(deux, trois);
Expression d = new Division(s, a);
System.out.println(d + " = " + d.valeur()); // Affiche : ((17 - 2) / (2 + 3)) = 3
```

## Structure du Projet
```
Projet_Calculatrice.zip/
├── partie1/
│   ├── src/    # Fichiers sources Java (.java)
│   │   ├── operations/
│   │   └── test/
│   └── bin/    # Fichiers compilés (.class)
│       ├── operations/
│       └── test/
├── partie2/
│   ├── src/    # Fichiers sources Java (.java)
│   │   ├── operations/
│   │   └── test/
│   └── bin/    # Fichiers compilés (.class)
│       ├── operations/
│       └── test/
├── diagrams/
│   ├── Diagramme_UML1.png
│   └── Diagramme_UML2.png
└── README.md
```

## Fonctionnalités
- Opérations basiques : +, -, *, /
- Support des expressions composées (Partie 2)
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

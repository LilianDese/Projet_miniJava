# Guide d'évaluation Mini-C

Ce fichier regroupe toutes les commandes utiles pour votre soutenance afin de prouver que le projet compile et de montrer l'exécution des programmes.

Vous disposez de deux manières pour compiler et exécuter : la méthode classique (avec Ant) et la méthode manuelle.

---

## 1. Compilation du Projet

### Méthode A : Avec Apache Ant (Recommandée si installé)
C'est la méthode "propre" prévue par l'architecture du projet.
```bash
# Générer l'analyseur lexical/syntaxique et compiler le code Java
ant generate compile -buildfile minic-build.xml
```

### Méthode B : Sans Ant (Manuelle)
Si `ant` n'est pas disponible, voici la ligne de commande équivalente pour compiler tout le code Java :
```bash
mkdir -p bin/cls
find src -name "*.java" > sources.txt
javac -cp "tools/commons-text-1.9.jar:tools/antlr-4.13.1-complete.jar" -sourcepath src -d bin/cls @sources.txt
```

---

## 2. Compilation d'un test Mini-C (Génération du .tam)

Une fois le compilateur prêt, vous pouvez compiler n'importe quel fichier Mini-C pour générer son équivalent TAM.

**Exemple avec le test des pointeurs :**
```bash
java -cp "bin/cls:tools/antlr-4.13.1-complete.jar:tools/commons-text-1.9.jar" fr.n7.stl.minic.Driver tests/positifs/05_pointeur.txt
```
*(Cela va générer le fichier `tests/positifs/05_pointeur.tam`)*

---

## 3. Exécution du code généré (.tam)

Vous pouvez exécuter le code produit de deux manières grâce aux outils directement fournis dans le dossier `tools/` de votre projet !

### Mode Console (Exécution simple et rapide)
Utile pour vérifier simplement la sortie console de votre programme (ex: les `print`).
```bash
java -jar tools/runtam.jar tests/positifs/05_pointeur.tam
```

### Mode Interface Graphique (Débogage visuel)
L'outil `itam.jar` permet de lancer l'interface graphique de la machine TAM.
⚠️ *Rappel : Vous devez avoir `openjfx` installé sur votre WSL pour l'exécuter.*
```bash
# Lancer l'interface graphique TAM avec les modules JavaFX
java --module-path /usr/share/openjfx/lib --add-modules javafx.controls,javafx.fxml -jar tools/itam.jar tests/positifs/05_pointeur.tam
```

---

## 4. Script d'automatisation global

Pour gagner du temps en présentation, le script `run_tests.sh` permet de tout faire d'un coup :
1. Compiler le compilateur
2. Lancer tous les tests positifs et afficher leur résultat via `runtam.jar`
3. Afficher les erreurs capturées par les tests négatifs

```bash
./run_tests.sh
```

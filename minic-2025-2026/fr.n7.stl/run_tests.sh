#!/bin/bash
echo "=== COMPILATION DU PROJET ==="
mkdir -p bin/cls
find src -name "*.java" > sources.txt
javac -cp "tools/commons-text-1.9.jar:tools/antlr-4.13.1-complete.jar" -sourcepath src -d bin/cls @sources.txt
echo "Compilation terminée."
echo ""

echo "========================================="
echo "=== TESTS POSITIFS (Génération TAM) ==="
echo "========================================="
for test in tests/positifs/*.txt; do
    echo "--- Test : $test ---"
    java -cp "bin/cls:tools/antlr-4.13.1-complete.jar:tools/commons-text-1.9.jar" fr.n7.stl.minic.Driver "$test"
    
    # Run the TAM if it was generated
    tam_file="${test%.txt}.tam"
    if [ -f "$tam_file" ]; then
        echo ">>> Exécution TAM : $tam_file"
        java -jar tools/runtam.jar "$tam_file"
        echo ""
    fi
done

echo ""
echo "========================================="
echo "=== TESTS NÉGATIFS (Erreurs gérées) ==="
echo "========================================="
for test in tests/negatifs/*.txt; do
    echo "--- Test : $test ---"
    head -n 1 "$test"
    java -cp "bin/cls:tools/antlr-4.13.1-complete.jar:tools/commons-text-1.9.jar" fr.n7.stl.minic.Driver "$test"
    echo ""
done

echo "Tests terminés."

javac -cp antlr-4.9.3-complete.jar:src .antlr/Tiger*.java -d build/
javac -cp antlr-4.9.3-complete.jar:src:build src/Driver.java -d build/
javac -cp antlr-4.9.3-complete.jar:src:build src/TigerBaseErrorListener.java -d build/
java -cp antlr-4.9.3-complete.jar:build Driver $1

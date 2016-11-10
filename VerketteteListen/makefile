#Verzeichnisse
BIN= bin/
LIB= lib/
SRC= src/
JDOCDIR = doc/

#Tools
JAVA= java
JC= javac
JDOC= javadoc
RM= rm

#Parameter
JCFLAGS = -g
JAVAFLAGS = -cp

#Files
LIBPATH= $(LIB)junit-4.12.jar:$(LIB)hamcrest-core-1.3.jar
//Package.Class = ausführen nach compilieren
MAINCLASS= Main
TESTCLASS= MainTest
JAVASRC= 	./src/main/Main.java \
			./src/lists/DoublyLinkedList.java \
			./src/lists/SinglyLinkedList.java \
			./src/lists/Listable.java \
			./src/data/Student.java \
			./src/test/TestDoublyLinkedList.java \
			./src/test/TestSinglyLinkedList.java \
			./src/test/TestStudent.java \

#Methoden
default:
	mkdir -p $(BIN)
	$(JC) $(JCFLAGS) $(JAVAFLAGS) $(LIBPATH) -d $(BIN) $(JAVASRC)

run-app:
	cd $(BIN); $(JAVA) $(JAVAFLAGS) . $(MAINCLASS)	

doc:
	$(RM) -rf $(JDOCDIR)
	$(JDOC)  -d $(JDOCDIR) $(JAVASRC)	

run-test:
	$(JAVA) $(JAVAFLAGS) $(BIN):$(LIBPATH) org.junit.runner.JUnitCore $(TESTCLASS)

clean:  
	$(RM) -rf $(JDOCDIR)
	$(RM) -rf $(BIN)

release: 
	default
	doc	

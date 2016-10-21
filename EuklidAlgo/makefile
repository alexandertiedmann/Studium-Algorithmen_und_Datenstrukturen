# see for more information README.md
BIN = ./bin/
		# :-) BITTE KEIN SLASH AM ANFANG VOM PFAD 'bin' SETZEN! 
		# Erlaubt: ./bin oder bin; 
		# Kritisch: /bin  :-) Beim Aufruf vom Target/Goal 'clean' oder 'distclean' mit Adminrechte könnte es Probleme geben!
JAVA = java
JC = javac
JCFLAGS = -g
JAVAFLAGS = -cp

JDOC = javadoc
JDOCDIR = doc
LIB=./lib/
SRC=./src/
MAINCLASS= Main
TESTCLASS= MainTest
JAVASRC= 	./src/Main.java \
			./src/MainTest.java \

LIBPATH= $(LIB)junit-4.12.jar:$(LIB)hamcrest-core-1.3.jar

default:
	echo 'Run target default'
	mkdir -p $(BIN)
	$(JC) $(JCFLAGS) $(JAVAFLAGS) $(LIBPATH) -d $(BIN) $(JAVASRC)

run-app:
	@echo 'Run target run'
	cd $(BIN); $(JAVA) $(JAVAFLAGS) . $(MAINCLASS)	

doc:
	@echo 'Run target doc' 
	$(JDOC)  -d $(JDOCDIR) $(JAVASRC)	

run-test:
	@echo 'Run target test'
	$(JAVA) $(JAVAFLAGS) $(BIN):$(LIBPATH) org.junit.runner.JUnitCore $(TESTCLASS)

clean:
	@echo 'Run target clean'
	$(RM) -r $(BIN)


distclean: clean
#wenn Clock skew detected
#	find . -exec touch {} \;
	@echo 'Run target distclean'
	$(RM) -r $(JDOCDIR)

release: distclean default doc	
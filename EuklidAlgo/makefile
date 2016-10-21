# see for more information README.md
JC = javac
JCFLAGS = -g
JBINDIR = bin	# :-) BITTE KEIN SLASH AM ANFANG VOM PFAD 'bin' SETZEN! 
		# Erlaubt: ./bin oder bin; 
		# Kritisch: /bin  :-) Beim Aufruf vom Target/Goal 'clean' oder 'distclean' mit Adminrechte könnte es Probleme geben!
JAVA = java
JAVAFLAGS = -cp

JDOC = javadoc
JDOCDIR = java-doc

MAINCLASS= Main
TEST= MainTest
SOURCES = 	./src/Main.java \
			./src/MainTest.java \

default:
	echo 'Run target default'
	mkdir -p $(JBINDIR)
	$(JC) $(JCFLAGS) $(SOURCES) -d $(JBINDIR)

run-app:
	@echo 'Run target run'
	cd $(JBINDIR); $(JAVA) $(JAVAFLAGS) . $(MAINCLASS)	

doc:
	@echo 'Run target doc' 
	$(JDOC) -version -author -d $(JDOCDIR) $(SOURCES)	

run-test:
	@echo 'Run target test'
	cd $(JBINDIR); $(JAVA) $(JAVAFLAGS) . $(TEST)

clean:
	@echo 'Run target clean'
	$(RM) -r $(JBINDIR)

distclean: clean
	@echo 'Run target distclean'
	$(RM) -r $(JDOCDIR)

release: distclean default doc	
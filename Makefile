

#default make argument
default: build


#compiles the project into the bin
build:
	javac src/**/*.java -cp "lib/*:src" -d bin


#runs all junit tests
test:
	java -jar lib/* execute --class-path bin --scan-class-path

testMain:
	java -cp bin test/MainTest

#clears previous javadoc, generates new javadoc
doc: 
	javadoc src/**/*.java -d docs/javadoc

#clears the javadoc
clearD:
	rm -fr docs/javadoc

#clears the bin
clearB:
	rm -fr bin


clear: clearB clearD

uml:
	mv docs/PUML/*.png docs/UML/




**Falcon 3D** is a Java Graphics API Designed to simplify the process of building 3D graphics programs. This is the first project build. There will likely be different project-build-designs: until we find the best possible build design that will be regularly updated which will inherit the name **_Eagle 3D_**  

We plan that **Falcon 3D** API will be an easy, high-level graphics API for students and people that might still be learning Java.

to compile and run use this command while in the mac unix terminal while in the _root_ project directory:

javac -cp "lib/*" -d out $(find src examples -name "*.java") && java -XstartOnFirstThread --enable-native-access=ALL-UNNAMED -cp "out:lib/*" Main


the test programs will be found in the examples/ directory this is where you can test, update or write your own Main.java files and your own main methods


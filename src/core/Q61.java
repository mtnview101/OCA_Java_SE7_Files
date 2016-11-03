package core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q61 {


	
public void copy(Path srcFile, Path destFile){
try {
byte[] readBytes = Files.readAllBytes(srcFile);
Files.write(destFile, readBytes);
}catch (IOException e ) { //catch (IOException e ) {
System.err.println(e.toString());
}
}






}


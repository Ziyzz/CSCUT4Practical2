import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
import java.util.Scanner;
import java.util.Date;
/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) {
        // Replace this with statements to set the file name (input) and file name (output).
        // Initially it will be easier to hardcode suitable file names.
        File input = new File("input.txt");
        File output = new File("outout.txt");
        
        Scanner txt = new Scanner(System.in);
         PrintWriter writer1 =null;  
        
        String.format("           %d/%d?/%d%d", txt);
        
        
         writer1 = new PrintWriter(new File("D:\ComputerPracticals\TXT.txte"));   
        // Set up a new Scanner to read the input file.
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.
         
        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

        

    } 
void print(txt[] x){
  System.out.println(txt);
  
}
}

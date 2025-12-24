// file handling write text.......

// import java.io.*;
// public class WriteFile {
//     public static void main(String[] args) {
//         try {
//             FileWriter fr = new FileWriter("test.txt");
//             fr.write("Hello Java!");
//             fr.close();
//         } catch (IOException e) {
//             System.out.println("Writing error.");
//         }
//     }
// }



// public class WriteFile {
//     public static void main(String[] args) {
//         System.out.println("WriteFile class in UNIT02 package.");
//         // Your code to write to a file goes here
//     }
// }


// exception handling.......

// public class WriteFile {
//     public static void main(String[] args) {
    
//         int a = 10;
//         int b = 20;
//         int div = a / b;
//         try{
//             System.out.println("the div of a and b is : " + div);
//         }catch(Exception exception){
//             System.out.println("Exception occured: " + exception);
//         }finally{
//             System.out.println("This block is always executed.");
//         }
//     }
// }



// file handling create.....

// import java.io.*;
// public class CreateFile{
//     public static void main(String[] args){
//         try{
//             File fc = new File("myfile.txt");

//             if (fc.createNewFile()) {
//                 System.out.println("File created: "); 
//             }else {
//                 System.out.println("File already exists.");
//             }
//         }catch(IOException e){
//             System.out.println("error occured:" + e );
//         }
//     }
// }




// file handling copy image.......

// import java.io.*;
// public class CopyImage{
//     public static void main(String[] args){
//         try{
//             FileInputStream fis = new FileInputStream("Bulb - LED.jpg");
//             FileOutputStream fos = new FileOutputStream(" copy Bulb - LED.jpg");

//             int byteData;
//             while((byteData = fis.read()) != -1){
//                 fos.write(byteData);
//             }

//             fis.close();
//             fos.close();
//             System.out.println("Image copied successfully.");
//         }catch(IOException e){
//             System.out.println("Error occurred: " + e);
//         }
//     }
// }



// file handling copy text.......


// import java.io.*;
// public class CopyText {
//     public static void main(String[] args){
//         try{
//             FileInputStream fis = new FileInputStream("test.txt");
//             FileOutputStream fos = new FileOutputStream(" copy test.txt");

//             int b;
//             while((b = fis.read()) != -1){
//                 fos.write(b);
//             }
//             fis.close();
//             fos.close();
//             System.out.println("Text file copied successfully.");
//         }catch(IOException e){
//             System.out.println("Error occurred: " + e);
//         }
//     }   
// }



// file writing text ......
// import java.io.*;
// public class CopyText {
//     public static void main(String[] args){
//         try{
//             FileWriter fw = new FileWriter("output.txt");
//             fw.write("Hello, this is a sample text written to the file.");
//             fw.close();
//             System.out.println("Text written to file successfully.");
//         }catch(IOException e){
//             System.out.println("Error occurred: " + e);
//         }
//     }   
// }



// Reading a file using FileReader character stream ......

// import java.io.*;
// public class Reading {
//     public static void main(String[] args){
//         try{
//             FileReader fr = new FileReader("test.txt");
//             int b;
//             while((b = fr.read()) != -1)
//                {
//                 System.out.print((char)b);
//                }
//                fr.close();              
//         }catch(FileNotFoundException e){
//             System.out.println("File not found: " + e);
//         }catch(IOException e){
//             System.out.println("Error occurred: " + e);
//         }
//     }
// }


// writing using BufferedReader character stream ......

// import java.io.*;
// public class Writing{
//     public static void main(String[] args){
//         try {
//             FileWriter fw = new FileWriter("myfile.txt");
//             fw.write("hello my name is java programming");
//             fw.close();
//             System.out.println("Text written to file successfully.");
//         }catch(IOException e){
//             System.out.println("Error occurred: " + e);
//         }
//     }

// }


// writing using BufferedWriter character stream ......
// import java.io.*;
// public class Writing{
//     public static void main(String[] args){
//         try {
//             FileWriter fw = new FileWriter("myfile.txt");
//             BufferedWriter bw = new BufferedWriter(fw);
//             bw.write("hello my name is java programming");
//             bw.newLine();
//             bw.write("i am learning file handling in java");
//             bw.close();
//             System.out.println("Text written to file successfully.");
//         }catch(IOException e){
//             System.out.println("Error occurred: " + e);
//         }
//     }
// }

// byte FileInputStream and FileOutputStream ......

// import java.io.*;
// public class Fileinput{
//     public static void main(String[] args){
//         try{
//             FileInputStream fis = new FileInputStream("input.txt");
//             int b;
//             while ((b = fis.read()) != -1){
//                 System.out.print((char)b);
//             }
//             fis.close();
//         }catch(IOException e){
//             System.out.println("Error occurred: " + e);
//         }
//     }
// }


//FILE WRITING CODE USING FILEOUTPUTSTREAM.......

// import java.io.*;
// public class FileWriter{
//     public static void main(String[] args){
//         try{
//             FileInputStream fw = new FileInputStream("output.txt");
//             int b;
//             while ((b=fw.read())!=-1){ 
//                 System.out.print((char)b);
//             };
//             fw.close();
//             System.out.println("Text written to file successfully.");
//         }catch(IOException e){
//             System.out.println("Error occurred: " + e);
//         }
//     }
// }
     
// file se data reade karna....
/*   
import java.io.*;
public class FileReaders {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("output.txt");
            int b;
            while ((b=fr.read())!=-1) {
                System.out.print((char)b);
            } fr.close();

        }catch(IOException e){
            System.out.println("error ocured: " + e);
        } 
    }  
}

 */


// kisi bhi file me ka data reade karna whith the help of below code-----

import java.io.*;

class FileReaders{
    public static void main(String[] args){
        try{
               FileReader fr = new FileReader("output.txt");
               int b;
               while ((b = fr.read()) != -1) {
                System.out.print((char)b);
                 } fr.close();
            }
            catch( IOException e){
                  System.out.println("error " + e );
        }
    }
}
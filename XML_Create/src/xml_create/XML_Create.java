/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml_create;

// import needed for the program to function.
import java.io.*;

/**
 *
 * @author Muntaqa Mahmood
 * January 18, 2020
 * XML Create
 * This project is coded in XML and outputs 3 elements. 
 */
public class XML_Create {
    public static void main(String[] args) {
        
      // try statement for catching exception 
      try{
          
        // creating file that will write to information.xml
        OutputStream fout= new FileOutputStream("information.xml");
        OutputStream bout= new BufferedOutputStream(fout);
        // defines the file to be XML with ISO 8859_1 encoding 
        OutputStreamWriter out
         = new OutputStreamWriter(bout, "8859_1");
        
        // opens root element
        out.write("<class>\r\n");
        
        // opens child elements and describes them
        out.write("<course>\r\n");
        out.write("<code> SCH3U </code>\r\n");
        out.write("<description> Chemistry, Grade 11, University Preparation </description>\r\n");
        out.write("<teacher> Ms. MacGillivray </teacher>\r\n");
        out.write("<fileType> Unmodified </fileType>\r\n");
        out.write("<schoolBoard> DDSB </schoolBoard>\r\n");
        out.write("</course> \r\n");

        out.write("<course>\r\n");
        out.write("<code> MCR3U </code>\r\n");
        out.write("<description> Functions, Grade 11, University Preparation </description>\r\n");
        out.write("<teacher> Ms. Pringle </teacher>\r\n");
        out.write("<fileType> Unmodified </fileType>\r\n");
        out.write("<schoolBoard> DDSB </schoolBoard>\r\n");
        out.write("</course> \r\n");
        
        out.write("<course>\r\n");
        out.write("<code> ENG3U </code>\r\n");
        out.write("<description> English, Grade 11, University Preparation </description>\r\n");
        out.write("<teacher> Mr. Calhoun </teacher>\r\n");
        out.write("<fileType> Unmodified </fileType>\r\n");
        out.write("<schoolBoard> DDSB </schoolBoard>\r\n");
        out.write("</course> \r\n");
        
        out.write("</class>\r\n");

        // manadatory flush
        out.flush();
        // exits file
        out.close();
        
        // catch for unsupported encoding exceptions
      } catch (UnsupportedEncodingException e) {
        System.out.println(
        // outputs this message
        "This VM does not support the Latin-1 character set.");
        
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
    }

   
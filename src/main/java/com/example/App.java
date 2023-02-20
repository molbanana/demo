package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        InputStream textInputStream = null;
        try {
            textInputStream = new FileInputStream("./input.txt");
            int content;
            while ((content = textInputStream.read()) != -1) {
              System.out.println((char)content);
            }
        } catch (IOException inputIssue) {
            System.err.println("Input error");
            System.err.println(inputIssue);
        } finally {
            try {
                textInputStream.close();
            } catch (IOException closureError) {
                System.err.println("Input closure error");
                System.err.println(closureError);
            }
        }
        System.out.println("Nice");

        InputStream gzInputStream = null;
        try {
            gzInputStream = new GZIPInputStream(new FileInputStream("./input.txt.gz"));
            int content;
            while ((content = gzInputStream.read()) != -1) {
                System.out.println((char)content);
            }
        } catch (IOException inputIssue) {
            System.err.println("Input error");
            System.err.println(inputIssue);
        } finally {
            try {
                gzInputStream.close();
            } catch (IOException closureError) {
                System.err.println("Input closure error");
                System.err.println(closureError);
            }
        }


    }
}

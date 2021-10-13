package com.example.demo;

 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        MyJsonParser parser = new MyJsonParser();
        
        Product obj = new Product(101, "sony TV", 25500);
        
        String jsonResp = parser.convertToJson(obj);
        
        System.out.println(jsonResp);
        
        System.out.println("Convert From JSON to JAVA");
        System.out.println(parser.jsonToJava(jsonResp));
    }
}
 
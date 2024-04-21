package com.java8.java8demo;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        List<String> names= Arrays.asList("Rama","Sita","Radha","Krishna");
        names.forEach(System.out::println);
    }
}

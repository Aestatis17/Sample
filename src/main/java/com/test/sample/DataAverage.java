package com.test.sample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataAverage {

    public static void main(String[] args) throws IOException {

        List<Integer> dataStorage = new ArrayList<>();

        //Processes the file
        File file = new File( "data.csv" );
        FileReader fileReader = new FileReader( file );
        BufferedReader reader = new BufferedReader( fileReader );

        int counter = 0;
        while ( reader.ready() ) {
            String string = reader.readLine();
            System.out.println( string );
            if ( counter != 0 ) {
                String[] data = string.split( "," );
                String num = data[0].trim();
                dataStorage.add( Integer.valueOf( num ) );
            }
            counter++;
        }

        // iterate over the list and sum the values
        int sum = 0;
        for (Integer num : dataStorage) {
            sum += num;
        }
        System.out.println("sum = " + sum);
        System.out.println( "Average: " + ( sum / dataStorage.size() ));
        reader.close();

    }

}

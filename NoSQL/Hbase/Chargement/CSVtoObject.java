package tp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class  CSVtoObject {
    	 public static void main(String[] args) {

    	        String csvFile = "personnes.csv";
    	        BufferedReader br = null;
    	        String line = "";
    	        String cvsSplitBy = ",";
    	        try {

    	        br = new BufferedReader(new FileReader(csvFile));
    	        while ((line = br.readLine()) != null) {
    	                // use comma as separator
    	        String[] p = line.split(cvsSplitBy);
    	        Person a = new Person(p[0], p[1], p[2], Integer.parseInt(p[3]));
    	                System.out.println("Personne [ "+  a.toString() +  "]");
    	            }

    	        } catch (FileNotFoundException e) {
    	            e.printStackTrace();
    	        } catch (IOException e) {
    	            e.printStackTrace();
    	        } finally {
    	            if (br != null) {
    	                try {
    	                    br.close();
    	                } catch (IOException e) {
    	                    e.printStackTrace();}
    	            }}
	    }
    }
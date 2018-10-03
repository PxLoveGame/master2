package mains;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTableFactory;
import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class  CSVtoCommune {
	
	private static final byte[] commune = Bytes.toBytes("commune");
	private static final byte[] general = 
				Bytes.toBytes("general");
	private static final byte[] departement = 
			Bytes.toBytes("departement");
	private static final byte[] population = 
			Bytes.toBytes("population");
	private static final byte[] CodeInsee = 
			Bytes.toBytes("CodeInsee");
	private static final byte[] nom = 
			Bytes.toBytes("nom");
	private static final byte[] nomDep = 
			Bytes.toBytes("nomDep");
	private static final byte[] numDep = 
			Bytes.toBytes("numDep");
	private static final byte[] population2010 = 
			Bytes.toBytes("Population2010");
	private static final byte[] population1975 = 
			Bytes.toBytes("Population1975");
	

	// extrait chaque ligne tabulet , 1 tuple par ligne puis  à chaque virgule => nouvelle valeur de colonne
    	 public static void main(String[] args) throws Exception {	 
    		 
    		 Configuration config = HBaseConfiguration.create();
    		 HTableInterface table = run(config); // crée la table (d'après schema)

    	        String csvFile = "communes.csv";
    	        BufferedReader br = null;
    	        String line = "";
    	        String cvsSplitBy = ",";
    	        try {

    	        br = new BufferedReader(new FileReader(csvFile));
    	        while ((line = br.readLine()) != null) {
    	                // use comma as separator
    	        String[] p = line.split(cvsSplitBy);
    	        Commune c = 
    	        		new Commune(p[0], p[1], p[2], Integer.parseInt(p[3]), Double.parseDouble(p[4]), Double.parseDouble(p[5]));
    	                System.out.println("Commune [ "+  c.toString() +  "]");
    	                
    	                Put p1 = new Put(c.getId().getBytes());
    	                p1.add(general, CodeInsee, c.getId().getBytes());
    	                p1.add(general, nom, c.getNom().getBytes());
    	                p1.add(departement, numDep, c.getNumDep().toString().getBytes());
    	                p1.add(population, population2010, c.getPopulation2010().toString().getBytes());
    	                p1.add(population, population1975, c.getPopulation1975().toString().getBytes());
    	                p1.add(departement, nomDep, c.getNomDep().getBytes());
    	                table.put(p1);
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
    	            }
    	            
    	        }
    	 } 
    	 
    	 private static void createTable(HBaseAdmin admin) throws IOException {

    	        HTableDescriptor desc = new HTableDescriptor(commune);
    	        desc.addFamily(new HColumnDescriptor(general));
    	        desc.addFamily(new HColumnDescriptor(departement));
    	        desc.addFamily(new HColumnDescriptor(population));
    	        admin.createTable(desc);
    	    }
    		public static HTableInterface run(Configuration config) throws IOException {
    	        HBaseAdmin admin = new HBaseAdmin(config);
    	        HTableFactory factory = new HTableFactory();
    	        if (!admin.tableExists(commune)) {
    	            createTable(admin);
    	        }
    	        HTableInterface table = factory.createHTableInterface(config, commune);
    	        return table;
    	        // factory.releaseHTableInterface(table); // Disconnect
    	    }
    }
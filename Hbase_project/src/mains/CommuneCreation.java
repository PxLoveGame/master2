package mains;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

public class CommuneCreation {
	private static final byte[] commune = Bytes.toBytes("commune");
    public static void main( String args[] ) throws IOException {

    System.out.println( "starting..." );
    
	System.out.println( "getting config..." );
	Configuration hc = HBaseConfiguration.create();

	HTableDescriptor ht = new HTableDescriptor( "commune" );
	// column family
	ht.addFamily( new HColumnDescriptor( "general" ) ); 
	ht.addFamily( new HColumnDescriptor( "departement" ) );
	ht.addFamily( new HColumnDescriptor( "population" ) );
	
	System.out.println("add Montpellier's data");

	Put mplPut = new Put(new String("Mpl_34172").getBytes());
	mplPut.add(new String("general").getBytes(), new String("codePostal").getBytes(), new String("34172").getBytes());
	mplPut.add(new String("general").getBytes(), new String("nom").getBytes(), new String("Montpellier").getBytes());
	mplPut.add(new String("general").getBytes(), new String("nom").getBytes(), new String("LouClapas").getBytes());
	mplPut.add(new String("departement").getBytes(), new String("numDep").getBytes(), new String("34").getBytes());
	
	mplPut.add(new String("population").getBytes(), new String("population2012").getBytes(), new String("189999").getBytes());

	Put agdPut = new Put(new String("Agd_34003").getBytes());
	agdPut.add(new String("general").getBytes(), new String("nom").getBytes(), new String("Agde").getBytes());
	agdPut.add(new String("population").getBytes(), new String("population2010").getBytes(), new String("20000").getBytes());

	System.out.println( "connecting..." );
	HBaseAdmin hba = new HBaseAdmin( hc );
	
	
	System.out.println("Table "+commune+" exist: " +
			hba.tableExists(commune)) ;
	HTableFactory factory = new HTableFactory();
    if (!hba.tableExists(commune)) {
    	hba.createTable(ht);
    }
	
	
	HTable table = new HTable(hc, "commune");
	table.put(mplPut);
	table.put(agdPut);
	System.out.println( "done!" );
	table.close();
	hba.close();
    }

}
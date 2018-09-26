

import java.io.*;
// Oracle JDBC
import java.sql.*;
import oracle.jdbc.pool.*;

// HBase
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTableFactory;
import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.filter.BinaryComparator;
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.FilterList;
import org.apache.hadoop.hbase.filter.FilterList.Operator;
import org.apache.hadoop.hbase.filter.PrefixFilter;
import org.apache.hadoop.hbase.filter.QualifierFilter;
import org.apache.hadoop.hbase.util.Bytes;

public class Oracle_Hbase_Test {
	private static final byte[] Commune = Bytes.toBytes("Communes");
	private static final byte[] DecoupageAdministratif = 
				Bytes.toBytes("DecoupageAdministratif");
	private static final byte[] Population = 
			Bytes.toBytes("Population");
	private static final byte[] CodeInsee = 
			Bytes.toBytes("CodeInsee");
	private static final byte[] Nom = 
			Bytes.toBytes("NCC");
	private static final byte[] CodeDep = 
			Bytes.toBytes("CodeDep");
	private static final byte[] pop2010 = 
			Bytes.toBytes("Pop2010");
	private static final byte[] pop1975 = 
			Bytes.toBytes("Pop1975");

	public static void main(String[] args) throws Exception
		{
    Connection c = getConnection();
    Configuration config = HBaseConfiguration.create();
    HTableInterface table = run(config);
   
   Statement stmt =  c.createStatement();
   ResultSet rset = stmt.executeQuery ("select code_insee, nom_com, pop_2010, pop_1975, "
                                          + " dep from commune ");

   System.out.println ("passe");
// iteration sur l'objet rset en fonction du contenu de la table
    while (rset.next ())
    {
    	Put p = new Put(rset.getString (1).getBytes());
        p.add(DecoupageAdministratif, CodeInsee, rset.getString (1).getBytes());
        p.add(DecoupageAdministratif, Nom, rset.getString (2).getBytes());
        p.add(DecoupageAdministratif, CodeDep, rset.getString(5).getBytes());
        p.add(Population, pop2010, rset.getString(3).getBytes());
        p.add(Population, pop1975, rset.getString(4).getBytes());
        table.put(p);
    
    	System.out.println (rset.getString (1) + " " + rset.getString (2)
    						 + "  "+ rset.getString(3) + "  "+ rset.getString(4) + "  "+ rset.getString(5) );
    }
    
    c.close();
   
	  }

	private static Connection getConnection() throws Exception {
		 OracleDataSource ods = new OracleDataSource();
		   ods.setDriverType("thin");
		   ods.setServerName("venus");
		   ods.setDatabaseName("master");
		   ods.setNetworkProtocol("tcp");
		   ods.setPortNumber(1521);
		   ods.setUser("imougenot");
		   ods.setPassword("silong");
		   return ods.getConnection();

	  }

	private static void createTable(HBaseAdmin admin) throws IOException {

        HTableDescriptor desc = new HTableDescriptor(Commune);
        desc.addFamily(new HColumnDescriptor(DecoupageAdministratif));
        desc.addFamily(new HColumnDescriptor(Population));
        admin.createTable(desc);
    }

	public static HTableInterface run(Configuration config) throws IOException {
        HBaseAdmin admin = new HBaseAdmin(config);
        HTableFactory factory = new HTableFactory();
        if (!admin.tableExists(Commune)) {
            createTable(admin);
            System.out.println ("passe");
        }
        HTableInterface table = factory.createHTableInterface(config, Commune);
        return table;
        // factory.releaseHTableInterface(table); // Disconnect
    }



	}

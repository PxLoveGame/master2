package tp;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTableFactory;
import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class Personne {
	private static final byte[] personne = Bytes.toBytes("personne");
	private static final byte[] contact = Bytes.toBytes("contact");
	private static final byte[] loisirs = Bytes.toBytes("loisirs");
	public static void main(String[] args) throws IOException {
	Configuration conf = HBaseConfiguration.create();
	HBaseAdmin admin = new HBaseAdmin(conf);

	HTableDescriptor pe = new HTableDescriptor(personne);
	pe.addFamily(new HColumnDescriptor(contact));
	pe.addFamily(new HColumnDescriptor(loisirs));
	Put arthur = new Put(Bytes.toBytes("1902605382213"));
	arthur.add(Bytes.toBytes("contact"), Bytes.toBytes("numSS"), Bytes.toBytes("1902605382213"));
	arthur.add(Bytes.toBytes("contact"), Bytes.toBytes("prenom"), Bytes.toBytes("Montpellier"));
	arthur.add(Bytes.toBytes("contact"), Bytes.toBytes("nom"), Bytes.toBytes("Sorel"));
	arthur.add(Bytes.toBytes("contact"), Bytes.toBytes("age"), Bytes.toBytes("25"));
	arthur.add(Bytes.toBytes("loisirs"), Bytes.toBytes("sport"), Bytes.toBytes("hockey"));
	
	System.out.println("Table "+personne+" exist: " +
			admin.tableExists(personne)) ;
	HTableFactory factory = new HTableFactory();
    if (!admin.tableExists(personne)) {
    	admin.createTable(pe);
    }
	HTableInterface pi = factory.createHTableInterface(conf, personne);
	pi.put(arthur);
	System.out.println("creation et insertion achevees" );
	pi.flushCommits();
	pi.close();
	
}
}
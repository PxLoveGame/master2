package commune;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTableFactory;
import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

import javax.security.auth.login.Configuration;
import java.io.IOException;

public class Commune {

    private static final byte[] commune = Bytes.toBytes("commune");
    private static final byte[] lieu = Bytes.toBytes("lieu");
    private static final byte[] population = Bytes.toBytes("pop");

    public static void main(String[] args) throws IOException {
        Configuration conf = HBaseConfiguration.create();
        HBaseAdmin admin = new HBaseAdmin(conf);

        HTableDescriptor pe = new HTableDescriptor(commune);
        pe.addFamily(new HColumnDescriptor(lieu));
        pe.addFamily(new HColumnDescriptor(population));

        Put montpellier = new Put(Bytes.toBytes("1"));
        montpellier.add(Bytes.toBytes("lieu"), Bytes.toBytes("ville"), Bytes.toBytes("Montpellier"));
        montpellier.add(Bytes.toBytes("lieu"), Bytes.toBytes("departement"), Bytes.toBytes("Herault"));
        montpellier.add(Bytes.toBytes("lieu"), Bytes.toBytes("region"), Bytes.toBytes("Occitanie"));
        montpellier.add(Bytes.toBytes("pop"), Bytes.toBytes("NbHabitant"), Bytes.toBytes("257000"));


        Put nimes = new Put(Bytes.toBytes("2"));
        nimes.add(Bytes.toBytes("lieu"), Bytes.toBytes("departement"), Bytes.toBytes("Gard"));
        nimes.add(Bytes.toBytes("lieu"), Bytes.toBytes("ville"), Bytes.toBytes("Nimes"));
        nimes.add(Bytes.toBytes("lieu"), Bytes.toBytes("region"), Bytes.toBytes("Occitanie"));
        nimes.add(Bytes.toBytes("pop"), Bytes.toBytes("NbHabitant"), Bytes.toBytes("175000"));


        Put paris = new Put(Bytes.toBytes("2"));
        paris.add(Bytes.toBytes("lieu"), Bytes.toBytes("ville"), Bytes.toBytes("Paris"));
        paris.add(Bytes.toBytes("lieu"), Bytes.toBytes("region"), Bytes.toBytes("Ile de france"));
        paris.add(Bytes.toBytes("pop"), Bytes.toBytes("NbHabitant"), Bytes.toBytes("2240000"));


        System.out.println("Table " + commune + " exist: " +
                admin.tableExists(commune));
        HTableFactory factory = new HTableFactory();
        if (!admin.tableExists(commune)) {
            admin.createTable(pe);
        }
        HTableInterface pi = factory.createHTableInterface(conf, commune);
        pi.put(montpellier);
        pi.put(nimes);
        pi.put(paris);
        System.out.println("creation et insertion achevees");
        pi.flushCommits();
        pi.close();

    }
}
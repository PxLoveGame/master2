package mains;

import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.coprocessor.AggregationClient;
import org.apache.hadoop.hbase.client.coprocessor.LongColumnInterpreter;
import org.apache.hadoop.hbase.coprocessor.ColumnInterpreter;
import org.apache.hadoop.hbase.filter.PrefixFilter;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;

public class PopulationSomme {

    private static final byte[] TABLE_NAME = Bytes.toBytes("commune");
    private static final byte[] general = Bytes.toBytes("general");
    private static final byte[] population = Bytes.toBytes("population");
    public static void main(String[] args) throws Throwable {

        Configuration configuration = HBaseConfiguration.create();
        AggregationClient aggregationClient = new AggregationClient(
                configuration);
        Scan scan = new Scan();
        scan.addFamily(general);
       
      
       
        long rowCount = aggregationClient.rowCount(TABLE_NAME, null, scan);
        System.out.println("row count is " + rowCount);

    }
    
    /*
    
    public static double sum(String tableName, String family, String qualifier, Configuration cfg) {
    	AggregationClient ac = new AggregationClient(cfg);  
    	Scan scan = new Scan();
    	scan.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier));
    	double sum = 0;
    	try {
    		sum = ac.sum(Bytes.toBytes(tableName), new DoubleColumnInterpreter(), scan);
    	} catch (Throwable e) {
    		// logger.info(e.getMessage(), e);
    	}  
    	return sum;
    }

    */
}

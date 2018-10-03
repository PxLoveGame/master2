package mains;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapreduce.TableMapReduceUtil;
import org.apache.hadoop.hbase.mapreduce.TableMapper;
import org.apache.hadoop.hbase.mapreduce.TableReducer;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;

/**
* compte nombre usagers
*
*/
public class MR_CountCommunes {

public static class Mapper1 extends TableMapper<Text, IntWritable>  {
  public static final byte[] CF = "departement".getBytes();
  public static final byte[] ATTR1 = "numDep".getBytes();

  private final IntWritable ONE = new IntWritable(1);
  private Text text = new Text();

  public void map(ImmutableBytesWritable row, Result value, Context context) throws IOException, InterruptedException {
    String val = new String(value.getValue(CF, ATTR1));
    text.set(val);     // we can only emit Writables...
    context.write(text, ONE);
  }
}
    	
    
    public static class Reducer1 extends TableReducer<Text, IntWritable, ImmutableBytesWritable>  {
    	  public static final byte[] CF = "details".getBytes();
    	  public static final byte[] COUNT = "count".getBytes();

    	  public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
    	//    Integer i = 0;
    		  int i = 0;
    	    for (IntWritable val : values) {
    	      i += val.get();
    	    }
    	    Put put = new Put(Bytes.toBytes(key.toString()));
    //	    put.add(CF, COUNT, Bytes.toBytes(i.toString()));
    	    put.add(CF, COUNT, Bytes.toBytes(i));
    	    context.write(null, put);
    	  }
    	}
    
    
    // penser a construire summary_communes avec la CF details
    // create 'summary_communes','details'
    public static void main(String[] args) throws Exception {
        Configuration conf = HBaseConfiguration.create();
        Job job = new Job(conf, "MR_CountCommunes");
        job.setJarByClass(MR_CountCommunes.class);
        Scan scan = new Scan();
        String columns = "departement"; // comma seperated
        scan.addFamily(Bytes.toBytes(columns));
       // scan.setFilter(new FirstKeyOnlyFilter());
        TableMapReduceUtil.initTableMapperJob("commune", scan, Mapper1.class, Text.class,
                IntWritable.class, job);
        TableMapReduceUtil.initTableReducerJob("summary_communes", Reducer1.class, job);
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
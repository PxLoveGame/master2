package mains;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;


import java.io.IOException;


public class Summary_CommunesScan {

  public static void main(String[] args) throws IOException {
    Configuration conf = HBaseConfiguration.create();

    HTable table = new HTable(conf, "summary_communes");
    byte[] general = Bytes.toBytes("details"); 
    byte[] name = Bytes.toBytes("count"); 

    Scan scan = new Scan();
    
    scan.addColumn(general, name);

    ResultScanner scanner = table.getScanner(scan);
         for (Result result = scanner.next(); (result != null); result = scanner.next()) {
         for(KeyValue keyValue : result.list()) {
         System.out.println("code dep : "  + Bytes.toString(keyValue.getRow()) + 
        		 " : nbre communes : " + Bytes.toInt(keyValue.getValue()));
       }  
                      }
    table.close();     
}}
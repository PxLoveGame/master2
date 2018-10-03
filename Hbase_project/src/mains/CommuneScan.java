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


public class CommuneScan {

  public static void main(String[] args) throws IOException {
    Configuration conf = HBaseConfiguration.create();
    HTable table = new HTable(conf, "commune");
    byte[] identite = Bytes.toBytes("departement"); 
    byte[] nom = Bytes.toBytes("numDep"); 
    
    Scan scan = new Scan();
    scan.addColumn(identite, nom);
    ResultScanner scanner = table.getScanner(scan);
         for (Result result = scanner.next(); (result != null); result = scanner.next()) {
         for(KeyValue keyValue : result.list()) {
        // System.out.println("Qualifier : "  + keyValue.getKeyString() + 
        System.out.println("Qualifier : "  + Bytes.toString(keyValue.getQualifier()) + 
        		 " : Value : " + Bytes.toString(keyValue.getValue()));
       } }
         
  table.close();
  }}
package mains;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.KeyValue;

import java.io.IOException;


public class ParcoursScan {
	
	
	
    public static void dumpResult(Result rec)
    {
        // Pour chaque valeur - identification par colonne
        for(KeyValue kv : rec.list())
        {
            String val = Bytes.toString(kv.getValue());
            System.out.println(new String(kv.getFamily()) +
                               ":" + new String(kv.getQualifier()) +
                               " => " + val);
        }
    }

    public static void getCount (String tableName, Configuration conf) {
        try{
             HTable table = new HTable(conf, tableName);
             Scan s = new Scan();
             ResultScanner ss = table.getScanner(s);
             int Compteur = 0;
         //    for (Result rs = ss.next(); rs != null; rs = ss.next()) { Compteur++; } 
         //    System.out.print("nombre de tuples "+Compteur);
            for(Result r:ss){   Compteur++;   }                
                    System.out.print("nombre de tuples "+Compteur);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void getAllRecords (String tableName, Configuration conf) {
        try{
             HTable table = new HTable(conf, tableName);
             Scan s = new Scan();
             ResultScanner ss = table.getScanner(s);
             for(Result r:ss){
                 for(KeyValue kv : r.raw()){
                    System.out.print(new String(kv.getRow()) + " ");
                    System.out.print(new String(kv.getFamily()) + ":");
                    System.out.print(new String(kv.getQualifier()) + " ");
                    System.out.print(kv.getTimestamp() + " ");
                    System.out.println(new String(kv.getValue()));
                 }
             }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        Configuration conf = HBaseConfiguration.create();
        HTable table = new HTable(conf, "commune");

        Get retr = new Get(Bytes.toBytes("34172"));
        Result rec = table.get(retr);

        dumpResult(rec);
        
        getAllRecords("commune",conf);
        getCount("commune",conf);
        table.close();
    }
}
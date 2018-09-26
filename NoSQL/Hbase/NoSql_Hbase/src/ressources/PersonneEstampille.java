package ressources;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.client.Result;

import java.io.IOException;
import java.util.NavigableMap;
import java.util.Map.Entry;

public class PersonneEstampille {
    public static void main(String[] args) throws IOException {
    	try {
    		Configuration hc = HBaseConfiguration.create();
    		HTable tabl = new HTable(hc,"personne");
    		Get get = new Get(Bytes.toBytes("2860738256345"));
    		get.addFamily(Bytes.toBytes("contact"));
    		get.setMaxVersions(Integer.MAX_VALUE);
    		Result result = tabl.get(get);
    		NavigableMap<byte[],NavigableMap<byte[],NavigableMap<Long,byte[]>>> map =
    		result.getMap();
    		for (Entry<byte[], NavigableMap<byte[], NavigableMap<Long,
    		byte[]>>> columnFamilyEntry : map.entrySet())
    		{NavigableMap<byte[],NavigableMap<Long,byte[]>> columnMap =
    		columnFamilyEntry.getValue();
    		for( Entry<byte[], NavigableMap<Long, byte[]>> columnEntry :
    		columnMap.entrySet())
    		{	NavigableMap<Long,byte[]> cellMap =
    		columnEntry.getValue();
    		for ( Entry<Long, byte[]> cellEntry : cellMap.entrySet())
    		{
    		System.out.println(String.format("Key : %s, Value : %s", Bytes.toString(columnEntry.getKey()),
    		Bytes.toString(cellEntry.getValue())));}
    		}	}
    		}
    		catch (IOException e) {
    		e.printStackTrace();
    		}
    }  
}
//get 'personne', '2860738256345', {COLUMN=>'contact:prenom',VERSIONS=>3}

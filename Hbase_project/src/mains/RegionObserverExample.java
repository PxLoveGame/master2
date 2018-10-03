package mains;

import java.io.IOException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.coprocessor.BaseRegionObserver;
import org.apache.hadoop.hbase.coprocessor.ObserverContext;
import org.apache.hadoop.hbase.coprocessor.RegionCoprocessorEnvironment;
import org.apache.hadoop.hbase.regionserver.HRegion;
import org.apache.hadoop.hbase.util.Bytes;

public class RegionObserverExample extends BaseRegionObserver {
    public static final Log LOG = LogFactory.getLog(HRegion.class);
    public static final byte[] FIXED_ROW = Bytes.toBytes("@@@GETTIME@@@");

    @Override
    public void preGet(ObserverContext<RegionCoprocessorEnvironment> c,
            Get get, List<KeyValue> result) throws IOException {
        LOG.debug("Got preGet for row: " + Bytes.toStringBinary(get.getRow()));
        
        if (Bytes.equals(get.getRow(), FIXED_ROW)) {
            KeyValue kv = new KeyValue(get.getRow(), FIXED_ROW, FIXED_ROW,
                    Bytes.toBytes(System.currentTimeMillis()));
            LOG.debug("Had a match, adding fake kv: " + kv);
            result.add(kv);
        }
    }
}

//https://www.programering.com/a/MTO4gzNwATc.html
// mettre RegionObserverExample sous forme de jar sous eclipse
// clic droit export jar
// mettre le jar dans lib
// mettre la classe dans property de hbase-site.xml (coproc separes par virgule)
/*
get 'commune','@@@GETTIME@@@'
COLUMN                              CELL
@@@GETTIME@@@:@@@GETTIME@@@        timestamp=9223372036854775807, value=\x00\x00\x01f&\xEA\xEC\xF9
1 row(s) in 5.8510 seconds

Time.at(Bytes.toLong( "\x00\x00\x01f&\xEA\xEC\xF9".to_java_bytes) / 1000 ) 

*
*
*/

/*
 * disable 'commune'
 
alter 'commune', METHOD => 'table_att',
'coprocessor'=>'|org.apache.hadoop.hbase.coprocessor.AggregateImplementation||'

enable 'commune'

alter 'commune', METHOD => 'table_att',
'coprocessor'=>'|hbase.communes.coprocesseurs.RegionObserverExample||'

*/
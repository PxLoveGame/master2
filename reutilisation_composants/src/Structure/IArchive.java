package Structure;

import java.util.Collection;
import java.util.HashMap;

public interface IArchive
//interface Structure.IArchive
{
    public boolean add(ElementStockage e) ;
    public HashMap getContent() ;
    public void extract() ;
    public Collection findR(String name) ;
}

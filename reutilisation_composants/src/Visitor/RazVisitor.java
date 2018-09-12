package Visitor;

import Structure.*;

import java.util.HashMap;
import java.util.Map;

public class RazVisitor extends Visitor {

    @Override
    public void visitConcreteArchive(Archive archive) {
        HashMap<String,ElementStockage> map = archive.getContent();

        for (Map.Entry<String, ElementStockage> entry : map.entrySet()) {
            String name = entry.getKey();
            ElementStockage value = entry.getValue();

            if(value instanceof Directory){
                visitConcreteDirectory(value);
            }
            else if(value instanceof Link){
                visitConcreteLink(value);
            }
            else if(value instanceof Symlink){
                visitConcreteSymlink(value);
            }
            else {
                visitConcreteFile(value);
            }
        }

    }

    @Override
    public void visitConcreteFile(ElementStockage file) {

    }

    @Override
    public void visitConcreteLink(ElementStockage link) {

    }

    @Override
    public void visitConcreteSymlink(ElementStockage symlink) {

    }

    @Override
    public void visitConcreteDirectory(ElementStockage directory) {

    }
}

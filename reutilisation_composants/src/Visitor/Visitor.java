package Visitor;

import Structure.*;

public abstract class Visitor
{

    public abstract void visitConcreteArchive(Archive archive);
    public abstract void visitConcreteFile(ElementStockage file);
    public abstract void visitConcreteLink(ElementStockage link);
    public abstract void visitConcreteSymlink(ElementStockage symlink);
    public abstract void visitConcreteDirectory(ElementStockage directory);

}

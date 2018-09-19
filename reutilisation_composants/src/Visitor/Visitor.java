package Visitor;

import Structure.*;

public abstract class Visitor
{

    public abstract void visitConcreteArchive(Archive archive);
    public abstract void visitConcreteFile(File file);
    public abstract void visitConcreteLink(Link link);
    public abstract void visitConcreteSymlink(Symlink symlink);
    public abstract void visitConcreteDirectory(Directory directory);

}

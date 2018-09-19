package Visitor;

import Structure.*;

public class CountVisitor extends Visitor
{

    private int count = 0;

    @Override
    public void visitConcreteArchive(Archive archive) {

    }

    @Override
    public void visitConcreteFile(File file) {
        if(file.size() > 10){
            count++;
        }
    }

    @Override
    public void visitConcreteLink(Link link) {

    }

    @Override
    public void visitConcreteSymlink(Symlink symlink) {

    }

    @Override
    public void visitConcreteDirectory(Directory directory) {

    }

    public int getCount(){
        return count;
    }
}

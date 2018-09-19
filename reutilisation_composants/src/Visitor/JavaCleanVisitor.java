package Visitor;

import Structure.*;

import java.util.ArrayList;

public class JavaCleanVisitor extends Visitor {

    private Imatcher matcher;
    private ArrayList<ElementStockage> trash = new ArrayList<>();

    public JavaCleanVisitor(Imatcher m){
        matcher = m;
    }

    @Override
    public void visitConcreteArchive(Archive archive) {

    }

    @Override
    public void visitConcreteFile(File file) {
        if(matcher.match(file)){
            trash.add(file);
        }
    }

    @Override
    public void visitConcreteLink(Link link) {
        if(matcher.match(link)){
            trash.add(link);
        }
    }

    @Override
    public void visitConcreteSymlink(Symlink symlink) {
        if(matcher.match(symlink)){
            trash.add(symlink);
        }
    }

    @Override
    public void visitConcreteDirectory(Directory directory) {
        for(ElementStockage e : trash){
            boolean b = directory.remove(e);
            System.err.println("suppression ? " + b);
        }

    }
}

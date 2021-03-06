package Visitor;

import Structure.*;

import java.util.HashMap;
import java.util.Map;

public class RazVisitor extends Visitor {

    @Override
    public void visitConcreteArchive(Archive archive) {


    }

    @Override
    public void visitConcreteFile(File file) {
        file.setContents("");
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
}

package Visitor;


import Structure.*;

import javax.xml.bind.Element;
import java.util.ArrayList;


public class FindVisitor extends Visitor {


    private ArrayList<String> absoluteAdresses = new ArrayList<>();
    private String nameToFind;

    public FindVisitor(String name){
        this.nameToFind = name;
    }

    @Override
    public void visitConcreteArchive(Archive archive) {
        if(archive.getName().equals(nameToFind)){
            absoluteAdresses.add(archive.absoluteAdress());
        }
    }

    @Override
    public void visitConcreteFile(File file) {
        if(file.getName().equals(nameToFind)){
            absoluteAdresses.add(file.absoluteAdress());
        }
    }

    @Override
    public void visitConcreteLink(Link link) {
        if(link.getName().equals(nameToFind)){
            absoluteAdresses.add(link.absoluteAdress());
        }
    }

    @Override
    public void visitConcreteSymlink(Symlink symlink) {
        if(symlink.getName().equals(nameToFind)){
            absoluteAdresses.add(symlink.absoluteAdress());
        }
    }

    @Override
    public void visitConcreteDirectory(Directory directory) {
        if(directory.getName().equals(nameToFind)){
            absoluteAdresses.add(directory.absoluteAdress());
        }
    }

    public ArrayList<String> getAbsoluteAdresses(){
        return absoluteAdresses;
    }

}

package structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite in the composite pattern
public class Directory extends File {

    private List<File> children = new ArrayList<>();

    public Directory(String name){
        super(name);
    }

    @Override
    public void ls() {

    }

    @Override
    public void addFile(File file) {

    }

    @Override
    public File[] getFiles() {
        return new File[0];
    }

    @Override
    public boolean removeFile(File file) {
        return false;
    }
}
